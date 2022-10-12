package com.martin;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int guess;
        int nrOfTriesLeft = 20;
        int randomNumber = new Random().nextInt(100000);
        System.out.println("Welcome to 20 questions");
        while (nrOfTriesLeft > 0) {
            System.out.println("Gissningar kvar " + nrOfTriesLeft);
            guess = scanner.nextInt();
        if (guess == randomNumber) {
            System.out.println("Grattis du gissade rätt");
            System.out.println("Spelet avslutas");
            nrOfTriesLeft = 0;
        } else if (guess > randomNumber) {
                System.out.println("För lågt");
            } else {
            System.out.println("För högt");
        }
        nrOfTriesLeft--;
        if (nrOfTriesLeft < 0)
            System.out.println("Inga gissningar kvar");

        }

    }
}
