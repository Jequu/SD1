package viikko1;
import java.util.Scanner;
import java.text.DecimalFormat;

public class Alv {
    public static void main(String[] args) {
        
    Scanner scanneri = new Scanner(System.in);
    DecimalFormat formatteri = new DecimalFormat("0.00");
    System.out.print("Anna 1. tuotteen hinta: ");
    double tuote1 = scanneri.nextDouble();
    double Alv1 = tuote1 - (tuote1 / 1.14);
    System.out.print("Tuotteen 1 ALV on " + formatteri.format(Alv1) + " euroa. ");
    System.out.print("Anna 2. tuotteen hinta: ");
    double tuote2 = scanneri.nextDouble();
    double Alv2 = tuote2 - (tuote2 / 1.14);
    System.out.print("Tuotteen 2 ALV on " + formatteri.format(Alv2) + " euroa. ");
    System.out.print("Anna 3. tuotteen hinta: ");
    double tuote3 = scanneri.nextDouble();
    double Alv3 = (tuote3 - tuote3 / 1.14);
    System.out.print("Tuotteen 3 ALV on " + formatteri.format(Alv3) + " euroa. ");
    scanneri.close();
    }
    
}
