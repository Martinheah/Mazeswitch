import java.util.Scanner;

public class Garage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int spots = 50;
        int occupiedInTheMorning = 40;
        int answer;
        int spotsLeft = 0;
        int carsGoingIn;
        int carsGoingOut;

        System.out.println("Cars going in or out? \n [1]: Going in \n [2]: Going out");
        answer = scanner.nextInt();

        if(answer == 1) {
            System.out.println("How many cars are going in?");
            carsGoingIn = scanner.nextInt();
            spotsLeft = spots - occupiedInTheMorning - carsGoingIn;
            System.out.println("There are a total of: "
                    + spotsLeft
                    + " spots left in the garage of a maximum of "
                    + spots);
        } else if (answer == 2) {
            System.out.println("How many cars are going out?");
            carsGoingOut = scanner.nextInt();
            spotsLeft = spots - occupiedInTheMorning + carsGoingOut;
            System.out.println("There are a total of: "
                    + spotsLeft
                    + " spots left in the garage of a maximum of "
                    + spots);

        }

    }
}
