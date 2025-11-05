// Simple program to demonstrate try and catch in Java
import java.util.Scanner;

class TryCatchExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Let's do a simple division!");
            System.out.print("Enter first number: ");
            int a = sc.nextInt();

            System.out.print("Enter second number: ");
            int b = sc.nextInt();

            int result = a / b; // risky part – can cause exception
            System.out.println("Result = " + result);
        } 
        catch (ArithmeticException e) {
            System.out.println("Oops! You tried to divide by zero. Please try again with a valid number.");
        }

        System.out.println("Program continues... No crash ");
    }
}
