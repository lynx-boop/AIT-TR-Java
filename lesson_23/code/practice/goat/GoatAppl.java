package practice.goat;
import practice.goat.model.Goat;

public class GoatAppl {
    public static void main(String[] args) {
        Goat goatling1 = new Goat("Petya");
        for (int i = 0; i < 10; i++) {
            goatling1.increment();
        }

        Goat goatling2 = new Goat("Vasya");
        for (int i = 0; i < 18; i++) {
            goatling2.increment();
        }
        System.out.println(goatling2);
        System.out.println(goatling1);
        System.out.println(Goat.COUNT_MAX);
    }
}
