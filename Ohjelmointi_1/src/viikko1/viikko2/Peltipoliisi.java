package viikko1.viikko2;
import java.util.Scanner;
import java.text.DecimalFormat;

public class Peltipoliisi {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
         DecimalFormat df = new DecimalFormat("0.00");

         System.out.println("Anna nopeutesi: ");
         int nopeus = scanner.nextInt();
        

         if (nopeus > 80 && nopeus <= 100 ) {
            System.out.println("Rikesakko");
         }
         else if (nopeus >= 100) {
            System.out.println("Päiväsakko");
            System.out.println("Anna nettokuukausitulosi: ");
            double tulot = scanner.nextDouble();
            double paivasakko = (tulot - 255)/60;

            if (paivasakko <= 6.00) {
                paivasakko = 6.00;
            }

         System.out.println("Päiväsakon määrä on " + df.format(paivasakko) + " euroa");
         }
         else {
            System.out.println("Ei sakkoja");
         }
         
         scanner.close();
    }
}
