package practices.methods;

import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) throws InterruptedException {
        Scanner scan = new Scanner(System.in);
        int select;
        String menu = "0- Exit\n" +
                "1- Addition\n" +
                "2- Substraction\n" +
                "3- Multiplication\n" +
                "4- Division\n" +
                "5- Power\n" +
                "6- Factorial\n" +
                "7- Mod\n" +
                "8- Rectangle field and perimeter";

        do {
            System.out.println(menu);
            select = scan.nextInt();
            switch (select) {
                case 1:
                    addition();
                    Thread.sleep(3000);
                    break;
                case 2:
                    substraction();
                    Thread.sleep(3000);
                    break;
                case 3:
                    multiplication();
                    Thread.sleep(3000);
                    break;
                case 4:
                    division();
                    Thread.sleep(3000);
                    break;
                case 5:
                    power();
                    Thread.sleep(3000);
                    break;
                case 6:
                    factorial();
                    Thread.sleep(3000);
                    break;
                case 7:
                    mod();
                    Thread.sleep(3000);
                    break;
                case 8:
                    rectangleFieldAndPerimeter();
                    Thread.sleep(3000);
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Invalid selection!");
                    break;
            }
        }while (select !=0);

    }

    private static void addition() {
        Scanner scan = new Scanner(System.in);
        int number, sum = 0;
        System.out.println("Input numbers(to exit press -1)");
        while (true) {
            number = scan.nextInt();
            if (number == -1) {
                break;
            }
            sum += number;

        }

        System.out.println("Total = " + sum);
    }

    private static void substraction() {
        Scanner scan = new Scanner(System.in);
        int number, difference = 0, counter;
        System.out.println("How many numbers you'll input: ");
        counter = scan.nextInt();

        System.out.println("Input numbers");

        while (counter > 0) {
            number = scan.nextInt();
            difference -= number;
            counter--;
        }

        System.out.println("Difference = " + difference);
    }

    private static void multiplication() {
        Scanner scan = new Scanner(System.in);
        int number, mul = 1;
        System.out.println("Input numbers(to exit press 1 or 0)");
        while (true) {
            number = scan.nextInt();
            mul *= number;

            if (number == 0 || number == 1) {
                System.out.println("Multiplication = " + mul);
                break;
            }
        }
    }

    private static void division() {
        Scanner scan = new Scanner(System.in);
        System.out.println("How many numbers you will input?");
        int counter = scan.nextInt();

        double number, result;

        System.out.println("Input numbers(to exit press 0)");
        number = scan.nextDouble();

        result = number;

        while (counter > 1) {
            number = scan.nextDouble();

            if (number == 0) {
                System.err.println("Any number can't divide by 0");
                break;
            }

            result /= number;
            counter--;
        }

        System.out.format("Result = %.2f", result);
    }

    private static void power() {
        Scanner scanner = new Scanner(System.in);

        int base, power;
        System.out.println("Base value: ");
        base = scanner.nextInt();

        System.out.println("Power value: ");
        power = scanner.nextInt();

        int result = 1;

        for (int i = 0; i < power; i++) {
            result *= base;
        }

        System.out.println("Result = " + result);
    }

    private static void factorial() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input the number: ");
        int number = scanner.nextInt();

        int result = 1;
        if (number == 0 || number == 1) {
            result = 1;
            System.out.println("Result = " + result);
        } else {
            for (int i = number; i > 0; i--) {
                result *= i;
            }
            System.out.println("Result = " + result);
        }
    }

    private static void mod() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input number: ");
        int number = scanner.nextInt();
        int temp;

        System.out.println("Input mod value: ");
        int mod = scanner.nextInt();

        if (mod > number) {
            temp = mod;
            mod = number;
            number = temp;

            int division = number / mod;
            division = division * mod;

            int result = Math.abs(division - number);

            temp = number;
            number = mod;
            mod = temp;
        }

        int division = number / mod;
        division = division * mod;

        int result = Math.abs(division - number);


        System.out.println(number + " mod " + mod + " = " + result);
    }

    private static void rectangleFieldAndPerimeter() {
        Scanner scanner = new Scanner(System.in);

        int height, weight, perimeter, field;
        System.out.println("Input the height: ");
        height = scanner.nextInt();

        System.out.println("Input the weight: ");
        weight = scanner.nextInt();

        field = height * weight;
        perimeter = 2 * (height + weight);

        System.out.println("Field = " + field);
        System.out.println("Perimeter = " + perimeter);
    }
}
