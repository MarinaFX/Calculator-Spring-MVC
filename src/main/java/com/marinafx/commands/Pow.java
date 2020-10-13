package com.marinafx.commands;

public class Pow extends Operation{

    @Override
    public double calculate() {
        return Math.pow(getX(), getY());
    }

    @Override
    public String toString() {
        return "Operation: Exponentiation\n" + "Expression: " + getX() + " ^ " + getY();
    }
}
