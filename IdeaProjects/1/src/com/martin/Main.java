package com.martin;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Mata in ett tal: ");
        Scanner scanner = new Scanner(System.in);
        while (true) {
            int tal = scanner.nextInt();
            int kvadrat = tal * tal;
            if (tal == 0) {
                System.out.println("Programmet avslutas ");
                break;
            }
            System.out.println(kvadrat);
        }
    }
}


