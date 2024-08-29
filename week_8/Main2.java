import java.util.Scanner;

// Superclass Vehicle
class Vehicle {
    // Members
    private String company;
    private double price;

    // Constructor
    public Vehicle(String company, double price) {
        this.company = company;
        this.price = price;
    }

    // Method to display vehicle information
    public void display() {
        System.out.println("Company: " + company);
        System.out.println("Price: $" + price);
    }
}

// LightMotorVehicle class derived from Vehicle
class LightMotorVehicle extends Vehicle {
    // Member
    private double mileage;

    // Constructor
    public LightMotorVehicle(String company, double price, double mileage) {
        super(company, price);
        this.mileage = mileage;
    }

    // Method to display light motor vehicle information
    @Override
    public void display() {
        super.display();
        System.out.println("Mileage: " + mileage + " km/l");
    }
}

// HeavyMotorVehicle class derived from Vehicle
class HeavyMotorVehicle extends Vehicle {
    // Member
    private double capacityInTons;

    // Constructor
    public HeavyMotorVehicle(String company, double price, double capacityInTons) {
        super(company, price);
        this.capacityInTons = capacityInTons;
    }

    // Method to display heavy motor vehicle information
    @Override
    public void display() {
        super.display();
        System.out.println("Capacity: " + capacityInTons + " tons");
    }
}

public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Getting the number of vehicles
        System.out.print("Enter the number of vehicles: ");
        int n = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        // Array to store vehicles
        Vehicle[] vehicles = new Vehicle[n];

        // Getting details of each vehicle
        for (int i = 0; i < n; i++) {
            System.out.println("Enter details for vehicle " + (i + 1) + ":");
            System.out.print("Enter type (1 for Light Motor Vehicle, 2 for Heavy Motor Vehicle): ");
            int type = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            System.out.print("Company: ");
            String company = scanner.nextLine();
            System.out.print("Price: $");
            double price = scanner.nextDouble();

            if (type == 1) {
                System.out.print("Mileage (km/l): ");
                double mileage = scanner.nextDouble();
                vehicles[i] = new LightMotorVehicle(company, price, mileage);
            } else if (type == 2) {
                System.out.print("Capacity (tons): ");
                double capacity = scanner.nextDouble();
                vehicles[i] = new HeavyMotorVehicle(company, price, capacity);
            } else {
                System.out.println("Invalid type. Please enter 1 for Light Motor Vehicle or 2 for Heavy Motor Vehicle.");
                i--; // Decrement i to re-enter details for this vehicle
            }

            scanner.nextLine(); // Consume newline
        }

        // Displaying information for all vehicles
        System.out.println("\nVehicle Information:");
        for (int i = 0; i < n; i++) {
            System.out.println("Vehicle " + (i + 1) + ":");
            vehicles[i].display();
            System.out.println();
        }

        scanner.close();
    }
}
