package viikko1;
import java.util.Scanner;

public class Juhlat {
    public static void main(String[] args) {

Scanner scanneri = new Scanner(System.in);
System.out.print("Anna juhliin tulevien aikuisten määrä: ");
int aikuiset = scanneri.nextInt();
int pullot = (int)Math.ceil((double)aikuiset/7);
System.out.print("Pulloja tarvitaan " + pullot + " kappaletta ");
System.out.print("Viimeisestä pullosta jää " + (pullot * 7 - aikuiset) + " lasia ");

scanneri.close();
    }
}
