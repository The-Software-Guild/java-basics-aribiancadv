package org.aribiancadv.javaassessment.healthyhearts;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);
        int userAge;
        int minHeartRateZone;
        int maxHeartRateZone;
        int maxHeartRate;

        System.out.println("What is your age?");
        userAge = Integer.parseInt(userInput.nextLine());
        maxHeartRate = 220 - userAge;

        System.out.println("Your maximum heart rate should be " + maxHeartRate + " beats per minute");
        minHeartRateZone = (int)Math.round(0.5 * maxHeartRate);
        maxHeartRateZone = (int)Math.round(0.85 * maxHeartRate);

        System.out.println("Your target HR Zone is "+ minHeartRateZone + " - " + maxHeartRateZone + " beats per minute");
    }

}
