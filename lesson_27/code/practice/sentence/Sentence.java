package practice.sentence;

public class Sentence {

    // Count words in Sentence
    public static int countWords(String str) {
        String[] words = str.split("[\\s,.:?!;()&*@#%^']"); //разделяем предложение на слова
        return words.length;
    }
    // Count symbols in Sentence
    public int countSymbols(String str) {
        String letters = str.replaceAll("[^a-zA-Z]", "");
        return letters.length();
    }
}
