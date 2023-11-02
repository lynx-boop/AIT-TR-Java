package practice.employee_firm;

import practice.employee_firm.model.Employee;
import practice.employee_firm.model.Manager;
import practice.employee_firm.model.SalesManager;
import practice.employee_firm.model.Worker;

public class EmployeeAppl {
    public static void main(String[] args) {
        Employee[] employees = new Employee[4];
        employees[0] = new Manager(100, "Jhon", "Smith", 45, 60.0, 5000, 5);
        employees[1] = new SalesManager(101, "Anna", "Black", 36, 60.0, 25000, 0.1);
        employees[2] = new SalesManager(102, "Thomas", "White", 28, 60.0, 30000, 0.1);
        employees[3] = new Worker(103, "Hans", "Bauer", 30 , 160, 5);

        double total = totalSalary(employees);
        double average = averageAge(employees);
        System.out.println("total: " + total + ", average: " + average);
    }
    private static double totalSalary(Employee[] employees) {
        double sum = 0;
        for (int i = 0; i < employees.length; i++) {
            if(employees[i] != null) {
                sum += employees[i].calcSalary();
            }
        }
        return sum;
    }
    private static double averageAge(Employee[] empl) {
        double average = 0;
        for (int i = 0; i < empl.length; i++) {
            if (empl[i] != null) {
                average += empl[i].getAge();
            }
        }
        return average / empl.length;
    }
}
