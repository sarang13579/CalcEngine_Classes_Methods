package com.pluralsight.calcengine;

public class Main {

    public static void main(String[] args) {
//        double[] leftVals = {100.0D, 25.0D, 225.0D, 11.0D};
//        double[] rightVals = {50.0D, 92.0D, 17.0D, 3.0D};
//        char[] opCodes = {'d', 'a', 's', 'm'};
//        double[] results = new double[opCodes.length];

        MathEquation[] equations = new MathEquation[4];
        equations[0] = create(100.d, 50.0d, 'd');
        equations[1] = create(25.0d, 92.0d, 'a');
        equations[2] = create(225.0d, 17.0d, 's');
        equations[3] = create(11.0d, 3.0d, 'm');

        for (MathEquation equation: equations) {
            equation.execute();
            System.out.println("result = " + equation.result);
        }

    }

    public static MathEquation create(double leftVal, double rightVal, char opCode) {
        MathEquation equation = new MathEquation();
        equation.leftVal = leftVal;
        equation.rightVal = rightVal;
        equation.opCode = opCode;

        return  equation;
    }

}
