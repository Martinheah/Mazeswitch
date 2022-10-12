import java.util.Scanner;

public class switching {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int månad;

        System.out.println("Vilken månad är det nu?");
        månad = scanner.nextInt();

        switch(månad) {
            case 1:
                System.out.println("Det är Januari");
                break;
            case 2:
                System.out.println("Det är Februari");
                break;
            case 3:
                System.out.println("Det är Mars");
                break;
            case 4:
                System.out.println("Det är April");
                break;
            case 5:
                System.out.println("Det är Maj");
                break;
            case 6:
                System.out.println("Det är Juni");
                break;
            case 7:
                System.out.println("Det är Juli");
                break;
            case 8:
                System.out.println("Det är Augusti");
                break;
            case 9:
                System.out.println("Det är September");
                break;
            case 10:
                System.out.println("Det är October");
                break;
            case 11:
                System.out.println("Det är November");
                break;
            case 12:
                System.out.println("Det är December");
                break;

        }
    }

}
