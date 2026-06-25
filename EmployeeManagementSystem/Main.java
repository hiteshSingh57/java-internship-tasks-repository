import  java.util.Scanner;
import  java.util.InputMismatchException;
public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static EmployeeManager manager = new EmployeeManager();

    public static void main(String[] args) {
        System.out.println("========================================");
        System.out.println("     Employee Management System         ");
        System.out.println("========================================");


        boolean running = true;
        while (running) {
            printMenu();
            int choice = getIntInput("Enter your choice : ");

            switch (choice) {
                case 1 -> addEmployee();
                case 2 -> manager.viewAllEmployee();
                case 3 -> updateEmployee();
                case 4 -> deleteEmployee();
                case 5 -> searchEmployee();
                case 6 -> {
                    System.out.println("Total Employee :" + manager.getTotalEmployees());
                }
                case 0 -> {
                    System.out.println("Exiting .... .... Goodbye !!");
                    running = false;
                }
                default -> System.out.println("invalid choice. Please try again.");
            }
            System.out.println();
        }
        scanner.close();
    }

    private static void printMenu() {
        System.out.println("----------------------------------------");
        System.out.println("1. Add Employee");
        System.out.println("2. View All Employees");
        System.out.println("3. Update Employee");
        System.out.println("4. Delete Employee");
        System.out.println("5. Search Employee by ID");
        System.out.println("6. Total Employee Count");
        System.out.println("0. Exit");
        System.out.println("----------------------------------------");
    }

    private static void addEmployee() {
        System.out.print("Enter Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter Department: ");
        String dept = scanner.nextLine();
        double salary = getDoubleInput("Enter Salary: ");
        manager.addEmployee(name, dept, salary);
    }

    private static void updateEmployee() {
        int id = getIntInput("Enter Employee ID to update: ");
        Employee emp = manager.findById(id);
        if (emp == null) {
            System.out.println("Employee not found.");
            return;
        }
        System.out.println("Current: " + emp);
        System.out.print("New Name (press Enter to keep current): ");
        String name = scanner.nextLine();
        if (name.isEmpty()) name = emp.getName();
        System.out.print("New Department (press Enter to keep current): ");
        String dept = scanner.nextLine();
        if (dept.isEmpty()) dept = emp.getDepartment();
        double salary = getDoubleInput("New Salary (-1 to keep current): ");
        if (salary == -1) salary = emp.getSalary();
        manager.updateEmployee(id, name, dept, salary);
    }

    private static void deleteEmployee() {
        int id = getIntInput("Enter Employee ID to delete: ");
        manager.deleteEmployee(id);
    }

    private static void searchEmployee() {
        int id = getIntInput("Enter Employee ID to search: ");
        Employee emp = manager.findById(id);
        if (emp != null) {
            System.out.println("+-------+----------------------+-----------------+------------+");
            System.out.println("| ID    | Name                 | Department      | Salary     |");
            System.out.println("+-------+----------------------+-----------------+------------+");
            System.out.println(emp);
            System.out.println("+-------+----------------------+-----------------+------------+");
        } else {
            System.out.println("Employee not found.");
        }
    }

    private static int getIntInput(String prompt) {
        while (true) {
            try {
                System.out.print(prompt);
                int val = scanner.nextInt();
                scanner.nextLine(); // consume newline
                return val;
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a number.");
                scanner.nextLine();
            }
        }
    }

    private static double getDoubleInput(String prompt) {
        while (true) {
            try {
                System.out.print(prompt);
                double val = scanner.nextDouble();
                scanner.nextLine();
                return val;
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid number.");
                scanner.nextLine();
            }
        }
    }
}