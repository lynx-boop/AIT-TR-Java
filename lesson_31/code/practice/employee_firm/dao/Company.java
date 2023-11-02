package practice.employee_firm.dao;

import practice.employee_firm.model.Employee;

// - добавить сотрудника
//- удалить сотрудника
//- найти сотрудника
//- кол-во сотрудников
//- ФОТ
//- средняя з/п
//- объем продаж
//- напечатать список сотрудников
public interface Company {
    // объявляем методы, абстрактность объявлять не нужно, т.к. интерфейс это уже подразумевает
    boolean addEmployee(Employee employee);
    Employee removeEmployee(int id); //возвращаем тип данных Employee
    Employee findEmployee(int id);
    int quantity();
    double totalSalary(); // зарплата всех
    double averageSalary();
    double totalSales(); //объем продаж
    void printEmployee();
    //-----------------------------------------------------------------------------------------
    //еще два метода для Employee - Company: поиск элементов массива, удовлетворяющих условиям:
    //список работников, у которых отработано больше часов, чем...
    Employee[] findEmployeesHoursGraterThan(int hours);
    //список работников, у которых зарплата в интервале от... и до...
    Employee[] findEmployeesSalaryRange(int minSalary, int maxSalary);
}
