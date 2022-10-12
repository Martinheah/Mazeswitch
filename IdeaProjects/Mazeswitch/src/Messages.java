public class Messages {
    public static void welcome() {
        System.out.println("Welcome to the Maze");
    }
    public static void alternatives() {
        System.out.println("Choose your way: [1]: Left, [2]: Straight or [3]: Right");
    }
    public static void wrongWay() {
        System.out.println("You have chosen the wrong way, start over");
    }
    public static void rightWay () {
        System.out.println("You have chosen the right way, keep going!");
    }
    public static void winner () {
        System.out.println("You won the game!");
    }
    public static void error() {
        System.out.println("Unexpected value, try again");
    }
}
