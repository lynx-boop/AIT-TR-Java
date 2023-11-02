package practice.computers.model;

public class Computer {
    private String cpu;
    private int ram;
    private int hdd;
    private String brand;

    public Computer(String cpu, int ram, int hdd, String brand) {
        this.cpu = cpu;
        this.ram = ram;
        this.hdd = hdd;
        this.brand = brand;
    }

    public String getCpu() {
        return cpu;
    }

    public int getRam() {
        return ram;
    }

    public int getHdd() {
        return hdd;
    }

    public String getBrand() {
        return brand;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public void setHdd(int hdd) {
        this.hdd = hdd;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override //переопределение родительского метода
    public String toString() {
        return "Computer{" +
                "cpu='" + cpu + '\'' +
                ", ram=" + ram +
                ", hdd=" + hdd +
                ", brand='" + brand + '\'' +
                '}';
    }
}
