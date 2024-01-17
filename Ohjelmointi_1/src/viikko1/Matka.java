package viikko1;
import java.util.Scanner;
import java.text.DecimalFormat;

public class Matka {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat dec = new DecimalFormat("#,###.##");
        System.out.println("Anna matka: ");
        int matka = scanner.nextInt();
        System.out.println("Anna nopeus: ");
        double nopeus = scanner.nextDouble();
        double aika = (double)(matka / nopeus);
        System.out.println("Aikaa menee " + dec.format(aika));


    }
}
