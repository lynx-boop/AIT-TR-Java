package practice.string_builder;

public class StringBuilderAppl {
    public static void main(String[] args) {
        String str = "Java";
        // str = str + "_" + 11
        str = str.concat("_");
        System.out.println(str);
        str = str.concat("" + 11); // склеивание
        System.out.println(str);

        // StringBuilder - mutable!!! Он мутирует!
        StringBuilder sb = new StringBuilder("Java");
        sb.append("_").append(11); // добавление
        System.out.println(sb);
        sb.reverse(); //строка задом наперед
        System.out.println(sb);
        // можно ли вернуть тип StringBuilder обратно в String?
        str = sb.toString(); // да, можно
        System.out.println(str);
    }
}
