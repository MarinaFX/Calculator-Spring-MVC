# A simple calculator made with Spring-MVC

## This project was originally build using only Spring framework. Due to a university assignment, here follows it`s version using Spring-MVC.  

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

LABEL maintainer="github.com/MarinaFX"

COPY ./build/libs/Calculator-1.0.0.war /usr/local/tomcat/webapps/

EXPOSE 80

CMD ["catalina.sh", "run"]
```


## Wrapping the application into a docker container
As stated above, this is still incomplete by the time I write, but I plan to keep learning about Docker and make this work.
Without further due, here follows the step by step to replicate this project, yet incomplete and barely working. 

1. Clone the project locally by typing in your terminal the following: `git clone https://github.com/MarinaFX/Calculator-Spring-MVC.git`
2. Make sure you have docker installed. If not, these links may be useful: 
    1. [Windows](https://docs.docker.com/docker-for-windows/install/)
    2. [Linux](https://docs.docker.com/engine/install/)
    3. [MacOS](https://docs.docker.com/docker-for-mac/install/)
3. Enter the project folder you just cloned. To make sure you are in the right folder, type `ls or ll -lha` in your terminal. The out put should be something similar to: 
    ```
    ll -lha
    total 64K
    drwxrwxr-x 8 marina marina 4,0K out 14 20:48 ./
    drwxr-xr-x 4 marina marina 4,0K out 14 18:48 ../
    drwxrwxr-x 6 marina marina 4,0K out 14 20:00 build/
    -rw-rw-r-- 1 marina marina  591 out 14 18:49 build.gradle
    -rw-rw-r-- 1 marina marina  161 out 14 20:22 Dockerfile
    drwxrwxr-x 8 marina marina 4,0K out 14 20:38 .git/
    -rw-rw-r-- 1 marina marina   61 out 14 18:49 .gitignore
    drwxrwxr-x 5 marina marina 4,0K out 14 19:39 .gradle/
    drwxrwxr-x 3 marina marina 4,0K out 14 18:49 gradle/
    -rw-rw-r-- 1 marina marina 5,2K out 14 18:49 gradlew
    -rw-rw-r-- 1 marina marina 2,2K out 14 18:49 gradlew.bat
    drwxrwxr-x 4 marina marina 4,0K out 14 20:48 .idea/
    -rw-rw-r-- 1 marina marina 2,6K out 14 20:48 README.md
    -rw-rw-r-- 1 marina marina   34 out 14 18:49 settings.gradle
    drwxrwxr-x 3 marina marina 4,0K out 14 18:49 src/
    ``` 
4. To build the image of the container run in the terminal: `docker build . -t calculator:latest`
5. After building the image, execute the container: `docker run -d -p 8080:8080 calculator`
6. Test it => [here](https://localhost:8080/index.jsp)

The image of the container can also be found by clicking [here](https://hub.docker.com/repository/docker/marifx/calculator-tomcat)

Thanks for trying out :D 🤘🤘