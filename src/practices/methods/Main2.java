package practices.methods;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("How many numbers will in your fibonacci series?");
        int number = scanner.nextInt();
        int counter = 0;
        while (counter <= number) {
            int result = fibonacci(counter);
            System.out.print(result + ", ");
            counter++;
        }
    }

    static int fibonacci(int number) {
        if (number == 0) {
            return 0;
        }
        if (number == 1 || number == 2)
            return 1;

        return fibonacci(number - 1) + fibonacci(number -2);
    }
}
