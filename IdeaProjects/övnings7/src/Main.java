import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int answer;
        Scanner scanner = new Scanner(System.in);
        Messages message = new Messages();

        message.welcome();
        message.howOldAreYou();
        answer = scanner.nextInt();

        if (answer > 65) {
            message.pensioneer();
            message.yourPriceIs();
            System.out.println(Discount.discountPensioner(40) + "kr");
        } else if (answer <= 18) {
            message.teenager();
            message.yourPriceIs();
            System.out.println(Discount.discountTeenager(40) + "kr");
        }


    }


}
