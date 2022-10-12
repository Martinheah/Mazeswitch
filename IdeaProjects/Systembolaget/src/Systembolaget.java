import java.util.Scanner;

public class Systembolaget {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int answer;

        System.out.println("How old are you?");
        answer = scanner.nextInt();

        if(answer > 20) {
            System.out.println("You are old enough, have a nice day");
        } else if (answer < 20) {
            System.out.println("You are not old enough");
            System.out.println("come back in " +(20 - answer) + "years");
        } else if (answer == 20) {
            System.out.println("Can you please show your id? If not u cant shop here");
        }
    }
}
