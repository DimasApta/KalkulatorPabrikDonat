package uap.models;

import uap.bases.DonutBase;
import uap.interfaces.Printable;

public class Sphere extends DonutBase implements Printable {
    private double r;

    public Sphere(double r) {
        this.r = r;
    }

    @Override
    public double getVolume() {
        return (4.0 / 3.0) * PI * r * r * r;
    }

    @Override
    public double getSurfaceArea() {
        return 4 * PI * r * r;
    }

    @Override
    public void printInfo() {
        System.out.println("=============================================");
        System.out.println("Volume : " + getVolume());
        System.out.println("Luas permukaan : " + getSurfaceArea());
        System.out.println("Massa : " + getMass());
        System.out.println("Massa dalam kg : " + getMassKg());
        System.out.println("Biaya kirim : Rp" + getShippingCost());
        System.out.println("=============================================");
    }
}
