package viikko4;
import java.util.Scanner;

public class MerkkijonojenVertailu {
    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        System.out.println("Syötä kaksi merkkijonoa:");
        String eka = lukija.nextLine();
        String toka = lukija.nextLine();

        if (eka.equals(toka)== true) {
            System.out.println("Syötetyt merkkijonot olivat samat!");
        } else {
            System.out.println("Syötetyt merkkijonot eivät olleet samat!");
        }

        lukija.close();
    }
}
for (int i = 1; i<10; ++i) {
    if (luku>scanner.nextInt()) {
        lukux = scanner.nextInt();

    } else if(luku<scanner.nextInt()) {

    } else {
        System.out.println("Luvut ovat epäjärjestyksessä.");
    }