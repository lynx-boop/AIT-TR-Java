package practice.employee_firm.model;

public abstract class Employee {
    // поля класса
    protected final int id;
    protected String firstName;
    protected String lastName;
    protected int age;
    protected double hours;

    public Employee(int id, String firstName, String lastName, int age, double hours) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.hours = hours;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public double getHours() {
        return hours;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setHours(double hours) {
        this.hours = hours;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Employee employee = (Employee) o;

        return id == employee.id;
    }

    @Override
    public int hashCode() {
        return id;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Employee ");
        sb.append("id = ").append(id);
        sb.append("Name = ").append(firstName);
        sb.append(", lastName = '").append(lastName).append('\'');
        sb.append(", hours = ").append(hours);
        sb.append(", salary = ").append(calcSalary());
        return sb.toString();
    }

    //определили абстрактный метод, абстрактные методы не имеют тела, но имею сигнатуру (имя)
    public abstract double calcSalary();
}
