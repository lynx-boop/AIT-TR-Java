package homework;

public class Code {
    public static void main(String[] args) {
        long code = 1234567890123L;
        System.out.println(lengthCode(code));
        System.out.println(controlSum(code));
        System.out.println(isValid(code));
    }
    public static int lengthCode(long code) {
        int counter = 0;
        long num = code;

        while (num > 0) {
            num = num / 10;
            counter++;
        }
        return counter;
    }

    public static long controlSum(long code) {
        long sum = 0;
        while(code > 0) {
            long digit = code % 10;
            sum += digit;
            code = code / 10;
        }
        return sum;
    }

    public static boolean isValid(long code) {
        return lengthCode(code) >= 8 && lengthCode(code) <= 13;
    }
}
