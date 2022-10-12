public class Choices {
    public static void printWrongChoice() {
        System.out.println("You chose the wrong way, start over");
    }
    public static void printRightChoice() {
        System.out.println("You chose the right way, choose again!");
    }
    public static void printAllChoices () {
        System.out.println("Pick a number to choose your way");
        System.out.println("1: Left");
        System.out.println("2: Straight");
        System.out.println("3: Right");
    }
    public static void printWinMessage () {
        System.out.println("Congratulations, you have won the game!!");
    }
    public static void tryAgain () {
        System.out.println("Try again!");
    }
}
