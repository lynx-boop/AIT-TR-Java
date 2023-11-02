package homework;

public class Cube {
    public static void main(String[] args) {
        // V = a*a*a where a is a side of cube
        // V = a*a*a, где а - это сторона куба
        System.out.println("Volume of cube = " + cubeVolume(2));
    }

    public static int cubeVolume(int a) {
        return a*a*a;
    }
}
