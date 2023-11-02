package homework;
import java.util.Scanner;
//Пользователь с клавиатуры вводит число от 1 до 12.
//Программа сообщает, какому времени года принадлежит введенный месяц.
public class Seasons6 {
    public static void main(String[] args) {
        //объявляем переменную, в которую будем записывать то, что введет пользователь
        int num;
        //заводим экземпляр класса Scanner в переменной scanner
        Scanner scanner = new Scanner(System.in);
        //говорим пользователю ввести число от 1 до 12
        System.out.println("Input a number between 1 and 12: ");
        //"заставляем" переменную "слушать" и записывать в себя то, что напечатает пользователь
        num = scanner.nextInt();

        switch (num) {
            //12, 1, 2 - это ноябрь, декабрь и январь, значит - зима, печатаем это в консоль:
            case 12, 1, 2:
                System.out.println(num + " is a winter!");
                break;
            case(3),(4),(5):
                System.out.println(num + " is a spring!");
                break;
            case(6),(7),(8):
                System.out.println(num + " is a summer!");
                break;
            case(9),(10),(11):
                System.out.println(num + " is a autumn!");
                break;
            default:
                System.out.println("You entered the wrong number!");
        }
    }
}
