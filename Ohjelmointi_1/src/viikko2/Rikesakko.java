package viikko2;
import java.util.Scanner;

public class Rikesakko {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Anna nopeusrajoitus: ");
        int rajotus = scanner.nextInt();
        System.out.println("Anna nopeutesi: ");
        int nopeus = scanner.nextInt();
        int ylinopeus = nopeus-rajotus;
        int rikesakko = 0;

        if (rajotus >= 10 && rajotus <= 60 && ylinopeus <= 15) {
            rikesakko = 170;
            System.out.println("Rikesakko on " + rikesakko);
        } else if (rajotus >= 10 && rajotus <= 60 && ylinopeus > 15 && ylinopeus <= 20) {
            rikesakko = 200;
            System.out.println("Rikesakko on " + rikesakko);
        } else if (rajotus >= 10 && rajotus <= 60 && ylinopeus > 20) {
            System.out.println("Menee päiväsakoille");
        } else if (rajotus >= 70 && rajotus <= 120 && ylinopeus <= 15) {
            rikesakko = 140;
            System.out.println("Rikesakko on " + rikesakko);
        } else if (rajotus >= 70 && rajotus <= 120 && ylinopeus > 15 && ylinopeus <= 20) {
            rikesakko = 200;
            System.out.println("Rikesakko on " + rikesakko);
        } else if (rajotus >= 70 && rajotus <= 120 && ylinopeus > 20) {
            System.out.println("Menee päiväsakoille");
        }
        scanner.close();

    }
}