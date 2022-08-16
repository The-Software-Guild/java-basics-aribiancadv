package org.aribiancadv.javaassessment.doggenetics;


import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Random randomizer = new Random();
        Scanner userInput = new Scanner(System.in);
        int[] numList = new int[5];


        String dogName;
        int tempSum = 0;

        System.out.println("What is your dog's name?");
        dogName = userInput.nextLine();

        System.out.println("Well then, I have this highly reliable report on " + dogName + "'s prestigious background right here.");
        System.out.println(dogName + " is:");
        System.out.println();
        numList[0] = randomizer.nextInt(20 - 1) + 1;
        tempSum += numList[0];

        for(int i = 1; i < numList.length - 1; i++){
            numList[i] = randomizer.nextInt(20 - 1) + 1;
            tempSum += numList[i];
        }

        numList[4] = 100 - tempSum;

        System.out.println(numList[0] + "% St. Bernard");
        System.out.println(numList[1] + "% Chihuahua");
        System.out.println(numList[2] + "% Dramatic RedNosed Asian Pug");
        System.out.println(numList[3] + "% Common Cur");
        System.out.println(numList[4] + "% King Doberman");
        System.out.println("Wow, that's QUITE the dog!");


    }

}
