package com.pluralsight.calcengine;

public class MathEquation {
    double leftVal;
    double rightVal;
    char opCode;
    double result;

    public void execute() {
        switch (opCode) {
            case 'a':
                result = leftVal + rightVal;
                break;
            case 'd':
                result = leftVal + rightVal;
                break;
            case 'm':
                result = leftVal+ rightVal;
                break;
            case 's':
                result = leftVal + rightVal;
                break;
            default:
                System.out.println("Error - invalid opCode");
                result = 0.0D;
        }
    }
}