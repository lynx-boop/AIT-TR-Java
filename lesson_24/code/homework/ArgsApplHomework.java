package homework;

public class ArgsApplHomework {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("All MIN and MAX");
        }

        for (int i = 0; i < args.length; i++) {
            switch (args[i]) {
                case "byte" -> {
                    System.out.println("Byte MIN = " + Byte.MIN_VALUE);
                    System.out.println("Byte MAX = " + Byte.MAX_VALUE);
                }
                case "short" -> {
                    System.out.println("Short MIN = " + Short.MIN_VALUE);
                    System.out.println("Short MAX = " + Short.MAX_VALUE);
                }
                case "int" -> {
                    System.out.println("Int MIN = " + Integer.MIN_VALUE);
                    System.out.println("Int MAX = " + Integer.MAX_VALUE);
                }
                case "long" -> {
                    System.out.println("Long MIN = " + Long.MIN_VALUE);
                    System.out.println("Long MAX = " + Long.MAX_VALUE);
                }
                case "char" -> {
                    System.out.println("Char MIN = " + Character.MIN_VALUE);
                    System.out.println("Char MAX = " + Character.MAX_VALUE);
                }
                case "float" -> {
                    System.out.println("Float MIN = " + Float.MIN_VALUE);
                    System.out.println("Float MAX = " + Float.MAX_VALUE);
                }
                case "double" -> {
                    System.out.println("Double MIN = " + Double.MIN_VALUE);
                    System.out.println("Double MAX = " + Double.MAX_VALUE);
                }
                default -> System.out.println("Wrong type: " + args[i]);
            }
        }
    }
}
