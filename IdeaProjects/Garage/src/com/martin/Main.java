package com.martin;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int totalParkingSpots = 50;
        int totalCarsInTheGarage = 40;
        // 20 bilar lämnar garaget
        totalCarsInTheGarage -= 20;
        System.out.println("Nu är det totalt " + totalCarsInTheGarage + " Bilar i Garaget");
        // 3 bilar kommer in till garaget
        totalCarsInTheGarage += 3;
        System.out.println("Nu är det totalt "+ totalCarsInTheGarage + " Bilar i garaget");
        // 5 bilar lämnar garaget
        totalCarsInTheGarage -= 5;
        System.out.println("Nu är det totalt "+ totalCarsInTheGarage + " Bilar i garaget");
        // 4 bilar kommer in till garaget
        totalCarsInTheGarage += 4;
        System.out.println("Nu är det totalt "+ totalCarsInTheGarage + " Bilar i garaget");
        // 20 bilar kommer in till garaget
        totalCarsInTheGarage += 20;
        System.out.println("Nu är det totalt "+ totalCarsInTheGarage + " Bilar i garaget");
        // 9 bilar kommer in till garaget
        totalCarsInTheGarage += 9;
        System.out.println("Nu är det totalt "+ totalCarsInTheGarage + " Bilar i garaget");

        if(totalParkingSpots < totalCarsInTheGarage) {
            System.out.println("Garaget är fullt");
        } else if (totalParkingSpots > totalCarsInTheGarage) {
            System.out.println(" Det finns plats i garaget");
        }
    }
}
