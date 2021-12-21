package homeworks;

import java.util.Scanner;

public class Main {

    final private static double AMOUNT_PER_KM = 0.1;

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        int age, distance, tripType;

        double amount, discount;

        System.out.println("Input distance (km): ");
        distance = scanner.nextInt();

        System.out.println("How old is the passenger?");
        age = scanner.nextInt();

        System.out.println("What is your trip type? (Road trip -> 1, One way -> 2");
        tripType = scanner.nextInt();

        amount = distance * AMOUNT_PER_KM;

        if (distance < 0 || age < 0 || (tripType != 1 && tripType != 2)) {
            throw new Exception("You input wrong data.");
        }

        if (age < 12) {
            discount = amount * 0.5;
            amount = amount - discount;

            if (tripType == 1){
                discount = amount * 0.2;
                amount = (amount - discount) * 2;
            }
        } else if (age >= 12 && age <= 24) {
           discount = amount * 0.1;
           amount = amount - discount;

            if (tripType == 1){
                discount = amount * 0.2;
                amount = (amount - discount) * 2;
            }
        } else if (age >= 65) {
            discount = amount * 0.3;
            amount = amount - discount;

            if (tripType == 1){
                discount = amount * 0.2;
                amount = (amount - discount) * 2;
            }
        }

        System.out.println("Your payment = " + amount);
    }
}
