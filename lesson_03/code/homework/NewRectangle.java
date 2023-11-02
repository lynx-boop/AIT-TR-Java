package homework;
public class NewRectangle {
    public static void main(String[] args) {
        //S = a × b, где S это площадь прямоугольника; a,b - длина и ширина соответсвенн
        vivodVKonsol(rasschitatPloshad(1,2));
    }
    public static int rasschitatPloshad(int a, int b) {
        int s = a * b;
        return s;
    }

    public static void vivodVKonsol(int resultat){
        System.out.println(resultat);
    };

}
