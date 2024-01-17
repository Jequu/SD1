package viikko1;
import java.util.Scanner;
import java.text.DecimalFormat;

public class Kimppakyyti {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat desi = new DecimalFormat("0.00");
        System.out.println("Anna ajetut kilometrit:");
        Double km = scanner.nextDouble();
        System.out.println("Anna kulutus per 100 km:");
        Double kulutus = scanner.nextDouble();
        System.out.println("Anna polttoaineen litrahinta:");
        Double Lhinta = scanner.nextDouble();
        System.out.println("Anna kimppakyytiläisten lukumäärä:");
        Double persons = scanner.nextDouble();
        Double bensaK = (km * kulutus / 100.0*Lhinta/persons);
        System.out.println("Bensakustannus per henkilö on " + desi.format(bensaK) + " euroa");
        scanner.close();
    }
}
