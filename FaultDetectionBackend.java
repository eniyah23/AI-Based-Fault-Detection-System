import java.util.Scanner;

public class FaultDetectionBackend {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== AI-Based Fault Detection System (Backend) ===");

        try {
            System.out.print("Enter Vibration: ");
            double vibration = Double.parseDouble(sc.nextLine().trim());

            System.out.print("Enter Temperature (°C): ");
            double temperature = Double.parseDouble(sc.nextLine().trim());

            System.out.print("Enter Pressure: ");
            double pressure = Double.parseDouble(sc.nextLine().trim());

            String result = detectFault(vibration, temperature, pressure);
            System.out.println("\nResult: " + result);

        } catch (NumberFormatException e) {
            System.out.println("\nInvalid input. Please enter numeric values only.");
        } finally {
            sc.close();
        }
    }

    private static String detectFault(double vibration, double temperature, double pressure) {
        if (vibration > 0.1 || temperature > 100 || pressure > 2.0) {
            return "Fault Detected! Please inspect the machine.";
        } else {
            return "System Normal.";
        }
    }
}
