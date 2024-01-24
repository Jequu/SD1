package viikko2;
import java.util.Scanner;
import java.text.DecimalFormat;

public class Palkka2 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
         DecimalFormat df = new DecimalFormat("0.00");

        System.out.println("Anna palkka: ");
        int palkka = scanner.nextInt();
        System.out.println("Anna veroprosentti: ");
        double veroprosentti = scanner.nextDouble();
        System.out.println("Anna ikä: ");
        int ika = scanner.nextInt();
        System.out.println("Brutto palkka " + palkka);
        System.out.println("Veron osuus " + df.format(palkka*(veroprosentti/100)));
        double tvo = 0; 

        if (ika<53) {
            tvo = tvo + 0.0555;
        } else {
            tvo = tvo + 0.0705;
        }

        System.out.println("Työeläkevakuutusmaksun osuus " + df.format(palkka*tvo));
        System.out.println("Työttömyysvakuutuksen osuus " + df.format(palkka*0.0115));
        double kasi = palkka - palkka*(veroprosentti/100) - palkka*0.0115 - palkka*tvo;
        System.out.println("Käteen jää " + df.format(kasi));
        scanner.close();
    }
        
    }