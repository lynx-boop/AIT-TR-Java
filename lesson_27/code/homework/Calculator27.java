package homework;

public class Calculator27 {
    public int addition(int num1, int num2) {
        return num1+num2;
    }
    public int subtraction(int num1, int num2) {
        int res;
        if (num1 > num2) {
            res = num1-num2;
        } else {
            res = num2-num1;
        }
        return res;
    }

    public int multiplication(int num1, int num2) {
        return num1*num2;
    }

    public int division(int num1, int num2) {
        int res;
        if (num1 > num2) {
            res = num1/num2;
        } else {
            res = num2/num1;
        }
        return res;
    }
    public int remainder(int num1, int num2) {
        int res;
        if (num1 > num2) {
            res = num1%num2;
        } else {
            res = num2%num1;
        }
        return res;
    }
}
