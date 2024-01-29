package viikko3;
import java.util.Scanner;
import java.text.DecimalFormat;

public class Kilometrikorvaus {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat Dformat = new DecimalFormat("0.00");
        int ajettu = 0;
        while (true) {
            System.out.println("Anna ajetut kilometrit (0 lopettaa): ");
            int kilsat = scanner.nextInt();

            if (kilsat == 0) {
                break;
            }

            ajettu += kilsat;
        }
    
        double korvaus = ajettu * 0.43;
        System.out.println("Yhteensä " + ajettu + "kilometriä");
        System.out.println("Korvaus on " + Dformat.format(korvaus) + " euroa");
        scanner.close();
    }
    
}
