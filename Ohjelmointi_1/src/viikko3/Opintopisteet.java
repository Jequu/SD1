
import java.util.Scanner;

public class Opintopisteet {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Anna lukukausien määrä: ");
        int lukukaudet = scanner.nextInt();
        int opyhteensa = 0;
        
        for (int i = 1; i <= lukukaudet; i++){
            System.out.println("Anna" + i + ". lukukauden opintopisteesi: ");
            int op = scanner.nextInt();
            opyhteensa += op;
        }
        System.out.println("Sinulla pitäisi olla tähän mennessä " + lukukaudet*30 + " opintopistettä.");
        System.out.println("Sinulla on " + opyhteensa + " opintopistettä.");
        int v2 =  opyhteensa-lukukaudet;
        int puutuva = 210 - opyhteensa;
            if (v2 < 0) {
                System.out.println("Olet jäljessä tavoitteesta.");
                System.out.println("Tutkinnosta puuttuu vielä " + puutuva + " opintopistettä");

            } else if (v2 > 0) {
                System.out.println("Olet edellä tavoitteesta.");
                System.out.println("Tutkinnosta puuttuu vielä " + puutuva + " opintopistettä");

            } else {
                System.out.println("Olet tavoitteessa.");
                System.out.println("Tutkinnosta puuttuu vielä " + puutuva + " opintopistettä");

            }

        
    }
}