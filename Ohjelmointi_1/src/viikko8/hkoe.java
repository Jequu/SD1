package viikko8;
import java.util.Scanner;

public class hkoe {
    
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int summa = 0;

    while (true) {
        System.out.println("Syötä ensimmäinen luku: ");
        int luku = scanner.nextInt();

        if (luku >0) {
            summa += luku;
            System.out.println("Syötä toinen luku: ");
            int luku2 = scanner.nextInt();
            if (luku2>0) {
                summa += luku2;
                break;
            }
        } else {
            System.out.println("Anna postiivinen luku: ");
        }

 
    }
    System.out.println("luujen summa on " + summa);
}
}
