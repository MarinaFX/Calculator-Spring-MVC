# Simple calculator made with Spring-MVC

## This project was originally build using only Spring framework. Due to an university assignment, here follows it`s version using Spring-MVC.  

### Below, follows the package distribution of the code: 

* com.marinafx
    - commands: this package contains all the functions from the calculator, including: 
        - Interface: interface containing the method to be implemented
            - Operation.
        - Concrete classes: implementations of the interface Operation
            - Addition;
            - Division;
            - Multiplication;
            - Pow (Exponent Power);
            - Subtraction.
    - exception
        - NoSuchOperationExists: custom exception created when any operation of the ones listed above is invoked
    - model
        - ApplicationConfig: spring configuration class. This class maps the beans which will be injected.
        - Calculator: the service class, containing the method `execute()`, which invokes an operation
    - CalculatorController: the controller itself. In this project, I opted for only one controller mapping all the operations as endpoints. E.g.: `localhost:8080/add?n1=3?n2=1`

## The Dockerfile
Being one of my first experiences with Docker, and mainly with `Dockerfile`, the file is still going through maintenance. 
Yet, here follows: 

```
FROM tomcat:8.0
MAINTAINER @https://github.com/MarinaFX

COPY /build/libs/Calculator-1.0.0.war /usr/local/tomcat/webapps/
CMD docker exec -it calculator bash
RUN ls -la usr/local/tomcat/webapps/
CMD bin/catalina.sh start
CMD cat logs/catalina.out
CMD exit

EXPOSE 80
```


## Wrapping the application into a docker container
As stated above, this is still incomplete by the time I write, but I plan to keep learning about Docker and make this work.
Without further due, here follows the step by step to replicate this project, yet incomplete and barely working. 

1. Clone the project locally using: `git clone https://github.com/MarinaFX/Calculator-Spring-MVC.git`
2. Install docker locally
    1. [Windows](https://docs.docker.com/docker-for-windows/install/)
    2. [Linux](https://docs.docker.com/engine/install/)
    3. [MacOS](https://docs.docker.com/docker-for-mac/install/)
3. to build the image of the container run in the terminal: `docker build -t calculator .`
4. after building the image, execute the container: `docker run -t -d -p 80:80 calculator`
5. test it => [here](https://localhost:8080/index.jsp)

Thanks for trying out :D 🤘🤘