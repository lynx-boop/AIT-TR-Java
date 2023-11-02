package homework.lucky;

public class LuckyPelmenAppl {
    public static void main(String[] args) {
        // часть 1
        int[] array = new int[30];
        LuckyPelmenMeth.getRandomArray(array, 25, 35);
        LuckyPelmenMeth.printArray(array);

        //часть 2
        int lucky = LuckyPelmenMeth.randomNumberGenerator(0, array.length - 1);
        array[lucky] += 15;

        LuckyPelmenMeth.printArray(array);
        System.out.println("Lucky pelmen`s index is: " + LuckyPelmenMeth.maxArrayIndex(array));
    }
}
