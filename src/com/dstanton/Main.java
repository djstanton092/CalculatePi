package com.dstanton;

public class Main {

    public static void main(String[] args) {
	/*
	    use the Nilakantha series to calculate pi to 100 digits
	    π = 3 + 4/(2*3*4) - 4/(4*5*6) + 4/(6*7*8) - 4/(8*9*10) + 4/(10*11*12) - 4/(12*13*14)
	 */

        // Integer.MAXVALUE = 2147483647

        int intNumberIterations = 1000000;
        int intValue1;
        int intValue2;
        int intValue3 = 2;
        int y = 1;
        int x = 0;

        double dblPiResult = 3d;
        double NextPiValue;

        String piTarget = new String("3.141592653589793");
        //3.14159265358979323846 - Google
        //3.141592653589787

        do {
            x++;
            intValue1 = intValue3;        //2
            intValue2 = intValue1 + 1;    //3
            intValue3 = intValue2 + 1;    //4

            NextPiValue = 4d / ((double)intValue1 * (double)intValue2 * (double)intValue3);

            if (x % 2 == 1) {
                dblPiResult += NextPiValue;
            } else {
                dblPiResult -= NextPiValue;
            }


        } while ((!String.valueOf(dblPiResult).equals(piTarget)) || (x > intNumberIterations));

        System.out.println("Iterations = " + String.valueOf(x));
        System.out.println("PiResult = " + String.valueOf(dblPiResult));
        System.out.println("Target was " + piTarget);

    }
}
