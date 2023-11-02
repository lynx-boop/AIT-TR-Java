package practice.string_builder;

public class StringPerformanceTest {
    private static final int N_ITERATION = 100_000; // определяем константу
    private static final String WORD = "Word"; // определяем константу
    public static void main(String[] args) {
        String str = ""; //инициировали пустую строку
        long t1 = System.currentTimeMillis(); // время внутри компьютера течет в миллисекундах, тут мы засекаем время
        for (int i = 0; i < N_ITERATION; i++) {
            str = str + WORD;
        }
        long t2 = System.currentTimeMillis(); // вторая засечка времени
        System.out.println("How much time was taken: " + (t2-t1)); //сколько времени прошло в милисекундах

        StringBuilder stringBuilder = new StringBuilder("");
        t1 = System.currentTimeMillis(); // время внутри компьютера течет в миллисекундах, тут мы засекаем время
        for (int i = 0; i < N_ITERATION; i++) {
            stringBuilder.append(WORD);
        }
        str = stringBuilder.toString();
        t2 = System.currentTimeMillis(); // вторая засечка времени
        System.out.println("How much time was taken: " + (t2-t1)); //сколько времени прошло в милисекундах
        // с StringBuilder заняло намного меньше времени, потому что он мутируемый, а String - нет!
        // String каждый раз создает новый объект и не мутируется, поэтому занимает столько времени
    }

}
