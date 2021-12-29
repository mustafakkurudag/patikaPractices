package practices.arrays;

import java.util.Arrays;

public class Main4 {
    public static void main(String[] args) {
        int[] numbers = {3, 7, 3, 2, 2, 9, 10, 12, 21, 21, 12, 1, 33, 8, 1, 8, 5};
        int[] repeatNumbers = new int[numbers.length];
        int temp;
        int index = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                temp = numbers[i];

                for(int j = i+1; j < numbers.length; j++) {
                    if (temp == numbers[j]) {
                        repeatNumbers[index] = temp;
                        index++;
                    }
                }
            }
        }

        repeatNumbers = removeZeros(repeatNumbers);
        System.out.println(Arrays.toString(repeatNumbers));
    }

    static int[] removeZeros(int[] array) {
        int length = array.length;

        while (array[length - 1] == 0) {
            --length;
        }

        array = Arrays.copyOf(array, length);

        return array;
    }
}
