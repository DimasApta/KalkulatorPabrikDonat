package uap.mains;

import java.util.Scanner;
import uap.models.Torus;
import uap.models.Sphere;

public class KalkulatorPabrik {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=============================================");
        System.out.println("Kalkulator Pabrik Cetakan Donat Rumahan");
        System.out.println("Dimas Apta Zulfikri");
        System.out.println("225150707111051");
        System.out.println("=============================================");

        System.out.println("Donat dengan lubang");
        System.out.println("=============================================");
        System.out.print("Isikan Radius : ");
        double R = sc.nextDouble(); // 7
        System.out.print("Isikan radius : ");
        double r = sc.nextDouble(); // 3.5

        Torus torus = new Torus(R, r);
        torus.printInfo();

        System.out.println("Donat tanpa lubang");
        System.out.println("=============================================");
        System.out.print("Isikan radius : ");
        double rSphere = sc.nextDouble(); // 21

        Sphere sphere = new Sphere(rSphere);
        sphere.printInfo();

        sc.close();
    }
}
