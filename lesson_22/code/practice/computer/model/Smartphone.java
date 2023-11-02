package practice.computer.model;

public class Smartphone extends Laptop {
    final long imei;

    public Smartphone(String cpu, int ram, int ssd, String brand, double hours, double weight, long imei) {
        super(cpu, ram, ssd, brand, hours, weight);
        this.imei = imei;
    }

    public long getImei() {
        return imei;
    }

    public String toString() {
        return super.toString() + ", IMEI: " + imei;
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof Smartphone)) {
            return false;
        }
        Smartphone other = (Smartphone) object;
        return imei == other.imei;
    }
}