package viikko4;
import java.util.Scanner;

public class Lumi {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int kpl = 0;
        int Lumi = 0;

       

        while (true) {
            System.out.println("Anna nimi: ");
            String nimi = scanner.nextLine();

            if (nimi.equals("LOPPU") == true) {
                break;
            } else {
                kpl += 1;
                if (nimi.equalsIgnoreCase("Lumi") == true)
                Lumi += 1;
            }
 
        }
        System.out.println("Nimiä oli " + (kpl) + " kappaletta.");
        System.out.println("Nimi Lumi esiintyi " + Lumi + " kertaa.");
        scanner.close();
}
}
