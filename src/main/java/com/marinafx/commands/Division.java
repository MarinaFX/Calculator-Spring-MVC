package com.marinafx.commands;

public class Division extends Operation{
    @Override
    public double calculate() {
        if (getY() == 0)
            throw new ArithmeticException("Division by 0 is undefined");

        return getX() / getY();
    }

    @Override
    public String toString() {
        return "Operation: Division\n" + "Expression: " + getX() + " / " + getY();
    }
}
