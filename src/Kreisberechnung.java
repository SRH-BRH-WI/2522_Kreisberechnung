import java.util.Scanner;

public class Kreisberechnung {
    public static void main(String[] args) {
        Scanner eingabe = new Scanner(System.in);
        System.out.print("Bitte Radius eingeben: ");
        float radius = eingabe.nextFloat();

        // explizite Typkonvertierung (double -> float)
        float fläche = 3.1415F * radius * radius;
        float umfang = 2 * (float)Math.PI * radius;

        System.out.println("Kreisfläche: " + fläche);
        System.out.println("Umfang:      " + umfang);
    }
}
