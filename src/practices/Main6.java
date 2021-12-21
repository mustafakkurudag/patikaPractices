package practices;

import java.util.Scanner;

public class Main6 {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        int day, month;

        System.out.print("Input your birth day: ");
        day = scanner.nextInt();

        System.out.print("Input your birth month: ");
        month = scanner.nextInt();

        if (day > 31 || month > 12) {
            throw new Exception("Day couldn't bigger than 31 and month couldn't bigger than 12");
        }

        if (month == 1) {
            if (day >= 22) {
                System.out.println("You're an 'Aquarius'");
            } else {
                System.out.println("You're a 'Capricorn'");
            }
        } else if (month == 2) {
            if (day >= 20) {
                System.out.println("You're an 'Pisces'");
            } else {
                System.out.println("You're an 'Aquarius'");
            }
        } else if (month == 3) {
            if (day >= 21) {
                System.out.println("You're an 'Aries'");
            } else {
                System.out.println("You're a 'Pisces'");
            }
        } else if (month == 4) {
            if (day >= 21) {
                System.out.println("You're a 'Taurus'");
            } else {
                System.out.println("You're an 'Aries'");
            }
        } else if (month == 5) {
            if (day >= 22) {
                System.out.println("You're a 'Gemini'");
            } else {
                System.out.println("You're a 'Taurus'");
            }
        } else if (month == 6) {
            if (day >= 22) {
                System.out.println("You're a 'Cancer'");
            } else {
                System.out.println("You're 'Gemini'");
            }
        } else if (month == 7) {
            if (day >= 23) {
                System.out.println("You're a 'Leo'");
            } else {
                System.out.println("You're a 'Cancer'");
            }
        } else if (month == 8) {
            if (day >= 22) {
                System.out.println("You're a 'Virgo'");
            } else {
                System.out.println("You're a 'Leo'");
            }
        } else if (month == 9) {
            if (day >= 24) {
                System.out.println("You're a 'Libra'");
            } else {
                System.out.println("You're a 'Virgo'");
            }
        } else if (month == 10) {
            if (day >= 24) {
                System.out.println("You're a 'Scorpio");
            } else {
                System.out.println("You're a 'Libra'");
            }
        } else if (month == 11) {
            if (day >= 23) {
                System.out.println("You're a 'Sagittarius'");
            } else {
                System.out.println("You're a 'Scorpio'");
            }
        } else if (month == 12) {
            if (day >= 23) {
                System.out.println("You're a 'Capricorn'");
            } else {
                System.out.println("You're a 'Sagittarius'");
            }
        }
    }
}
