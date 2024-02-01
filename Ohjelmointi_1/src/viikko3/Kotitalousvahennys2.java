package viikko3;
import java.util.Scanner;
import java.text.DecimalFormat;

public class Kotitalousvahennys2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat Dformat = new DecimalFormat("0.00");
        double yhteensa = 0;
        double ktv = 0;
        do {
            System.out.println("Anna työkorvauksen määrä (0 lopettaa): ");
            ktv = scanner.nextDouble();
            yhteensa += ktv;
        } while (ktv>0);

        

        double lasku= yhteensa*40 / 100.0 - 100;
        if (lasku<0) {
            lasku= 0;
        }

        if (lasku>=2250) {
            lasku=2250;
        }
        System.out.println("Kotitalousvähennyksen määrä on " + Dformat.format(lasku) + " euroa");
        scanner.close();
    }
}