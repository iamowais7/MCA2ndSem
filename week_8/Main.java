import java.util.Scanner;

// Employee class
class Employee {
    // Private members
    private int id;
    private String name;
    private String department;
    public double salary;

    // Default constructor
    public Employee() {
        id = 0;
        name = "";
        department = "";
        salary = 0.0;
    }

    // Parameterized constructor
    public Employee(int id, String name, String department, double salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    // Method to display employee details
    public void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Department: " + department);
        System.out.println("Salary: $" + salary);
    }
}

// Manager class inheriting from Employee
class Manager extends Employee {
    // Private member
    private double bonus;

    // Parameterized constructor
    public Manager(int id, String name, String department, double salary, double bonus) {
        super(id, name, department, salary);
        this.bonus = bonus;
    }

    // Method to accept bonus
    public void acceptBonus(double bonus) {
        this.bonus = bonus;
    }

    // Method to display manager details including bonus
    @Override
    public void display() {
        super.display();
        System.out.println("Bonus: $" + bonus);
    }

    // Method to get total salary (salary + bonus)
    public double getTotalSalary() {
        return super.salary + bonus;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Getting the number of managers
        System.out.print("Enter the number of managers: ");
        int n = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        // Creating an array of Manager objects
        Manager[] managers = new Manager[n];

        // Getting details of each manager
        for (int i = 0; i < n; i++) {
            System.out.println("Enter details for manager " + (i + 1) + ":");
            System.out.print("ID: ");
            int id = scanner.nextInt();
            scanner.nextLine(); // Consume newline
            System.out.print("Name: ");
            String name = scanner.nextLine();
            System.out.print("Department: ");
            String department = scanner.nextLine();
            System.out.print("Salary: $");
            double salary = scanner.nextDouble();
            System.out.print("Bonus: $");
            double bonus = scanner.nextDouble();

            // Creating Manager object and adding it to the array
            managers[i] = new Manager(id, name, department, salary, bonus);
        }

        // Finding manager with maximum total salary (salary + bonus)
        Manager maxTotalSalaryManager = managers[0];
        for (int i = 1; i < n; i++) {
            if (managers[i].getTotalSalary() > maxTotalSalaryManager.getTotalSalary()) {
                maxTotalSalaryManager = managers[i];
            }
        }

        // Displaying details of manager with maximum total salary
        System.out.println("\nManager with maximum total salary:");
        maxTotalSalaryManager.display();

        scanner.close();
    }
}
