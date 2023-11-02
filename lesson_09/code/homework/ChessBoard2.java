package homework;

public class ChessBoard2 {
    public static void main(String[] args) {

        int x = 0;
        int y = 0;

        while (x < 8) {
            while (y < 8) {
                System.out.print((x + y) % 2 + " | ");
                y++;
            }
            System.out.println();
            y = 0;
            x++;
        }
    }
}