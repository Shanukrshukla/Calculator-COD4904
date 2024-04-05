Title -Codtech IT Solutiion Task Documentation 
Task Description: The Task assigned to Shanu kr Shukla during the CodTech ITsolution internship program is to write a java program simple calculator with advance features, which implement a simple calculator with advanced features such as addition, subtraction, multiplication, division, exponentiation, and the option to quit.

Interm Information-
Name: Shanu Kr Shukla 
Intern ID: COD4904

# Introduction 
This documentation provides a detailed explanation of the task assigned during the CODTECH IT solutions internship program. the task is writing a Java program to a simple calculator with advanced features such as addition, subtraction, multiplication, division, exponentiation, and the option to quit. this documentation will cover the implementation details, the rationale behind the code structure, and insights into the programming techniques utilized. additionally,it will include an introduction about the intern Shanu Kr Shukla and his assigned ID, COD4904.

Implementation 
// Main loop for calculator operations
        while (true) {
            // Display menu options
            displayMenu();
            int operator = scanner.nextInt();

 // Exit condition if the user chooses to quit
            if (operator == 6) {
                System.out.println("Calculator is exiting. Goodbye!");
                break;
            }

 // Validate user input for the operator
            if (operator < 1 || operator > 5) {
                System.out.println("Invalid choice. Please choose again.");
                continue;
            }

// Input two numbers for the chosen operation
            System.out.print("Enter first number: ");
            double n1 = scanner.nextDouble();
            System.out.print("Enter second number: ");
            double n2 = scanner.nextDouble();

// Calculate the result based on the chosen operation
            double result = calculate(operator, n1, n2);

 // Display the result if it's valid (not NaN)
            if (!Double.isNaN(result)) {
                System.out.println("Result is " + result);
            }
        }

        scanner.close();
    }
// Method to display the menu options
    private static void displayMenu() {
        System.out.println("1 - Add\n2 - Subtract\n3 - Multiply\n4 - Divide\n5 - Exponentiation\n6 - Quit");
        System.out.print("Choose operator: ");
    }
// Method to perform the calculation based on the operator and two numbers
    private static double calculate(int operator, double n1, double n2) {
        switch (operator) {
            case 1:
                return n1 + n2; // Addition
            case 2:
                return n1 - n2; // Subtraction
            case 3:
                return n1 * n2; // Multiplication
            case 4:
                if (n2 == 0) {
                    System.out.println("Cannot divide by zero.");
                    return Double.NaN; // Return NaN for division by zero
                }
                return n1 / n2; // Division
            case 5:
                return Math.pow(n1, n2); // Exponentiation
            default:
                return Double.NaN; // Return NaN for invalid operation
        }
    }
}

Code Explanation:

The code implements a simple calculator that allows users to perform basic arithmetic operations.
It starts by displaying a menu with options for addition, subtraction, multiplication, division, exponentiation, and quitting the calculator.
The user inputs their choice of operation, and the code validates the input to ensure it's within the range of available options.
If the user chooses an operation, they input two numbers, and the code calculates the result based on the chosen operation.
The result is then displayed to the user unless it's NaN (Not a Number), which occurs in cases like division by zero.
The program continues to loop until the user chooses to quit.

Usage:
Compile the code using a Java compiler.
Run the compiled class file.
Follow the on-screen instructions to perform arithmetic operations or quit the calculator.

Conclusion:
This simple calculator program provides a straightforward way for users to perform basic arithmetic operations. It ensures user input is validated and handles edge cases like division by zero. By organizing the code into methods and providing clear explanations, it becomes easy to understand, use, and maintain.
