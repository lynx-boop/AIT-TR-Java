// Задача 6. Бизнесмен взял ссуду m тысяч рублей в банке под 10% годовых.
// Через сколько лет его долг превысит s тысяч рублей, если за это время он не будет отдавать долг.

public class Debt {
    public static void main(String[] args) {
        double loan = 400000;
        double percent = 0.1;
        int s = 1000000;
        int countYears = 0;

        while (loan < s) {
            loan = loan + loan*percent;
            countYears++;
        }
        System.out.println("Your loan will turn into a nightmare in: " + countYears + " years");
    }
}
