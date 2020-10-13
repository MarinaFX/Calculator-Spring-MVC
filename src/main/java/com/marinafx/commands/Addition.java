package com.marinafx.commands;


public class Addition extends Operation{

    @Override
    public double calculate(){
        return getX() + getY();
    }

    @Override
    public String toString() {
        return "Operation: Addition\n" + "Expression: " + getX() + " + " + getY();
    }
}
