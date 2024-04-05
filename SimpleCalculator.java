import java.util.Scanner;
public class SimpleCalculator {
    private static final Scanner
    scanner = new Scanner(System.in);
  
  public static void main(String []args){

     while (true){
         displayMenu();
         int choice = getUserChoise();

         if (choice==7){
             System.out.println("Exiting Calculator.Goodbye");
             break;
         }
         double result = performOperation(choice);
         if (!Double.isNaN(result)){
             System.out.println("Result:"+ result);
         }
     }
     scanner.close();
    }

    private static void displayMenu(){
        System.out.println("Seletct operation");
        System.out.println("1.Add\n2.Subtract\n3.Multiply\n4.Divide\n5.Exponential\n6.Square Root\n7.Exit");
        System.out.println("Enter Your Choice: ");
    }
    private static int getUserChoise() {
        while (!scanner.hasNextInt()) {
            System.out.println("Invalid Input. please enter a number");
            scanner.next();
        }
        return scanner.nextInt();

    }
    private static double performOperation(int choice){
        double num1,num2;
        switch (choice){
            case 1:
            case 2:
            case 3:
            case 4:
            System.out.println("Enter First Number");
            num1= getValidNumber();
            System.out.println("Enter Second Number");
            num2=getValidNumber();
            return performBasicOperation(choice,num1,num2);
            case 5:
                System.out.println("Enter a base number");
                num1= getValidNumber();
                System.out.println("enter exponent");
                num2= getValidNumber();
                return Math.pow(num1,num2);
            case 6:
                System.out.println("Enter a Number to find Square Root");
                num1= getValidNumber();
                return Math.sqrt(num1);
            default:
                System.out.printf("Invalid Choice please choose again");
                return Double.NaN;
        }
    }
    private static double performBasicOperation(int choice, double num1, double num2){
        switch (choice){
            case 1: return num1 + num2;
            case 2: return num1 - num2;
            case 3: return num1 * num2;
            case 4: return num1 / num2;
            default:return Double.NaN;

        }
    }

    private static double getValidNumber(){
        while (!scanner.hasNextDouble()){
            System.out.println("Invalid Input please enter a valid Number");
            scanner.next();
        }
        return scanner.nextDouble();
    }

}
