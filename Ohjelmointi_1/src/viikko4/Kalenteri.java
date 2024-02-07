package viikko4;
import java.util.Scanner;
import java.time.Month;
import java.time.Year;

public class Kalenteri {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Syötä vuosi: ");
        int vuosi = scanner.nextInt();

        System.out.print("Syötä kuukausi: ");
        int kuukausi = scanner.nextInt();

        Month kuukausiEnum = Month.of(kuukausi);
        int paivienLkm = kuukausiEnum.length(Year.isLeap(vuosi));

        System.out.println("Ma Ti Ke To Pe La Su");

        for (int i = 1; i <= paivienLkm;) {
            for (int j = 1; j <= 7 && i <= paivienLkm; j++, i++) {
                System.out.printf("%2d ", i);
            }
            System.out.println();
        }
    }
}
