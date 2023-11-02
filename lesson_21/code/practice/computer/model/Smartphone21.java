package practice.computer.model;

public class Smartphone21 extends Laptop21 {
    private double screen;

    public Smartphone21(String cpu, int ram, int ssd, String brand, double hours, double weight, double screen) {
        super(cpu, ram, ssd, brand, hours, weight);
        this.screen = screen;
    }

    public double getScreen() {
        return screen;
    }

    public void setScreen(double screen) {
        this.screen = screen;
    }
}
