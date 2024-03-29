package tehtava09; // Poista tämä rivi Viopessa!

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Ohjelmaan on toteutettu valmiina pohja, joka lukee käyttäjältä lukuja
 * listalle. Syötteiden lukeminen päätetään kun käyttäjä syöttää luvun -1.
 * 
 * Lisää ohjelmaan toiminnallisuus, joka lukujen lukemisen jälkeen etsii
 * listalta listan suurimman luvun ja tulostaa sen arvon. Ohjelman pitäisi
 * toimia seuraavasti.
 * 
 * Tämän tehtävän on laatinut Helsingin yliopiston Agile Education Research
 * -tutkimusryhmä. Tehtävä on lisensoitu on lisensoitu Creative Commons BY-NC-SA
 * 4.0 -lisenssillä ja se on julkaistu kurssilla https://ohjelmointi-19.mooc.fi.
 */
public class ListanSuurinLuku {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        List<Integer> luvut = new ArrayList<Integer>();

        System.out.println("Syötä kokonaislukuja listalle (-1 lopettaa):");

        while (true) {
            int syote = lukija.nextInt();

            if (syote == -1) {
                break;
            } else {
                luvut.add(syote);
            }
        }
        lukija.close();

        System.out.println(); // Tyhjä rivi tulosteeseen

        // TODO: Täydennä koodia tehtävänannon mukaisesti
        
        int suurin = luvut.get(0);
        
        for (int i = 1; i< luvut.size(); ++i) {
            if (suurin<luvut.get(i)) {
                suurin = luvut.get(i);
            }
        }

        System.out.println("Listan suurin luku: " + suurin);
    }
}