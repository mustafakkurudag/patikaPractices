package homeworks.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int index;
        int[] numbers;

        System.out.println("What is the length of the array?");
        index = scanner.nextInt();

        numbers = new int[index];
        index = 0;

        while (index < numbers.length) {
            System.out.println("Index " + index + ": ");
            numbers[index] = scanner.nextInt();

            index++;
        }

        System.out.println(Arrays.toString(numbers));

        numbers = sortArray(numbers);
        System.out.println(Arrays.toString(numbers));
    }

    public static int[] sortArray(int[] array) {
        int temp;

        for (int i = 0; i < array.length; i++) {
            for (int j = i+1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }

        }

        return array;
    }
}
