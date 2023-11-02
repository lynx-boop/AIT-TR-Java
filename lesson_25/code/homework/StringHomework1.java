package homework;

public class StringHomework1 {
    public static void main(String[] args) {
        String str = "I'm proud to learn Java! Java is the most famous programming language!!!";

        System.out.println("1. Last symbol of string: " + str.charAt(str.length() - 1));

        int index1 = str.indexOf("Java");
        System.out.println("2. Position of substring \"Java\" is: " + index1);

        if (index1 >= 0) {
            System.out.println("3. This string contains substring \"Java\"");
        } else System.out.println("3. This string doesn't contains substring \"Java\"");

        System.out.println("4. Let's replace all \"o\" to \"a\": " + str.replace("o", "a"));

        System.out.println("5. String to uppercase: " + str.toUpperCase());
        System.out.println("6. String to lowercase: " + str.toLowerCase());

        System.out.println("7. Lets cut \"Java\": " + str.substring(index1 - 1, index1 + 4));

        String expectedEnd = "!!!";
        // выражение использует длину ожидаемого конца, чтобы сделать код более универсальным
        String actualEnd = str.substring(str.length() - expectedEnd.length(), str.length());
        if (expectedEnd.equalsIgnoreCase(actualEnd)) {
            System.out.println("8. Yes! String ends with " + "\"" + expectedEnd + "\"");
        } else System.out.println("8. No! String ends with " + actualEnd);

        String expectedStart = "I'm proud";
        String actualStart = str.substring(0, expectedStart.length());
        if (expectedStart.equalsIgnoreCase(actualStart)) {
            System.out.println("8. Yes! String ends with " + "\"" + expectedStart + "\"");
        } else System.out.println("8. No! String ends with " + actualStart);

    }
}