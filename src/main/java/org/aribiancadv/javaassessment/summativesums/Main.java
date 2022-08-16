package org.aribiancadv.javaassessment.summativesums;

public class Main {

    public static void main(String[] args) {

        int[] array1 = { 1, 90, -33, -55, 67, -16, 28, -55, 15 };
        int[] array2 = { 999, -60, -77, 14, 160, 301 };
        int[] array3 = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 110, 120, 130,
                140, 150, 160, 170, 180, 190, 200, -99 };

        arrayPrinter(1, array1);
        arrayPrinter(2, array2);
        arrayPrinter(3, array3);


    }
    private static void arrayPrinter(int arrayCount, int[] anArray){
        int arraySum = 0;

        for (int j : anArray) {
            arraySum += j;
        }
        System.out.println("#" + arrayCount + " Array Sum: " + arraySum);

    }

}
