package viikko5;

import java.util.Scanner;

public class ArvonTarkastus {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Syötä luku väliltä 0-23:");
        int luku = scanner.nextInt();

        try {
            if (luku >= 0 && luku <= 23) {
                System.out.println("Luku " + luku + " on sallittu.");
            } else {
                scanner.close();
                throw new IllegalArgumentException("Exception in thread \"main\" java.lang.IllegalArgumentException");
                
            }
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        scanner.close();
    }
}
