import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
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
        System.out.println("8. Square Root (√)");

        int choice = scanner.nextInt();
        BigDecimal num1 = BigDecimal.ZERO;
        BigDecimal num2 = BigDecimal.ZERO;

        if (choice >= 1 && choice <= 6) {  // Check for arithmetic operations
            System.out.print("Enter first number: ");
            num1 = scanner.nextBigDecimal();
            System.out.print("Enter second number: ");
            num2 = scanner.nextBigDecimal();
        }

        switch (choice) {
            case 1: // Addition
                BigDecimal result = num1.add(num2);
                System.out.println("Result: " + num1 + " + " + num2 + " = " + result);
                break;

            case 2: // Subtraction
                result = num1.subtract(num2);
                System.out.println("Result: " + num1 + " - " + num2 + " = " + result);
                break;

            case 3: // Multiplication
                result = num1.multiply(num2);
                System.out.println("Result: " + num1 + " * " + num2 + " = " + result);
                break;

            case 4: // Division
                if (num2.compareTo(BigDecimal.ZERO) != 0) {
                    result = num1.divide(num2, 10, RoundingMode.HALF_UP);
                    System.out.println("Result: " + num1 + " / " + num2 + " = " + result);
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                }
                break;

            case 5: // Exponentiation
                result = num1.pow(num2.intValueExact());
                System.out.println("Result: " + num1 + " ^ " + num2 + " = " + result);
                break;

            case 6: // Division (Quotient & Remainder)
                if (num2.compareTo(BigDecimal.ZERO) != 0) {
                    BigDecimal[] quotientAndRemainder = num1.divideAndRemainder(num2);
                    BigDecimal quotient = quotientAndRemainder[0];
                    BigDecimal remainder = quotientAndRemainder[1];
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

            case 8: // Square Root
                System.out.print("Enter the number: ");
                num1 = scanner.nextBigDecimal();
                result = num1.sqrt(new java.math.MathContext(10)); // Square root with precision
                System.out.println("Result: √" + num1 + " = " + result);
                break;

            default:
                System.out.println("Invalid choice! Please choose a valid operation.");
                break;
        }

    
    }
}
