// Simple Calculator Project 
//Created by : Deema Abdullah 

import java.util.Scanner;

public class CalculatorJava {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double firstNumber, secondNumber, result = 0;
        int choice;
        char again;

        do {

            System.out.println("\n===== Simple Calculator =====");

            System.out.print("Enter first number: ");
            firstNumber = input.nextDouble();

            System.out.print("Enter second number: ");
            secondNumber = input.nextDouble();

            System.out.println("\n Choose operation:");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");

            System.out.print("Choice: ");
            choice = input.nextInt();

            switch (choice) {

                case 1:
                    result = firstNumber + secondNumber;
                    break;

                case 2:
                    result = firstNumber - secondNumber;
                    break;

                case 3:
                    result = firstNumber * secondNumber;
                    break;

                case 4:
                    if (secondNumber == 0) {
                        System.out.println("Cannot divide by zero.");
                    } else {
                        result = firstNumber / secondNumber;
                    }
                    break;

                default:
                    System.out.println("Invalid choice.");
            }

            if (choice != 4 || secondNumber != 0) {
                System.out.println("Result = " + result);
            }

            System.out.print("\nAnother calculation? (Y/N): ");
            again = input.next().charAt(0);

        } while (again == 'Y' || again == 'y');

        System.out.println("Thank you!");

        input.close();

    }

}
