package viikko3;
import java.util.Scanner;


public class Alkuluku {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Syötä jokin positiivinen kokonaisluku:");
        int luku = scanner.nextInt();

        Boolean alkuluku = true;

        if (luku < 2) {
            alkuluku = false;
        } else {
            for (int i = 2; i < luku; i++ ) {
                if (luku % i == 0) {
                    alkuluku = false;
                }
            }

        }

        if (alkuluku) {
            System.out.println("Luku " + luku + " on alkuluku.");
        } else {
            System.out.println("Luku " + luku + " ei ole alkuluku.");
        }
        scanner.close();
}
}