import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int choice;

        Messages.welcome();
        Messages.alternatives();
        choice = scanner.nextInt();

        switch (choice) {
            case 1, 2 -> Messages.wrongWay();
            default -> Messages.error();
            case 3 -> {
                Messages.rightWay();
                Messages.alternatives();
                choice = scanner.nextInt();
                switch (choice) {
                    case 1, 3 -> Messages.wrongWay();
                    default -> Messages.error();
                    case 2 -> {
                        Messages.rightWay();
                        Messages.alternatives();
                        choice = scanner.nextInt();
                        switch (choice) {
                            case 1 -> Messages.winner();
                            case 2, 3 -> Messages.wrongWay();
                            default -> Messages.error();
                        }

                    }

                }
            }
        }
    }
}
