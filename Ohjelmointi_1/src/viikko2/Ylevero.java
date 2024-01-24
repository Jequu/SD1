package viikko2;
import java.util.Scanner;
import java.text.DecimalFormat;

public class Ylevero {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
         DecimalFormat df = new DecimalFormat("0.00");

         System.out.println("Anna vuositulosi ja ikäsi: ");
         double vuositulosi =  scanner.nextDouble();
         int ika = scanner.nextInt();

         double Ylevero = vuositulosi * 0.68/100;

         if (Ylevero >= 140) {
            Ylevero = 140;
         } else if ( Ylevero < 70) {
            Ylevero = 0;
         }
         
         if (ika<18) {
            Ylevero = 0;
         }

         System.out.println("Ylevero on " + df.format(Ylevero));
         scanner.close();
        }

}