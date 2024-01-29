package viikko3;
import java.util.Scanner;
import java.text.DecimalFormat;

public class Kotitalousvahennys {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat Dformat = new DecimalFormat("0.00");
        double yhteensa = 0;
        while (true) {
            System.out.println("Anna työkorvauksen määrä (0 lopettaa):");
            double korvaus = scanner.nextDouble();

            if (korvaus == 0) {
                break;
            }
            
            yhteensa += korvaus;

        }
        
        double koti = yhteensa * 0.5 - 100; 
        if (koti <= 100) {
            koti = 0;

        } else if (koti >= 2400) {
            koti = 2400;
        }
        System.out.println("Kotitalousvähennyksen määrä on " + Dformat.format(koti) + " euroa");
        scanner.close();
    }
}