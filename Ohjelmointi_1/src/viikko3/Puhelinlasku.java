package viikko3;
import java.util.Scanner;
import java.text.DecimalFormat;

public class Puhelinlasku {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat Dformat = new DecimalFormat("0.00");
        System.out.println("Anna rahasumma puhelinlaskulle 1");
        String l1 = scanner.nextLine();
        double lasku1 = Double.parseDouble(l1);
        System.out.println("Anna rahasumma puhelinlaskulle 2");
        String l2 = scanner.nextLine();
        double lasku2 = Double.parseDouble(l2);
        double yhteissumma = lasku1 + lasku2;
        

        System.out.println("Haluttu yhteissumma lukuna on " + Dformat.format(yhteissumma) + " euroa");

        scanner.close();
    }
    }