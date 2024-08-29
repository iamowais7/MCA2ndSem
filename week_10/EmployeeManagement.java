import java.io.*;
import java.util.Scanner;

public class EmployeeManagement {

    // Define a file name to store employee data
    private static final String FILE_NAME = "employee_data.txt";

    // Employee class to represent employee data
    static class Employee {
        int empNo;
        String name;
        String sex;
        double grossSalary;

        public Employee(int empNo, String name, String sex, double grossSalary) {
            this.empNo = empNo;
            this.name = name;
            this.sex = sex;
            this.grossSalary = grossSalary;
        }

        @Override
        public String toString() {
            return empNo + "," + name + "," + sex + "," + grossSalary;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            // Display the menu
            System.out.println("\nEmployee Management System");
            System.out.println("1. Create employee data file");
            System.out.println("2. Append new employee data");
            System.out.println("3. Delete employee record");
            System.out.println("4. Update employee gross salary");
            System.out.println("5. Display employee record");
            System.out.println("6. Display all employee records");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline character

            switch (choice) {
                case 1:
                    createEmployeeDataFile();
                    break;
                case 2:
                    appendNewEmployeeData(scanner);
                    break;
                case 3:
                    deleteEmployeeRecord(scanner);
                    break;
                case 4:
                    updateEmployeeGrossSalary(scanner);
                    break;
                case 5:
                    displayEmployeeRecord(scanner);
                    break;
                case 6:
                    displayAllEmployeeRecords();
                    break;
                case 0:
                    System.out.println("Exiting the program...");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    // Create an employee data file
    private static void createEmployeeDataFile() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_NAME))) {
            // File is created and automatically closed when the BufferedWriter is closed
            System.out.println("Employee data file created successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred while creating the file: " + e.getMessage());
        }
    }

    // Append new employee data to the file
    private static void appendNewEmployeeData(Scanner scanner) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_NAME, true))) {
            System.out.print("Enter employee number: ");
            int empNo = scanner.nextInt();
            scanner.nextLine(); // Consume newline character

            System.out.print("Enter employee name: ");
            String name = scanner.nextLine();

            System.out.print("Enter employee sex (M/F): ");
            String sex = scanner.nextLine();

            System.out.print("Enter employee gross salary: ");
            double grossSalary = scanner.nextDouble();

            Employee employee = new Employee(empNo, name, sex, grossSalary);
            writer.write(employee.toString());
            writer.newLine();
            System.out.println("Employee data appended successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred while appending data: " + e.getMessage());
        }
    }

    // Delete employee record from the file
    private static void deleteEmployeeRecord(Scanner scanner) {
        System.out.print("Enter the employee number to delete: ");
        int empNo = scanner.nextInt();
        scanner.nextLine(); // Consume newline character

        File inputFile = new File(FILE_NAME);
        File tempFile = new File("temp_employee_data.txt");

        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile));
             BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile))) {
            String line;
            boolean deleted = false;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                if (Integer.parseInt(parts[0]) == empNo) {
                    deleted = true;
                    continue; // Skip writing the line to the temp file
                }
                writer.write(line);
                writer.newLine();
            }
            if (deleted) {
                System.out.println("Employee record deleted successfully.");
            } else {
                System.out.println("Employee not found.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred while deleting data: " + e.getMessage());
        }

        // Replace the original file with the temp file
        if (tempFile.exists()) {
            if (inputFile.delete()) {
                tempFile.renameTo(inputFile);
            }
        }
    }

    // Update employee gross salary in the file
    private static void updateEmployeeGrossSalary(Scanner scanner) {
        System.out.print("Enter the employee number to update salary: ");
        int empNo = scanner.nextInt();
        scanner.nextLine(); // Consume newline character

        System.out.print("Enter the new gross salary: ");
        double newGrossSalary = scanner.nextDouble();
        scanner.nextLine(); // Consume newline character

        File inputFile = new File(FILE_NAME);
        File tempFile = new File("temp_employee_data.txt");

        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile));
             BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile))) {
            String line;
            boolean updated = false;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                int currentEmpNo = Integer.parseInt(parts[0]);
                if (currentEmpNo == empNo) {
                    // Update the gross salary
                    parts[3] = String.valueOf(newGrossSalary);
                    line = String.join(",", parts);
                    updated = true;
                }
                writer.write(line);
                writer.newLine();
            }
            if (updated) {
                System.out.println("Employee gross salary updated successfully.");
            } else {
                System.out.println("Employee not found.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred while updating salary: " + e.getMessage());
        }

        // Replace the original file with the temp file
        if (tempFile.exists()) {
            if (inputFile.delete()) {
                tempFile.renameTo(inputFile);
            }
        }
    }

    // Display the record of a given employee
    private static void displayEmployeeRecord(Scanner scanner) {
        System.out.print("Enter the employee number to display: ");
        int empNo = scanner.nextInt();
        scanner.nextLine(); // Consume newline character

        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME))) {
            String line;
            boolean found = false;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                int currentEmpNo = Integer.parseInt(parts[0]);
                if (currentEmpNo == empNo) {
                    System.out.println("Employee Record:");
                    System.out.println("Employee No: " + parts[0]);
                    System.out.println("Name: " + parts[1]);
                    System.out.println("Sex: " + parts[2]);
                    System.out.println("Gross Salary: " + parts[3]);
                    found = true;
                    break;
                }
            }
            if (!found) {
                System.out.println("Employee not found.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred while displaying the record: " + e.getMessage());
        }
    }

    // Display all employee records
    private static void displayAllEmployeeRecords() {
        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME))) {
            String line;
            System.out.println("All Employee Records:");
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("An error occurred while displaying all records: " + e.getMessage());
        }
    }
}
