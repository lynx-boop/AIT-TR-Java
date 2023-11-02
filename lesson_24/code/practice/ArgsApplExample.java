package practice;

public class ArgsApplExample {
    public static void main(String[] args) {
        //String[] args - это массив типа String, зовут его args
        //в этот массив можно передавать данные при старте программы из командной строки
        String str0 = args[0];
        int num0 = Integer.parseInt(str0);

        String str1 = args[1];
        int num1 = Integer.parseInt(str1);

        System.out.println(str0 + " * " + str1 + " = " + num0*num1);
    }
}
