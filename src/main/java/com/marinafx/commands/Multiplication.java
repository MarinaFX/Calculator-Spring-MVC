package com.marinafx.commands;

public class Multiplication extends Operation{

    @Override
    public double calculate() {
        return getX() * getY();
    }

    @Override
    public String toString() {
        return "Operation: Multiplication\n" + "Expression: " + getX() + " * " + getY();
    }
}
