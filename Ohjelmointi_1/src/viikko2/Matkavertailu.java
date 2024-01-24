package viikko2;
import java.util.Scanner;

import java.text.DecimalFormat;

public class Matkavertailu {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
         DecimalFormat df = new DecimalFormat("0.00");

        System.out.println("Montako matkaa teet kuukaudessa: ");
        int matkat = scanner.nextInt();
        System.out.println("Anna yksittäisen lipun hinta: ");
        double lippu = scanner.nextDouble();
        System.out.println("Anna kuukausilipun hinta: ");
        double klippu = scanner.nextDouble();
        double yksi = matkat*lippu;
        double yk = yksi - klippu;
        double ky = klippu - yksi;

        if (yksi > klippu) {
            System.out.println("Kuukausilippu on " + df.format(yk)+ " euroa halvempi kuin yksittäinen");

        } else {
            System.out.println("Yksittäinen on " + df.format(ky) + " euroa halvempi kuin kuukausilippu");
        }   
        scanner.close();

    }
}