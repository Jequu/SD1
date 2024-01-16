package viikko1;
import java.util.Scanner;

public class Pikavippi {
    public static void main(String[] args) {
    Scanner scanneri = new Scanner(System.in);

    System.out.print("Anna pikavipin määrä euroissa: ");
    double pikavip = scanneri.nextInt();
    System.out.print("Moneksiko vuodeksi raha halutaan (1 tai 2): ");
    int vuodet = scanneri.nextInt();
    System.out.print("Lainakorko kahdesta yleisestä (41% tai 37%): ");
    double korko = scanneri.nextInt();
    System.out.println("Lainatut rahat maksavat eli korko " + (pikavip*(korko / 100*vuodet)));
    scanneri.close();
    }

}
