package practice.employee_firm.test;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import practice.employee_firm.dao.Company;
import practice.employee_firm.dao.CompanyImplement;
import practice.employee_firm.model.Employee;
import practice.employee_firm.model.Manager;
import practice.employee_firm.model.SalesManager;
import practice.employee_firm.model.Worker;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class CompanyImplementTest {
    Company company;
    Employee[] e;

    @BeforeEach
    void setUp() {
        company = new CompanyImplement(5);
        e = new Employee[4];
        e[0] = new Manager(101, "John", "Smith", 45, 160, 5000, 5);
        e[1] = new SalesManager(102, "Anna", "Black", 36, 160, 25000, 0.1);
        e[2] = new SalesManager(103, "Thomas", "White", 28, 160, 30000, 0.1);
        e[3] = new Worker(104, "Gans", "Bauer", 30, 80, 5);

        //добавим наши e элементы масива в company, иначе она пустая
        for (int i = 0; i < e.length; i++) {
            company.addEmployee(e[i]);
        }
    }

    @Test
    void addEmployee() {
        // не можем добавить null
        assertFalse(company.addEmployee(null));
        // не можем добавить уже существующий второй раз
        assertFalse(company.addEmployee(e[1]));
        // создали нового сотрудника
        Employee employee1 = new Manager(105, "Ivan", "Dubin", 55, 160, 6000, 6);
        assertTrue(company.addEmployee(employee1)); //добавили нового сотрудника
        assertEquals(5, company.quantity());
        Employee employee2 = new Manager(106, "Petr", "Dubin", 55, 160, 6000, 6);
        assertFalse(company.addEmployee(employee2)); //не можем превысить capacity
    }

    @Test
    void removeEmployee() {
        assertEquals(e[1], company.removeEmployee(102));
        assertEquals(3, company.quantity()); //сотрудников стало на 1 меньше (4-1=3)
        assertNull(company.removeEmployee(102)); //дважды удалить не можем
        assertNull(company.findEmployee(102)); //не можем найти удаленного после удаления, должен вернуться null
    }

    @Test
    void findEmployee() {
        // ищем сотрудника по его id
        assertEquals(e[1], company.findEmployee(102));
        // ищем несуществующего сотрудника
        assertNull(company.findEmployee(105));
    }

    @Test
    void quantityTest() {
        assertEquals(4, company.quantity());
    }

    @Test
    void totalSalaryTest() {
        assertEquals(12100, company.totalSalary());
    }

    @Test
    void averageSalaryTest() {
        assertEquals(3025, company.averageSalary());
    }

    @Test
    void totalSalesTest() {
        assertEquals(55000, company.totalSales());
    }

    @Test
    void printEmployee() {
        company.printEmployee();
    }

    @Test
    void findEmployeesHoursGraterThanTest() {
        Employee[] actual = company.findEmployeesHoursGraterThan(100);
        Employee[] expected = {e[0], e[1], e[2]};
        assertArrayEquals(expected, actual);
    }

    @Test
    void findEmployeesSalaryRangeTest() {
        company.printEmployee();
        Employee[] actual = company.findEmployeesSalaryRange(2900, 6000);
        Employee[] expected = {e[0], e[2]};
        assertArrayEquals(expected, actual);
        System.out.println(Arrays.toString(actual));;
    }
}