package org.aribiancadv.javaassessment.rockpaperscissors;

import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Random randomizer = new Random();
        Scanner userInput = new Scanner(System.in);

        int userChoiceNum;
        int cpuChoiceNum;
        int totalRounds;
        int roundsPlayed;
        int tieRounds;
        int userWins;
        int cpuWins;
        boolean keepRunning = true;
        String playAgain;

        do {
            userWins = 0;
            cpuWins = 0;
            tieRounds = 0;

            System.out.println("Welcome to Rock, Paper, Scissors!");
            System.out.println("How many rounds would you like to play (min 1, max 10)?");
            totalRounds = Integer.parseInt(userInput.nextLine());

            if (totalRounds < 1 || totalRounds > 10) {
                System.out.println("Incorrect number of rounds, program will now end.");
                System.exit(0);

            }

            for (roundsPlayed = 1; roundsPlayed <= totalRounds; roundsPlayed++) {
                System.out.println("Round " + roundsPlayed);
                System.out.println("Please choose (1) Rock, (2) Paper, or (3) Scissors:");
                userChoiceNum = Integer.parseInt(userInput.nextLine());
                cpuChoiceNum = randomizer.nextInt(3) + 1;
                if (userChoiceNum >= 1 && userChoiceNum <= 3) {


                    if (userChoiceNum == cpuChoiceNum) {
                        System.out.println("Round " + roundsPlayed + " is a tie!");
                        tieRounds++;
                    } else if ((userChoiceNum == 2 && cpuChoiceNum == 1) ||
                            (userChoiceNum == 3 && cpuChoiceNum == 2) || (userChoiceNum == 1 && cpuChoiceNum == 3)) {
                        System.out.println("You win Round " + roundsPlayed + "!");
                        userWins++;

                    } else {
                        System.out.println("CPU wins Round " + roundsPlayed + "!");
                        cpuWins++;
                    }


                } else {
                    System.out.println("Incorrect input.");

                }

            }
            System.out.println("RESULTS:");
            System.out.println("Rounds played: " + (roundsPlayed - 1));
            System.out.println("You won: " + userWins + " rounds.");
            System.out.println("CPU won: " + cpuWins + " rounds.");
            System.out.println("Ties: " + tieRounds + " rounds.");
            if (userWins > cpuWins) {
                System.out.println("You were the overall winner!");
            } else if (userWins == cpuWins) {
                System.out.println("There was no overall winner.");
            } else {
                System.out.println("The CPU was the overall winner.");
            }

            System.out.println("Would you like to play again (Y/N)?");
            playAgain = userInput.nextLine();

            if (Objects.equals(playAgain, "N")) {
                System.out.println("Thanks for playing!");
                keepRunning = false;
            }


        } while (keepRunning);


    }
}

