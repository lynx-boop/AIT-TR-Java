package homework;

public class StringHomework3 {
    public static void main(String[] args) {
        String string =
                "В 1800-х годах, в те времена, когда не было еще ни железных, ни шоссейных дорог, ни газового," +
                        "ни стеаринового света, ни пружинных низких диванов, ни мебели без лаку," +
                        "ни разочарованных юношей со стеклышками, ни либеральных философов-женщин," +
                        "ни милых дам-камелий, которых так много развелось в наше время, – в те наивные времена," +
                        "когда из Москвы, выезжая в Петербург в повозке или карете, брали с собой целую кухню" +
                        "домашнего приготовления, ехали восемь суток по мягкой, пыльной или грязной дороге и" +
                        "верили в пожарские котлеты, в валдайские колокольчики и бублики, – когда в длинные" +
                        "осенние вечера нагорали сальные свечи, освещая семейные кружки из двадцати и тридцати" +
                        "человек, на балах в канделябры вставлялись восковые и спермацетовые свечи, когда мебель" +
                        "ставили симметрично, когда наши отцы были еще молоды не одним отсутствием морщин и седых" +
                        "волос, а стрелялись за женщин и из другого угла комнаты бросались поднимать нечаянно и" +
                        "не нечаянно уроненные платочки, наши матери носили коротенькие талии и огромные рукава" +
                        "и решали семейные дела выниманием билетиков, когда прелестные дамы-камелии прятались" +
                        "от дневного света, – в наивные времена масонских лож, мартинистов, тугендбунда, во" +
                        "времена Милорадовичей, Давыдовых, Пушкиных, – в губернском городе К. был съезд помещиков," +
                        "и кончались дворянские выборы.";
        printResults(string);

    }

    private static int wordsInString (String str) {
        String[] string = str.split(" ");
        int count = 0;

        for (int i = 0; i < string.length - 1; i++) {
            if (!string[i].equals("–")) {
                count++;
            }
        }
        return count;
    }

    private static int lettersInString(String str) {
        String[] string = str.split("");
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if((!string[i].equals(" ")) ||
                    (!string[i].equals(",")) ||
                    (!string[i].equals("-")) ||
                    (!string[i].equals("–")) ||
                    (!string[i].equals(".")) ||
                    (!string[i].equals("!")) ||
                    (!string[i].equals(":")) ||
                    (!string[i].equals(";")) ||
                    (!string[i].equals("@")) ||
                    (!string[i].equals("(")) ||
                    (!string[i].equals(")"))) {

            }
            count++;
        }
        return count;
    }

    private static void printResults(String str) {
        System.out.println("Words in this string: " + wordsInString(str));
        System.out.println("Letters in this string: " + lettersInString(str));
    }
}