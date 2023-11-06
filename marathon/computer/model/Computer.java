package computer.model;

import practice.computer.model.Computer21;

public class Computer {
    protected String cpu;
    protected int ram;
    protected int ssd;
    protected String brand;

    public Computer() {
        super();
    }

    public Computer(String cpu, int ram, int ssd, String brand) {
        super();
        this.cpu = cpu;
        this.ram = ram;
        this.ssd = ssd;
        this.brand = brand;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getSsd() {
        return ssd;
    }

    public void setSsd(int ssd) {
        this.ssd = ssd;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Brand: " + brand + ", CPU: " + cpu + ", RAM: " + ram + ", SSD: " + ssd;
    }

    @Override
    // передаем методу какой-то объект, который метод будет сранивать с теми данными, что хранятся
    // на вызываемом объекте
    public boolean equals(Object object) {
        if (!(object instanceof Computer21)) {
            return false;
        }
        Computer21 other = (Computer21) object;
        return cpu.equals(other.cpu) && ram == other.ram && ssd == other.ssd && brand.equals(other.brand);
    }
}