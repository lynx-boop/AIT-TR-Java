package practice.employee_firm.dao;

import practice.employee_firm.model.Employee;
import practice.employee_firm.model.SalesManager;

import java.util.concurrent.RecursiveTask;

public class CompanyImplement implements Company {
    // поля, которые описывают компанию
    private Employee[] employees; //массив, где будут храниться все сотрудники
    private int size; //текущее кол-во сотрудников в компании

    //конструкторы
    public CompanyImplement(int capacity) {
        employees = new Employee[capacity];
    };
    @Override
    public boolean addEmployee(Employee employee) {
        //не ддобавляем null
        //не превышаем capacity
        //не добавляем уже существующий элемент
        if(employee == null || size == employees.length || findEmployee(employee.getId()) != null) {
            return false;
        }
//        employees[size] = employee;
//        size++;
        employees[size++] = employee; //++ постфиксная операция, ++ выполнится следующим шагом
        return true;
    }

    @Override
    public Employee removeEmployee(int id) {
        for (int i = 0; i < size; i++) {
            if(employees[i].getId() == id) {
                Employee fired = employees[i]; //сохранили на всякий случай удаляемый объект
//                employees[i] = employees[size - 1]; //на место найденного ставим последнего существующего в массиве
//                employees[size - 1] = null; //обнулили последнего
//                size--; //сократили размер массива
                employees[i] = employees[--size]; //-- префиксная операция, эта строка равна 36 строке
                employees[size] = null;
                return fired;
            }
        }
        return null;
    }

    @Override
    public Employee findEmployee(int id) {
        for (int i = 0; i < size; i++) {
            if(employees[i].getId() == id) {
                return employees[i]; //вернули найденный элемент массива типа Employee
            } //если совпал id
        }
        return null;
    }

    @Override
    public int quantity() {
        return size;
    }

    @Override
    public double totalSalary() {
        double res = 0;
        for (int i = 0; i < size; i++) {
            res+= employees[i].calcSalary();
        }
        return res;
    }

    @Override
    public double averageSalary() {
        return totalSalary()/size;
    }

    @Override
    public double totalSales() {
        double res = 0;
        for (int i = 0; i < size; i++) {
            if(employees[i] instanceof SalesManager){
                SalesManager salesManager = (SalesManager) employees[i]; //downcasting
                res += salesManager.getSalesValue();
            }
        }
        return res;
    }

    @Override
    public void printEmployee() {
        for (int i = 0; i < size; i++) {
            System.out.println(employees[i]);
        }
    }
    //Для выборки элементов из массива, удовлетворяющих заданному условию, надо:
    //сначала подсчитать количество элементов массива, удовлетворяющих условию.
    //потом создать массив под это количество,
    //и только потом его заполнить.
    @Override
    public Employee[] findEmployeesHoursGraterThan(int hours) {
        int count = 0;
        //считаем сколько будет элементов массива, удовлетворяющих условию
        for (int i = 0; i < size; i++) {
            if(employees[i].getHours() >= hours) {
                count++;
            }
        }
        //создаем массив размера count
        Employee[] result = new Employee[count];
        //заполняем массив result
        for (int i = 0, j = 0; j < result.length; i++) {
            if (employees[i].getHours() >= hours) {
//                result[j] = employees[i];
//                j++; - заменяем эти строки постфиксной операцией:
                result[j++] = employees[i];
            }
        }
        return result; //это возвращаемый массив
    }

    @Override
    public Employee[] findEmployeesSalaryRange(int minSalary, int maxSalary) {
        //считаем сколько будет элементов массива, удовлетворяющих условию
        int count = 0;
        for (int i = 0; i < size; i++) {
            if(employees[i].calcSalary() > minSalary && employees[i].calcSalary() < maxSalary) {
                count++;
            }
        }
        //создаем массив размера count
        Employee[] result = new Employee[count];
        for (int i = 0, j = 0; j < result.length; i++) {
            if (employees[i].calcSalary() > minSalary && employees[i].calcSalary() < maxSalary) {
//                result[j] = employees[i];
//                j++; - заменяем эти строки постфиксной операцией:
                result[j++] = employees[i];
            }
        }
        return result; //это возвращаемый массив
    }
}
