package homework;

public class Task4Swap {
    public static void main(String[] args) {
        int a = 15;
        int b = 20;

        System.out.println("a before swap: " + a);
        System.out.println("b before swap: " + b);
        a = a + b; //35
        b = a - b; //15
        a = a - b; //20
        System.out.println("a after swap: " + a);
        System.out.println("b after swap: " + b);
    }
}
