//package viikko6;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Laakarikorvaus {
    
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    DecimalFormat Dform = new DecimalFormat("0.00");
    System.out.println("Anna käynnin kesto:");
    int kk = scanner.nextInt();
    System.out.println("Kestoltaan " + kk + "minuutin yleislääkärikäynnistä kelakorvaus on " + Dform.format(laskeKorvaus(kk)) + " euroa");
    }

    public static double laskeKorvaus(int kesto) {
    double korvaus;
    if (kesto <=10) {
        korvaus = 8.00;
    } else if (kesto <= 20) {
        korvaus = 11.00;
    } else {
        korvaus = 13.50;
    }
    return korvaus;

}
}
