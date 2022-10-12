import java.util.Scanner;

public class miniräknare {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Math math = new Math();
        int numberOne;
        int numberTwo;

        System.out.println("What do you wish to do? " + "use one of the following operators");
        System.out.println("[1]: +" + "\n[2]: -" + "\n[3]: *" + "\n[4]: /" + "\n[5]: %modulus");
        int operator = scanner.nextInt();


        if(operator >= 6) {
            System.out.println("Error you have not entered the correct number for the operator method!!");
        }else if(operator == 1) {
            math.addTwoNumbers();
            numberOne = scanner.nextInt();
            numberTwo = scanner.nextInt();
            System.out.println("The answer is: " + math.add(numberOne, numberTwo));
        } else if (operator == 2) {
            math.subtractTwoNumbers();
            numberOne = scanner.nextInt();
            numberTwo = scanner.nextInt();
            System.out.println("The answer is: " + math.subtract(numberOne, numberTwo));
        } else if (operator == 3) {
            math.multiplyTwoNumbers();
            numberOne = scanner.nextInt();
            numberTwo = scanner.nextInt();
            System.out.println("The answer is: " + math.multiply(numberOne, numberTwo));
        } else if (operator == 4) {
            math.divideTwoNumbers();
            numberOne = scanner.nextInt();
            numberTwo = scanner.nextInt();
            System.out.println("The answer is: " + math.divide(numberOne, numberTwo));
        } else if (operator == 5) {
            math.modulusOfTwoNumbers();
            numberOne = scanner.nextInt();
            numberTwo = scanner.nextInt();
            System.out.println("The answer is: " + math.modulus(numberOne, numberTwo));
        }


    }
}
