package homeworks.arrays;

import java.util.Arrays;

public class Main1 {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 20, 10, 10, 20, 5, 20};

        countElements(numbers);
    }

    static void countElements(int[] array) {
        int count, temp;

        boolean visited[] = new boolean[array.length];
        Arrays.fill(visited, false);

        System.out.println(Arrays.toString(array));

        for (int i = 0; i < array.length; i++) {
            count = 0;

            if (visited[i] == true) {
                continue;
            }

            for (int j = 0; j < array.length; j++) {
                if (array[i] == array[j]) {
                    visited[j] = true;
                    count++;
                }
            }
            System.out.println(array[i] + " repeats " + count + " times!");

        }
    }
}
