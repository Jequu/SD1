package viikko6;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Kulutus {

    public static void main(String[] args) {
    
        Scanner scanner = new Scanner(System.in);
        int kilsat = kysyKilometrit();
        double tankkaus = kysyTankkaus();
        double kulutus = laskeKulutus(kilsat, tankkaus);
        naytaKulutus(kulutus);
        }

    public static int kysyKilometrit() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Anna ajetut kilometrit: ");
        return scanner.nextInt();
    }

    public static double kysyTankkaus() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Anna tankattu määrä: ");
        return scanner.nextDouble();
    }

    public static double laskeKulutus(int kilometrit, double tankattu) {
        return tankattu/kilometrit*100;
    }

    public static void naytaKulutus(double kulutus) {
        DecimalFormat Dform = new DecimalFormat("0.00");
        System.out.println("Kulutus/100km on " + Dform.format(kulutus) + " litraa" );
        
    }

    

}
