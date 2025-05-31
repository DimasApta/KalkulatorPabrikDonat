package uap.models;

import uap.bases.DonutBase;
import uap.interfaces.Printable;

public class Torus extends DonutBase implements Printable {
    private double R;
    private double r;

    public Torus(double R, double r) {
        this.R = R;
        this.r = r;
    }

    @Override
    public double getVolume() {
        return 2 * PI * PI * R * r * r;
    }

    @Override
    public double getSurfaceArea() {
        return 4 * PI * PI * R * r;
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
