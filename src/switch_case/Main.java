package switch_case;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int number1, number2, select;

        Scanner scan = new Scanner(System.in);

        System.out.println("Input your first number: ");
        number1 = scan.nextInt();

        System.out.println("Input your second number: ");
        number2 = scan.nextInt();

        System.out.println("1- Addition\n2- Subtraction\n3- Multiplication\n4- Division");
        System.out.println("What is your selection?");
        select = scan.nextInt();

        switch (select) {
            case 1:
                System.out.println("Sum = " + (number1 + number2));
                break;

            case 2:
                System.out.println("Difference = " + (number1 - number2));
                break;

            case 3:
                System.out.println("Multiplication result = " + (number1 * number2));
                break;

            case 4:
                System.out.println("Division result = " + ((double) number1 / number2));
                break;

            default:
                System.out.println("You input an invalid value. Please try again!");
                break;
        }
    }
}
