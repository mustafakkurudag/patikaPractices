package practices.arrays;

public class Main {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        double harmonicAverage = harmonicAverage(numbers);

        System.out.format("Harmonic average = %.2f", harmonicAverage);
    }

    public static double harmonicAverage(int[] array) {
        double harmonic;
        int n = array.length;
        double sum = 0;

        for (int i = 1; i <= n; i++) {
            sum += (double) 1 / i;
        }

        harmonic = (double) n / sum;

        return harmonic;
    }
}
