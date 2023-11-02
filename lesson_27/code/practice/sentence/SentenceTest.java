package practice.sentence;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SentenceTest {
    Sentence sentence; //поле класса типа Sentence

    @BeforeEach
    void setUp() {
        sentence = new Sentence(); //вызвали пустой конструктор, который есть по умолчанию у всех объектов
    }

    @Test
    void countWordsTest() {
        String str = "One, two – three.";
        assertEquals(3, sentence.countWords(str));
    }

    @Test
    void countSymbols() {
        String str = "One? Two. Three%";
        assertEquals(11, sentence.countSymbols(str));
    }
}