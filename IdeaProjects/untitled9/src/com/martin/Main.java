package com.martin;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         System.out.println("Ange två heltal:" );
         int x = scanner.nextInt();
         int y = scanner.nextInt();
         int z = scanner.nextInt();
         int a = scanner.nextInt();
        add(x, y, z, a);


         
    }

    private static void add(int x, int y, int z, int a) {
        System.out.println(x + y * z % a);
    }
}
