package uap.bases;

public abstract class DonutBase {
    protected final double PI = 22.0 / 7;
    protected final double density = 8.03; // gr/cm³
    protected final double thickness = 0.5; // cm

    public abstract double getVolume();
    public abstract double getSurfaceArea();

    public double getMass() {
        return getSurfaceArea() * thickness * density;
    }

    public double getMassKg() {
        return getMass() / 1000.0;
    }

    public int getShippingCost() {
        return (int) Math.ceil(getMassKg()) * 5000;
    }
}
