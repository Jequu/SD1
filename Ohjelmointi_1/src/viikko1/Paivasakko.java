package viikko1;
import java.util.Scanner;
import java.text.DecimalFormat;
public class Paivasakko {

public static void main(String[] args) {

    Scanner skanneri = new Scanner(System.in);
    DecimalFormat formatti = new DecimalFormat("0");

    System.out.println("Anna nettotulot: ");
    int tulot = skanneri.nextInt();
    int sakko = (tulot - 255) / 60;
    System.out.println("Nettotuloilla " + formatti.format(tulot) + " päiväsakko on " + formatti.format(sakko) + " euroa");
    skanneri.close();
}

}
