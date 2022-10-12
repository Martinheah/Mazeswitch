package com.martin;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ange två tal: ");
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        add(x, y);

    }

    private static void add(int x, int y) {
        System.out.println(x + y);
    }
}
