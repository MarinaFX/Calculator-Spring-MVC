package com.marinafx.commands;

public class Subtraction extends Operation{

    @Override
    public double calculate() {
        return getX() - getY();
    }

    @Override
    public String toString() {
        return "Operation: Subtraction\n" + "Expression: " + getX() + " - " + getY();
    }
}
