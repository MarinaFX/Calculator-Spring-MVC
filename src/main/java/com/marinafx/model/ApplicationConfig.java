package com.marinafx.model;

import com.marinafx.commands.*;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
@ComponentScan(basePackages = "com.marinafx")
public class ApplicationConfig {

    @Bean
    @Autowired
    public Calculator calculator(BeanFactory beanFactory){
        return new Calculator(beanFactory);
    }

    @Bean(name = "sum")
    @Scope(value = "prototype")
    public Addition sum(){
        return new Addition();
    }

    @Bean(name = "sub")
    @Scope(value = "prototype")
    public Subtraction sub(){
        return new Subtraction();
    }

    @Bean(name = "multiplication")
    @Scope(value = "prototype")
    public Multiplication multiply(){
        return new Multiplication();
    }

    @Bean(name = "division")
    @Scope(value = "prototype")
    public Division divide(){
        return new Division();
    }

    @Bean(name = "pow")
    @Scope(value = "prototype")
    public Pow pow(){
        return new Pow();
    }
}
