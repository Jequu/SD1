package viikko3;
import java.util.Scanner;
import java.text.DecimalFormat;

public class Kilometrikorvaus2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat Dformat = new DecimalFormat("0.00");
        int kilsat = 0;
        int summa = 0;

        do {
            summa += kilsat;
            System.out.println("Anna ajetut kilometrit (0 lopettaa): ");
            kilsat = scanner.nextInt();

        } while (kilsat != 0);
        System.out.println("Yhteensä "+ summa + " kilometriä");
        System.out.println("Korvaus on" + Dformat.format(summa * 0.46)  + " euroa");
        scanner.close();
    }
}