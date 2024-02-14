package viikko5;

import java.util.Scanner;

public class summaaja {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int summa = 0;

        while (true) {
            System.out.println("Syötä seuraava luku (0 lopettaa):");
            String luku = scanner.nextLine();
            
            try {
                int lukux;
                lukux = Integer.parseInt(luku);
                summa += lukux;
                if (lukux == 0) {
                    break;
                }


            } catch (Exception e) {
                System.out.println("Virheellinen syöte!");
            } 
        }
        System.out.println("Lukujen summa on " + summa + ".");
        scanner.close();
}
}
