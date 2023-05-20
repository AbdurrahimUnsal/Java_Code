package com.campany.day22.DiceGame;
import java.util.Random;
import java.util.Scanner;
public class Dice {
    /**
       Write a program that plays a simple dice game between the computer and the user.
      *  When the program runs, a loop should repeat x times. user giving number
      *  Each iteration of the loop should do the following:
      *  Generate a random integer in the range of 1 through 6. for computer
      *  Generate another random integer in the range of 1 through 6. for user
      *  The die with the highest value wins.
      * (In case of a tie, there is no winner for that particular roll of the dice.)
      */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Enter the number of rounds: ");
        int rounds = scanner.nextInt();

        int computerWins = 0;
        int userWins = 0;

        for (int i = 1; i <= rounds; i++) {
            int computerRoll = random.nextInt(6) + 1;
            int userRoll = random.nextInt(6) + 1;

            System.out.println("Round " + i + ":");
            System.out.println("Computer rolled: " + computerRoll);
            System.out.println("User rolled: " + userRoll);

            if (computerRoll > userRoll) {
                computerWins++;
                System.out.println("Computer wins this round!");
            } else if (userRoll > computerRoll) {
                userWins++;
                System.out.println("User wins this round!");
            } else {
                System.out.println("It's a tie!");
            }

            System.out.println();
        }

        System.out.println("Final Results:");
        System.out.println("Computer wins: " + computerWins);
        System.out.println("User wins: " + userWins);

        if (computerWins > userWins) {
            System.out.println("Computer wins the game!");
        } else if (userWins > computerWins) {
            System.out.println("User wins the game!");
        } else {
            System.out.println("It's a tie game!");
        }
    }

}
