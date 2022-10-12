import java.util.Scanner;

public class Math {
    Scanner scanner = new Scanner(System.in);
    int numberOne;
    int numberTwo;
    public int add(int a, int b) {
        return a + b;
    }
    public int subtract(int a, int b) {
        return a - b;
    }
    public int multiply(int a, int b) {
        return a * b;
    }
    public int divide(int a, int b) {
        return a / b;
    }
    public int modulus(int a, int b) {
        return a % b;
    }
    public void addTwoNumbers() {
        System.out.println("Add two numbers");
    }
    public void subtractTwoNumbers() {
        System.out.println("Subtract two numbers");
    }
    public void multiplyTwoNumbers() {
        System.out.println("Multiply two numbers");
    }
    public void divideTwoNumbers() {
        System.out.println("Divide two numbers");
    }
    public void modulusOfTwoNumbers() {
        System.out.println("Modulus of two numbers");
    }
}
