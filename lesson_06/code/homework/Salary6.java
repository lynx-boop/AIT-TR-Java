package homework;
import java.util.Scanner;
//Напишите программу расчета выдачи денег работнику с учётом надбавки за стаж, если базовая зарплата 500$.
//За 3 года работы надбавка 10%, за 5 лет работы надбавка 50%, за 10 лет работы надбавка 100%.
//За 15 лет работы надбавка 150%. Сколько лет проработал работник вводится с клавиатуры.
public class Salary6 {
    public static void main(String[] args) {
        //объявляем переменную с базовой зп
        int baseSalary = 500;
        //объявляем ниже проценты за выслугу лет
        //в этот раз обойдемся без "сложной математики" в коде и заранее запишем в переменные готовые числа
        double increase3 = 0.1;
        double increase5 = 0.5;
        double increase10 = 1;
        double increase15 = 1.5;
        double increasedSalary;
        //объявляем переменную, в которую будем записывать то, что введет пользователь
        int experience;

        //заводим экземпляр класса Scanner в переменной scanner
        Scanner scanner = new Scanner(System.in);
        //говорим пользователю ввести количество отработанных лет
        System.out.println("Input years of yout experience: ");
        //"заставляем" переменную "слушать" и записывать в себя то, что напечатает пользователь
        experience = scanner.nextInt();
        //далее используем оператор множественного выбора, чтобы показать пользователю
        //соответствующий введенной им цифре "значение в case"
        switch (experience) {
            //записываем в case через запятую все значения, которые помещаются в диапазон между 3 и 4
            case (3),(4):
                //вызываем метод, подставляем в него нужные данные и записываем результат в переменную
                increasedSalary = increasingSalary(baseSalary, increase3);
                System.out.println("Your salary is: " + increasedSalary);
                break;
            case (5),(6),(7),(8),(9):
                increasedSalary = increasingSalary(baseSalary, increase5);
                System.out.println("Your salary is: " + increasedSalary);
                break;
            case (10),(11),(12),(13),(14):
                increasedSalary = increasingSalary(baseSalary, increase10);
                System.out.println("Your salary is: " + increasedSalary);
                break;
            case (15):
                increasedSalary = increasingSalary(baseSalary, increase15);
                System.out.println("Your salary is: " + increasedSalary);
                break;
            default:
                System.out.println("If your experience less than 3 years, your salary is: " + baseSalary);
                System.out.println("If your experience more than 15 years, your salary is maximum: " + increasingSalary(baseSalary, increase15));
                break;
        }
    }
    //заводим метод для рачета зарплаты
    public static double increasingSalary(int base, double increase) {
        return base+base*increase;
    };
}
