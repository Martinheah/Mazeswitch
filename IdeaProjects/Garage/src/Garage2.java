import java.util.Scanner;

public class Garage2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int totalParkingSpots = 50;
        int totalCarsInTheGarage = 40;
        int carsGoingIn = scanner.nextInt();
        int carsGoingOut = scanner.nextInt();
        totalCarsInTheGarage += carsGoingIn;
        totalCarsInTheGarage -= carsGoingOut;

        System.out.println(" How many Cars are entering?");
    }
}
