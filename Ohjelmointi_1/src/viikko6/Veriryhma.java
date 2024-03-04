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
        int luovutus = 0;
        while (true) {
            System.out.println("Anna veriryhmä (- lopettaa): ");
            String input = scanner.nextLine();
            if (input.equals("-")) {
                break;
            } else {
            lista.add(input);
            luovutus++;
            }
        }   
        
     return luovutus;
    }
    public static int luovutusMaara(ArrayList<String> lista, String vlm) {
        int lmaara = 0; 
        for (String verir : lista) {
            if (verir.contains(vlm))
            lmaara++;
        }

        return lmaara;
    }

    
}
