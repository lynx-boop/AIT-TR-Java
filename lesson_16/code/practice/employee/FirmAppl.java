package practice.employee;

import practice.employee.model.Employee;

public class FirmAppl {
    public static void main(String[] args) {
        Employee empl1 = new Employee(1, "John","Smith", 24, 24000, true);
        Employee empl2 = new Employee(2, "Sarah", "Connor", 35, 24000, false);

        empl1.display();
        empl2.display();

        double totalSalary = empl1.getSalary() + empl2.getSalary();
        System.out.println("Total salary: " + totalSalary);
    }
}
