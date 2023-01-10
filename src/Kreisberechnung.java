import java.util.Scanner;

public class Kreisberechnung {
    public static void main(String[] args) {
        Scanner eingabe = new Scanner(System.in);
        System.out.print("Bitte Radius eingeben: ");
        double radius = eingabe.nextDouble();

        // explizite Typkonvertierung (double -> float)
        double fläche = Math.PI * radius * radius;
        double umfang = 2 * Math.PI * radius;

        System.out.println("Kreisfläche: " + fläche);
        System.out.println("Umfang:      " + umfang);
    }
}
