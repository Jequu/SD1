package viikko6;

import java.util.Scanner;
import java.util.ArrayList;

public class Veriryhma {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> ryhma = new ArrayList<String>();
        int luovutukset = kysyVeriryhma(ryhma); 
        System.out.println("Luovutuksia oli yhteensä " + luovutukset);
        System.out.println("Minkä veriryhmän luovutusten määrän haluat tietää:");
        String vlm = scanner.nextLine();
        int lm = luovutusMaara(ryhma, vlm);
        System.out.println("Veriryhmän " + vlm + " luovutuksia oli " + lm);


    }

    public static int kysyVeriryhma(ArrayList<String> lista) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Anna veriryhmä (- lopettaa): ");
        int luovutus = 0;
        String imput = scanner.nextLine();
        while (true) {
        
            if (imput.equals("-")) {
                break;
            } else {
            System.out.println("Anna veriryhmä (- lopettaa): ");
            imput = scanner.nextLine();
            lista.add(imput);
            luovutus++;
            }
        }
     return luovutus;
    }
    public static int luovutusMaara(ArrayList<String> lista, String vlm) {
        int lmaara = 0; 
        for (String verir : lista) {
            if (vlm.equals(verir))
            lmaara ++;
        }

        return lmaara;
    }

    
}
