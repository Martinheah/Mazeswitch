package com.martin;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double sek;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ange en summa:");
        sek = scanner.nextDouble();
        convert(sek);
    }

    private static void convert(double sek) {
        double euro = sek * 0.094;
    System.out.println(sek + " sek motsvarar "+ euro + " i euro");

    }
}
