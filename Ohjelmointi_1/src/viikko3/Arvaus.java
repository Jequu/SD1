package viikko3;
import java.util.Scanner;

public class Arvaus {

    public static void main(String[] args) {
        arvaaLuku();
    }

    public static void arvaaLuku() {
        int arvottuLuku = 78;
        int arvaukset = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Arvaa lukua väliltä 1-100: ");

        while (true) {
            int kayttajanArvaus = scanner.nextInt();
            arvaukset++;

            if (kayttajanArvaus == arvottuLuku) {
                System.out.println("Arvasit oikein. Arvauksia oli " + arvaukset);
                break;
            } else if (kayttajanArvaus < arvottuLuku) {
                System.out.print("Arvaa suurempaa: ");
            } else {
                System.out.print("Arvaa pienempää: ");
            }
        }

        scanner.close();
    }
}
