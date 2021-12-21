package practices;

import java.util.Scanner;

public class Main5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number1, number2, number3;

        System.out.print("1st number: ");
        number1 = scanner.nextInt();

        System.out.print("2nd number: ");
        number2 = scanner.nextInt();

        System.out.print("3rd number: ");
        number3 = scanner.nextInt();

       if (number1 < number2 && number1 < number3) {
           if (number2 < number3) {
               System.out.println(number1);
               System.out.println(number2);
               System.out.println(number3);
           } else {
               System.out.println(number1);
               System.out.println(number3);
               System.out.println(number2);
           }
       } else if (number2 < number1 && number2 < number3) {
           if (number1 < number3) {
               System.out.println(number2);
               System.out.println(number1);
               System.out.println(number3);
           } else {
               System.out.println(number2);
               System.out.println(number3);
               System.out.println(number1);
           }
       } else {
           if (number1 < number2) {
               System.out.println(number3);
               System.out.println(number1);
               System.out.println(number2);
           } else {
               System.out.println(number3);
               System.out.println(number2);
               System.out.println(number1);
           }
       }

    }
}
