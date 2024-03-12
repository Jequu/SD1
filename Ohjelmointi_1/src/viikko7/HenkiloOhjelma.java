package viikko7;

import java.util.Scanner;

public class HenkiloOhjelma {
    
    public static void main(String[] args) {
        
        Henkilo HenkiloOhjelma = new Henkilo();
        Scanner scanner  = new Scanner(System.in);

        System.out.println("Anna nimi: ");
        String nimi = scanner.nextLine();
        System.out.println("Anna osoite ");
        String osoite = scanner.nextLine();

        HenkiloOhjelma.setNimi(nimi);
        HenkiloOhjelma.setOsoite(osoite);
        System.out.println(henkilo.toString());

    }
}
