package homework;
// Print 8x8 chessboard onto your screen.
// 0 - white cell, 1 - black.
// The top left cell should be 0, the bottom left cell should be 1.
public class Chessboard {
    public static void main(String[] args) {
        int chess = 0;
        int countString1 = 1;
        int countString2 = 1;
        int countColumn = 1;

        while (countColumn <= 4) {
            while (countString1 <= 8) {
                if (chess == 0) {
                    System.out.print("0" + " | ");
                    chess += 1;
                } else {
                    System.out.print("1" + " | ");
                    chess -= 1;
                }
                countString1++;
            }
            System.out.println();

            while (countString2 <= 8) {
                if (chess == 0) {
                    System.out.print("1" + " | ");
                    chess += 1;
                } else {
                    System.out.print("0" + " | ");
                    chess -= 1;
                }
                countString2++;
            }
            System.out.println();
            countString1 = 1;
            countString2 = 1;
            countColumn++;
        }
    }
}
