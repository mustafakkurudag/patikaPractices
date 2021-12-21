package practices;

import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        System.out.println(getAverage());
    }

    public static String getAverage() {
        Scanner scan = new Scanner(System.in);

        int sum = 0, counter = 0;

        double average;

        loop: while (true) {
            infos();

            int input = scan.nextInt();

            switch (input) {
                case 0:
                    System.out.println("Program ended.");
                    break loop;
                case 1:
                    System.out.print("Input your math note: ");
                    int mathNote = scan.nextInt();

                    if (mathNote < 0 || mathNote > 100) {
                        System.out.println("Invalid note!");
                        break;
                    }

                    sum += mathNote;
                    counter++;
                    break;

                case 2:
                    System.out.print("Input your physics note: ");
                    int physicsNote = scan.nextInt();

                    if (physicsNote < 0 || physicsNote > 100) {
                        System.out.println("Invalid note!");
                        break;
                    }

                    sum += physicsNote;
                    counter++;
                    break;

                case 3:
                    System.out.print("Input your chemistry note: ");
                    int chemistryNote = scan.nextInt();

                    if (chemistryNote < 0 || chemistryNote > 100) {
                        System.out.println("Invalid note!");
                        break;
                    }

                    sum += chemistryNote;
                    counter++;
                    break;

                case 4:
                    System.out.print("Input your turkish note: ");
                    int turkishNote = scan.nextInt();

                    if (turkishNote < 0 || turkishNote > 100) {
                        System.out.println("Invalid note!");
                        break;
                    }

                    sum += turkishNote;
                    counter++;
                    break;

                case 5:
                    System.out.print("Input your music note: ");
                    int musicNote = scan.nextInt();

                    if (musicNote < 0 || musicNote > 100) {
                        System.out.println("Invalid note!");
                        break;
                    }

                    sum += musicNote;
                    counter++;
                    break;

                default:
                    System.out.println("Invalid input value. Please try again.");
                    break;
            }
        }

        average = (double) sum / counter;

        return average >= 55.0 ?
                "Your average is: " + average + "\nCongratulations you pass the class" :
                "Your average is: " + average + "\nYou failed.";
    }

    static void infos() {
        System.out.println("For to input Math note: 1");
        System.out.println("For to input Physic note: 2");
        System.out.println("For to input Chemistry note: 3");
        System.out.println("For to input Turkish note: 4");
        System.out.println("For to input Music note: 5");
        System.out.println("For your average: 0");
    }
}
