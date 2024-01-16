package viikko1;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Maalaus {
    public static void main(String[] args) {
    Scanner scanneri = new Scanner(System.in);
    System.out.print("Anna huoneen leveys, pituus ja korkeus: ");
    double leveys = scanneri.nextDouble();
    double pituus = scanneri.nextDouble();
    double korkeus = scanneri.nextDouble();
    System.out.print("Paljonko litralla saadaan maalattua neliöitä: ");
    double litra = scanneri.nextDouble();
    double tulos = ((leveys + leveys + pituus + pituus) * korkeus / litra);
    DecimalFormat jani;
    jani = new DecimalFormat("0.00");
    System.out.print("Maalin tarve on " + jani.format(tulos) + " litraa");
    scanneri.close();

    }
    }
