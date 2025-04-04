import java.util.Scanner;

class Employee {
    int eNo;
    String eName;
    double eSalary;

    // Constructor
    Employee(int eNo, String eName, double eSalary) {
        this.eNo = eNo;
        this.eName = eName;
        this.eSalary = eSalary;
    }

    // Display Employee Details
    void display() {
        System.out.println("------------------------------");
        System.out.println("Employee Found!");
        System.out.println("Employee Number: " + eNo);
        System.out.println("Employee Name  : " + eName);
        System.out.println("Employee Salary: $" + eSalary);
        System.out.println("------------------------------");
    }
}

public class EmployeeSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read the number of employees
        System.out.print("Enter the number of employees: ");
        int n = sc.nextInt();

        // Array of Employee objects
        Employee[] employees = new Employee[n];

        // Read employee details
        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for Employee " + (i + 1) + ": ");
            System.out.print("Enter Employee Number: ");
            int eNo = sc.nextInt();
            sc.nextLine(); // Consume the newline character
            System.out.print("Enter Employee Name: ");
            String eName = sc.nextLine();
            System.out.print("Enter Employee Salary: ");
            double eSalary = sc.nextDouble();

            // Create an Employee object and store it in the array
            employees[i] = new Employee(eNo, eName, eSalary);
        }

        // Search for an employee
        System.out.print("\nEnter Employee Number to search: ");
        int searchNo = sc.nextInt();
        boolean found = false;

        for (Employee emp : employees) {
            if (emp.eNo == searchNo) {
                emp.display();
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Employee with Number " + searchNo + " not found.");
        }

        sc.close(); // Safe to close here since it's a small program
    }
}

