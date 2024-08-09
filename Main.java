import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Simple Calculator");
        System.out.println("Choose an operation:");
        System.out.println("1. Addition (+)");
        System.out.println("2. Subtraction (-)");
        System.out.println("3. Multiplication (*)");
        System.out.println("4. Division (/)");
        System.out.println("5. Exponentiation (^)");
        System.out.println("6. Division (Quotient & Remainder)");
        System.out.println("7. Factorial (!)");

        int choice = scanner.nextInt();
        double num1 = 0.0;
        double num2 = 0.0;

        if (choice >= 1 && choice <= 6) {  // Check for arithmetic operations
            System.out.print("Enter first number: ");
            num1 = scanner.nextDouble();
            System.out.print("Enter second number: ");
            num2 = scanner.nextDouble();
        }

        switch (choice) {
            case 1: // Addition
                double result = num1 + num2;
                System.out.println("Result: " + num1 + " + " + num2 + " = " + result);
                break;

            case 2: // Subtraction
                result = num1 - num2;
                System.out.println("Result: " + num1 + " - " + num2 + " = " + result);
                break;

            case 3: // Multiplication
                result = num1 * num2;
                System.out.println("Result: " + num1 + " * " + num2 + " = " + result);
                break;

            case 4: // Division
                if (num2 != 0) {
                    result = num1 / num2;
                    System.out.println("Result: " + num1 + " / " + num2 + " = " + result);
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                }
                break;

            case 5: // Exponentiation
                result = Math.pow(num1, num2);
                System.out.println("Result: " + num1 + " ^ " + num2 + " = " + result);
                break;

            case 6: // Division (Quotient & Remainder)
                if (num2 != 0) {
                    int quotient = (int) Math.floor(num1 / num2);
                    double remainder = num1 % num2;
                    System.out.println("Result:");
                    System.out.println("Quotient: " + quotient);
                    System.out.println("Remainder: " + remainder);
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                }
                break;

            case 7: // Factorial
                System.out.print("Enter a non-negative integer: ");
                int number = scanner.nextInt();
                if (number < 0) {
                    System.out.println("Error: Factorial is not defined for negative numbers.");
                } else {
                    BigInteger factorial = BigInteger.ONE;
                    for (int i = 1; i <= number; i++) {
                        factorial = factorial.multiply(BigInteger.valueOf(i));
                    }
                    System.out.println("Result: " + number + "! = " + factorial);
                }
                break;

            default:
                System.out.println("Invalid choice! Please choose a valid operation.");
                break;
        }

       
    }
}