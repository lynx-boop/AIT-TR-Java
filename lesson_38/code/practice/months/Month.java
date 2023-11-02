package practice.months;

import java.util.Arrays;

public enum Month {
    //-------------------------VALUES (CONSTANTS)-----------------------------
    JAN("January", 31),
    FEB("February", 28),
    MAR("March", 31),
    APR("April", 30),
    MAY("May", 31),
    JUN("June", 30),
    JUL("July", 31),
    AUG("Agust", 31),
    SEP("September", 30),
    OCT("October", 31),
    NOV("November", 30),
    DEC("December", 31);
    //-------------------------------FIELDS-----------------------------------
    private String name;
    private int days;
    //-----------------------------CONSTRUCTOR--------------------------------
    Month(String name, int days) {
        this.name = name;
        this.days = days;
    }
    //--------------------------GETTERS AND SETTERS --------------------------
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }
    //-------------------------------METHODS----------------------------------

    //Задайте emun Month, определите месяца, их наименования и количество в них дней.
    //Реализуйте метод, позволяющий прибавлять месяца к выбранному, получая правильный месяц.
    //Пример: AUG + 6 month = FEB
    //Проверьте работу метода в приложении.

    //метод для увеличения кол-ва месяцев
    public Month plusMonth(int quantity) {
        int index = ordinal(); //ordinal вернет текущий номер месяца, а для какого месяца - поймет из контекста
        //наращиваем его, увеличиваем кол-во месяцев:
        index += quantity;
        Month[] months = values(); //положили в массив значения всех наших констант
        return months[index % months.length]; //возвращаем объект типа Month, Index которого равен остатку от деления индекса на кол-во месяцев в массиве
    }
}
