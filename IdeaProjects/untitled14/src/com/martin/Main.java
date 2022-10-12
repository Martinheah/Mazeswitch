package com.martin;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int randomNumber = new Random().nextInt(1000000);
        int nrOfTriesLeft = 20;
        int guess;
        System.out.println("Welcome to 20 Questions: ");
        while(nrOfTriesLeft > 0) {
            System.out.println("Gissningar kvar "+ nrOfTriesLeft);
            System.out.println("Ange ett tal. Tryck enter");
            guess = scanner.nextInt();
            if(guess == randomNumber) {
                System.out.println("Grattis du gissade rätt!");
                System.out.println("Spelet Avslutas Nu! ");
                nrOfTriesLeft = 0;
            } else if(guess < randomNumber) {
                System.out.println("För lågt!");
            } else {
                System.out.println("För Högt!");
            }
            nrOfTriesLeft--;
            if(nrOfTriesLeft == 0) {
                System.out.println("Tyvärr inga gissningar kvar, Spelet avslutas nu! ");



            }

        }
    }
}
