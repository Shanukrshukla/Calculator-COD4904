import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        while (true) {
            displayMenu();
            int operator = sc.nextInt();

            if (operator == 6) {
                System.out.println("Calculator is exiting. Goodbye!");
                break;
            }

            if (operator < 1 || operator > 5) {
                System.out.println("Invalid choice. Please choose again.");
                continue;
            }

            System.out.print("Enter first number: ");
            double n1 = sc.nextDouble();
            System.out.print("Enter second number: ");
            double n2 = sc.nextDouble();

            double result = calculate(operator, n1, n2);
            if (!Double.isNaN(result)) {
                System.out.println("Result is " + result);
            }
        }

        sc.close();
    }

    private static void displayMenu() {
        System.out.println("1 - Add\n2 - Subtract\n3 - Multiply\n4 - Divide\n5 - Exponentiation\n6 - Quit");
        System.out.print("Choose operator: ");
    }

    private static double calculate(int operator, double n1, double n2) {
        switch (operator) {
            case 1:
                return n1 + n2;
            case 2:
                return n1 - n2;
            case 3:
                return n1 * n2;
            case 4:
                if (n2 == 0) {
                    System.out.println("Cannot divide by zero.");
                    return Double.NaN;
                }
                return n1 / n2;
            case 5:
                return Math.pow(n1, n2);
            default:
                return Double.NaN;
        }
    }
}
