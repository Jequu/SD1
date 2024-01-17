package viikko1;
import java.util.Scanner;
import java.text.DecimalFormat;

public class Matka {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat formatti = new DecimalFormat("0.00");
        System.out.print("Anna matka: ");
        double matka = scanner.nextDouble();
        System.out.print("Anna nopeus: ");
        double nopeus = scanner.nextDouble();
        double aika = (double)matka / nopeus;
        System.out.print("Aikaa menee " + formatti.format(aika) + " tuntia");
        scanner.close();

        


    }
}
