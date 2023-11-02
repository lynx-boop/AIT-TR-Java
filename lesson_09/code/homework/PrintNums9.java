package homework;
//Print out all numbers less than 200 and multiples of 13
public class PrintNums9 {
        public static void main(String[] args) {
            int min = 1;
            int max = 200;
            int dis = 13;
            while (min < max) {
                if (min % dis == 0) {
                    System.out.print(min + ", ");
                }
                min++;
            }
        }
    }
