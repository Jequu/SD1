package viikko7;
import java.util.Scanner;
import java.text.DecimalFormat;

public class AsuntoOhjelma {
    
    public static void main(String[] args) {
        Asunto parametriton = new Asunto();
        Scanner scanner = new Scanner(System.in);
        DecimalFormat dfrom = new DecimalFormat("0.00");

        System.out.println("Anna asunnon tyyppi: ");
        String tyyppi = scanner.nextLine();
        System.out.println("Anna osoite: ");
        String osoite = scanner.nextLine();
        System.out.println("Anna pinta-ala: ");
        double pintaala = scanner.nextDouble();
        System.out.println("Anna hinta: ");
        double hinta = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Anna kuvaus: ");
        String kuvaus = scanner.nextLine();

        parametriton.setTyyppi(tyyppi);
        parametriton.setOsoite(osoite);
        parametriton.setPintaala(pintaala);
        parametriton.setHinta(hinta);
        parametriton.setKuvaus(kuvaus);

        System.out.println("Tyyppi: " + parametriton.getTyyppi());
        System.out.println("Osoite: " + parametriton.getOsoite());
        System.out.println("Pinta-ala: " + dfrom.format(parametriton.getPintaala()));
        System.out.println("Hinta: " + dfrom.format(parametriton.getHinta()) + " euroa");
        System.out.println("Kuvaus: " + parametriton.getKuvaus());
        
    }
}
