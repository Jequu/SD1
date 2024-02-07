package viikko4;
import java.util.Scanner;
import java.time.LocalDate;

public class Erapaiva {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String paivamaara;

        System.out.println("Anna laskun päivämäärä (vvvv-kk-pp):");
        paivamaara = scanner.nextLine();
        LocalDate date = LocalDate.parse(paivamaara);
        LocalDate era = date.plusWeeks(2);

        System.out.println("Eräpäivä on " + era);
        scanner.close();
    }
}