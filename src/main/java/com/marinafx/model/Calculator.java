package com.marinafx.model;

import com.marinafx.commands.Operation;
import com.marinafx.exception.NoSuchOperationExists;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

public class Calculator {

    private List<Operation> history;
    private BeanFactory beanFactory;

    @Autowired
    public Calculator(BeanFactory beanFactory){
        history = new ArrayList<>();
        this.beanFactory = beanFactory;
    }

    public List<Operation> getHistory() {
        return history;
    }

    public double execute(double x, double y, String newOp){
        try {
            Operation operation = (Operation) beanFactory.getBean(newOp);
            operation.setX(x);
            operation.setY(y);
            history.add(operation);
            return operation.calculate();
        } catch (NoSuchBeanDefinitionException e){
            throw new NoSuchOperationExists("No operations of such \"" + newOp + "\" were found");
        }
    }

}