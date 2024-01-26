package viikko2;
import java.util.Scanner;
import java.text.DecimalFormat;

public class Pizza {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
         DecimalFormat df = new DecimalFormat("0.00");

         System.out.println("Anna pizzojen hinnat (3): ");
         Double hinta1 = scanner.nextDouble();
         Double hinta2 = scanner.nextDouble();
         Double hinta3 = scanner.nextDouble();
         Double halvin;

        if (hinta1 < hinta2 && hinta1 <hinta3) {
            halvin = hinta1;
        } else if (hinta2< hinta1 && hinta2 < hinta3) {
            halvin = hinta2;
        } else {
            halvin = hinta3;
        }

        double summa = hinta1 + hinta2 + hinta3 - halvin;
        System.out.println("Maksettavaa: " + df.format(summa));
        System.out.println("Yksittäisen hinta: " + df.format(summa/3));
        scanner.close();
    }
}