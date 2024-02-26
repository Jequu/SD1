package viikko6;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Kulutus {

    int kysyKilometrit() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Anna ajetut kilometrit: ");
        int kilometrit1 = scanner.nextInt();
        return kilometrit1;
    }

    double kysyTankkaus() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Anna tankattu määrä: ");
        double maara = scanner.nextDouble();
        return maara;

    }

    double laskeKulutus(int kilometrit, double tankattu) {
        int kilometrit = kysyKilometrit();
        double tankattu = kysyTankkaus();
    }

    void naytaKulutus(double kulutus) {

        
    }

    public static void main(String[] args) {
    
    Scanner scanner = new Scanner(System.in);
    DecimalFormat Dform = new DecimalFormat("0.00");

    System.out.println("Anna ajetut kilometrit: ");
    }

}
