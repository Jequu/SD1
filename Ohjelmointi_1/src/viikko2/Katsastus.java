package viikko2;
import java.util.Scanner;

public class Katsastus {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Onko 1=katsastus, 2=jälkitarkastus:");
        int katsastus = scanner.nextInt();
        int hinta = 0;

        if (katsastus == 1) {
            hinta += 50;

            System.out.println("Mitataanko päästöt 0=ei, 1=kyllä: ");
            int mitta = scanner.nextInt();

            if (mitta == 1) {
                System.out.println("Onko auto 0=bensa, 1=diesel: ");
                int paasto = scanner.nextInt();
                
                if (paasto == 0) {
                    hinta += 22;
                } else if (paasto == 1) {
                    hinta += 31;
                }
            }
        } else if (katsastus == 2) {
            hinta += 30;
        }

        System.out.println("Hinta on " + hinta);
    }
}
