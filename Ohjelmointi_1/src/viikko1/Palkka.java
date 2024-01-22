package viikko1;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Palkka {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         DecimalFormat df = new DecimalFormat("0.00");
        System.out.println("Anna palkka: ");
        int palkka = scanner.nextInt();
        System.out.println("Anna veroprosentti: ");
        double vero = scanner.nextDouble();
        System.out.println("Anna ikä: ");
        int ika = scanner.nextInt();
        double tev;

        if (ika >= 53 && ika <= 62) {
            tev = 0.0825;
        }
        else {
            tev = 0.0675;
        }

        double kasi = palkka - palkka*(vero/100) - palkka * 0.015 - palkka*tev;
        double veroosuus = palkka*vero / 100;
        System.out.println("Bruttopalkka " + palkka );
        System.out.println("Veron osuus " + df.format(veroosuus) );
        System.out.println("Työeläkevakuutusmaksun osuus " + df.format(palkka*tev) );
        System.out.println("Työttömyysvakuutuksen osuus " + df.format(palkka*0.015) );
        System.out.println("Käteen jää " + df.format(kasi) );
        scanner.close();
    }
}
