package viikko4;
import java.util.Scanner;
import java.text.DecimalFormat;;

public class Tuotteet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat Dform = new DecimalFormat("0.00");
        int tuotenumero = 0;
        double tuotehinta = 0;
        
        
        System.out.println("Anna tuotenumero:");
        tuotenumero = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Anna tuotteen nimi:");
        String tuotenimi = scanner.nextLine().trim().toUpperCase();
        System.out.println("Anna tuotteen hinta:");
        tuotehinta = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Anna tuotteen kuvaus:");
        String tuotekuvaus = scanner.nextLine().trim();

        System.out.println("Numero: "+ tuotenumero);
        System.out.println("Nimi: "+ tuotenimi);
        System.out.println("Hinta: " + Dform.format(tuotehinta));
        System.out.println("Kuvaus: " + tuotekuvaus);
        scanner.close();
    }
}
