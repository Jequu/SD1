package viikko7;
import java.util.Scanner;
public class RemonttiOhjelma {
    

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        Remontti remontti1 = new Remontti();
        System.out.println("Anna vuosi: ");
        int vuosi = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Anna kuvaus: ");
        String kuvaus = scanner.nextLine();

        remontti1.setKuvaus(kuvaus);
    

        if (!remontti1.setVuosi(vuosi)) {
            System.out.println("Vuosi ei voi olla tulevaisuudessa");

        } else{
            System.out.println("Vuonna " + remontti1.getVuosi() + " tehtiin remontti" + remontti1.getKuvaus());

        }
    }
}
