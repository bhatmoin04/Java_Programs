import java.util.InputMismatchException;
import java.util.Scanner;

// Step 1: Define interface
interface TemperatureConverter {
    double celsiusToFahrenheit(double celsius);

    double fahrenheitToCelsius(double fahrenheit);
}

// Step 2: Implement interface
class Converter implements TemperatureConverter {

    @Override
    public double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    @Override
    public double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }
}

// Step 3: Main class
public class TemperatureConverterApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Converter converter = new Converter();

        try {
            // Celsius to Fahrenheit
            System.out.print("Enter temperature in Celsius: ");
            double celsius = sc.nextDouble();
            double fahrenheitFromC = converter.celsiusToFahrenheit(celsius);
            System.out.println(celsius + " °C = " + fahrenheitFromC + " °F");

            // Fahrenheit to Celsius
            System.out.print("Enter temperature in Fahrenheit: ");
            double fahrenheit = sc.nextDouble();
            double celsiusFromF = converter.fahrenheitToCelsius(fahrenheit);
            System.out.println(fahrenheit + " °F = " + celsiusFromF + " °C");

        } catch (InputMismatchException e) {
            System.out.println("❌ Invalid input! Please enter numeric values.");
        } finally {
            sc.close();
            System.out.println("✅ Program ended.");
        }
    }
}
