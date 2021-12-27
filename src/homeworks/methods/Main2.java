package homeworks.methods;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number, number2;

        System.out.println("Input the number: ");
        number = scanner.nextInt();
        number2 = 2;

        boolean result = isPrime(number, number2);

        if (result) {
            System.out.println(number + " is a prime number");
        }else {
            System.out.println(number + " is not a prime number");
        }
    }

    static boolean isPrime(int number, int number2) {
        if (number <= 2)
            return (number == 2) ? true : false;
        if (number %  number2 == 0) {
            return false;
        }
        if (number2 * number2 > number){
            return true;
        }

        return isPrime(number, number2 + 1);
    }
}
