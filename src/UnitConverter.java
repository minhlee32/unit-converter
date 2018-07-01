import java.util.Scanner;

public class UnitConverter {
    public static void main(String[] args) {
        int choice;
        double foot;
        double meter;
        Scanner input = new Scanner(System.in);

        do {
            System.out.println("1. Convert foot to meter");
            System.out.println("2. Convert meter to foot");
            System.out.println("0. Exit");
            System.out.println("Please enter your choice: ");
            choice = input.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Foot to number converter");
                    System.out.println("Please enter a value");
                    foot = input.nextDouble();
                    System.out.println("Here is result " + footToMeter(foot));
                    break;
                case 2:
                    System.out.println("Meter to number foot");
                    System.out.println("Please enter a value");
                    meter = input.nextDouble();
                    System.out.println("Here is result "+meterToFoot(meter));
                    break;
                case 0:
                    System.exit(0);
            }
        } while (choice != 0);

    }

    public static double footToMeter(double foot) {
        double meter = 0.305 * foot;
        return meter;
    }

    public static double meterToFoot(double meter) {
        double foot = 3.279 * meter;
        return foot;
    }
}
