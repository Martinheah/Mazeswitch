import java.util.Scanner;

public class Bordsbokning {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int answer;
       int totalSeatsInRestaurant= 20;
       int seatsPerTable = 4;
       Message totalTablesNeeded = new Message();


       Message message = new Message();
       message.welcome();
       message.numberOfPeople();
       answer = scanner.nextInt();


       if(answer < seatsPerTable) {
           System.out.println(totalTablesNeeded.table[0]);
       } else if (answer == 5 || answer <= 8) {
           System.out.println(totalTablesNeeded.table[1]);
       } else if (answer == 9 || answer <= 12) {
           System.out.println(totalTablesNeeded.table[2]);
       } else if (answer == 13 || answer <= 16) {
           System.out.println(totalTablesNeeded.table[3]);
       } else if (answer == 17 || answer <= 20) {
           System.out.println(totalTablesNeeded.table[4]);
       } else if (answer > totalSeatsInRestaurant) {
           message.notEnoughCapacity();
       }




    }
}
