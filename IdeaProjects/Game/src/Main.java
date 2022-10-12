import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;


        Message.startMessage();
        Choices.printAllChoices();
        choice = scanner.nextInt();

        if (choice == 1) {
            Choices.printRightChoice();
            Choices.printAllChoices();
            choice = scanner.nextInt();
            if (choice == 2) {
                Choices.printRightChoice();
                Choices.printAllChoices();
                choice = scanner.nextInt();
                if (choice == 3) {
                    Choices.printRightChoice();
                    Choices.printAllChoices();
                    choice = scanner.nextInt();
                    if (choice == 1) {
                        Choices.printRightChoice();
                        Choices.printAllChoices();
                        choice = scanner.nextInt();
                        if (choice == 3) {
                            Choices.printWinMessage();
                        } else if (choice == 1) {
                            Choices.printWrongChoice();
                        } else if (choice == 2) {
                            Choices.printWrongChoice();
                        }
                    } else if (choice == 2) {
                        Choices.printWrongChoice();
                    } else if (choice == 3) {
                        Choices.printWrongChoice();
                    }
                } else if (choice == 1) {
                    Choices.printWrongChoice();
                } else if (choice == 2) {
                    Choices.printWrongChoice();
                }
            } else if (choice == 1) {
                Choices.printWrongChoice();
            } else if (choice == 3) {
                Choices.printWrongChoice();
            }

        } else if (choice == 2) {
            Choices.printWrongChoice();
        } else if (choice == 3) {
            Choices.printWrongChoice();
        }
    }
}