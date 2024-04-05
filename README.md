Title -Codtech IT Solutiion Task Documentation 
Task Description: The Task assigned to Shanu kr Shukla during the CodTech ITsolution internship program is to write a java program simple calculator with advance features,which implements a simple calculator with advanced features such as addition, subtraction, multiplication, division, exponentiation, square root and the option to quit.

Interm Information-
Name: Shanu Kr Shukla 
Intern ID: COD4904

# Introduction 
This documentation provides a detailed explanation of the task assigned during the CODTECH IT solutions Intrenship program.the task is writing a java program to simple calculator with advanced features such as addition, subtraction, multiplication, division, exponentiation,square and the option to quit. this documentation will cover the implementation details, the rationale behind the code structure, and insights into the programming techniques utilized. additionally,it will include introduction about the intern Shanu Kr Shukla and his assigned ID, COD4904.

# Implementation Code Explanation
public static void main(String[] args) {
        while (true) {
            displayMenu(); // Display the menu options
            int choice = getUserChoice(); // Get user's choice
           if (choice == 7) { // If user chooses to exit
                System.out.println("Exiting Calculator. Goodbye!");
                break; // Exit the loop
            }
 double result = performOperation(choice); // Perform the selected operation
            if (!Double.isNaN(result)) { // If the result is a valid number
                System.out.println("Result: " + result); // Display the result
            }
        }
        scanner.close(); // Close the scanner to prevent resource leak
    }

  // Method to display the menu options
    private static void displayMenu() {
        System.out.println("Select operation:");
        System.out.println("1. Add\n2. Subtract\n3. Multiply\n4. Divide\n5. Exponential\n6. Square Root\n7. Exit");
        System.out.print("Enter Your Choice: ");
    }

   // Method to get user's choice, ensuring it's a valid integer
    private static int getUserChoice() {
        while (!scanner.hasNextInt()) {
            System.out.println("Invalid Input. Please enter a number.");
            scanner.next(); // Consume invalid input
        }
        return scanner.nextInt();
    }

   // Method to perform the selected operation based on user's choice
    private static double performOperation(int choice) {
        double num1, num2;
        switch (choice) {
            case 1:
            case 2:
            case 3:
            case 4:
                System.out.println("Enter First Number:");
                num1 = getValidNumber(); // Get valid first number
                System.out.println("Enter Second Number:");
                num2 = getValidNumber(); // Get valid second number
                return performBasicOperation(choice, num1, num2); // Perform basic arithmetic operation
            case 5:
                System.out.println("Enter a base number:");
                num1 = getValidNumber(); // Get valid base number
                System.out.println("Enter exponent:");
                num2 = getValidNumber(); // Get valid exponent
                return Math.pow(num1, num2); // Perform exponentiation operation
            case 6:
                System.out.println("Enter a Number to find Square Root:");
                num1 = getValidNumber(); // Get valid number to find square root
                return Math.sqrt(num1); // Perform square root operation
            default:
                System.out.println("Invalid Choice. Please choose again.");
                return Double.NaN; // Return NaN (Not a Number) for invalid choice
        }
    }

  // Method to perform basic arithmetic operation
    private static double performBasicOperation(int choice, double num1, double num2) {
        switch (choice) {
            case 1:
                return num1 + num2; // Addition
            case 2:
                return num1 - num2; // Subtraction
            case 3:
                return num1 * num2; // Multiplication
            case 4:
                return num1 / num2; // Division
            default:
                return Double.NaN; // Return NaN for invalid operation
        }
    }

   // Method to get a valid double number from the user
    private static double getValidNumber() {
        while (!scanner.hasNextDouble()) {
            System.out.println("Invalid Input. Please enter a valid number.");
            scanner.next(); // Consume invalid input
        }
        return scanner.nextDouble();
    }
}
# Usage
1. Run the program.
2. The menu will be displayed, prompting you to select an operation.
3. Enter the number corresponding to your desired operation.
4. If the selected operation requires input numbers, enter them when prompted.
5. The result of the operation will be displayed.
6. Repeat steps 2-5 as needed.
7. To exit the calculator, choose option 7.

# Conclusion
The AdvancedCalculator program provides a simple yet versatile calculator functionality, allowing users to perform a variety of arithmetic operations conveniently from the console. With its menu-driven interface and error handling for invalid inputs, it offers a user-friendly experience. This calculator can be further extended or integrated into larger applications as needed.
