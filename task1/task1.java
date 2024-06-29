import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the temperature value:");
        double temperature = scanner.nextDouble();

        System.out.println("Enter the unit of the temperature (C or c for Celsius, F or f for Fahrenheit, K or k for Kelvin):");
        char unit = scanner.next().charAt(0);

        switch (unit) {
            case 'C':
            case 'c':
                c2c(temperature);
                break;
            case 'F':
            case 'f':
                c2f(temperature);
                break;
            case 'K':
            case 'k':
                c2k(temperature);
                break;
            default:
                System.out.println("Invalid unit of measurement.");
        }

        scanner.close();
    }

    public static void c2c(double celsius) {
        double fahrenheit = celsius * 9/5 + 32;
        double kelvin = celsius + 273.15;

        System.out.printf("Temperature in Fahrenheit: %.2f F%n", fahrenheit);
        System.out.printf("Temperature in Kelvin: %.2f K%n", kelvin);
    }

    public static void c2f(double fahrenheit) {
        double celsius = (fahrenheit - 32) * 5/9;
        double kelvin = (fahrenheit - 32) * 5/9 + 273.15;

        System.out.printf("Temperature in Celsius: %.2f C%n", celsius);
        System.out.printf("Temperature in Kelvin: %.2f K%n", kelvin);
    }

    public static void c2k(double kelvin) {
        double celsius = kelvin - 273.15;
        double fahrenheit = (kelvin - 273.15) * 9/5 + 32;

        System.out.printf("Temperature in Celsius: %.2f C%n", celsius);
        System.out.printf("Temperature in Fahrenheit: %.2f F%n", fahrenheit);
    }
}