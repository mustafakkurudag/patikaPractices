package practices.methods;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input the number to check: ");
        int number = scanner.nextInt();
        boolean isPalindrome = isPalindromeAlternative(number);

        if (isPalindrome) {
            System.out.println("Number " + number + " is a palindrome number");
        } else {
            System.out.println("Number " + number + " is not a palindrome number");
        }

    }

    static boolean isPalindrome(int number) {
        String numberStr = Integer.toString(number);
        String numberStrReverse = "";

        for (int i = numberStr.length() - 1; i >= 0; i--) {
            numberStrReverse += numberStr.charAt(i);
        }

        int numberReverse = Integer.parseInt(numberStrReverse);

        if (number == numberReverse) {
            return true;
        } else {
            return false;
        }
    }

    static boolean isPalindromeAlternative(int number) {
        int numberReverse = 0, lastDigit;
        int temp = number;

        while (temp != 0) {
            lastDigit = temp % 10;
            numberReverse = (numberReverse * 10) + lastDigit;
            temp /= 10;
        }

        if (numberReverse == number) {
            return true;
        } else {
            return false;
        }

    }
}
