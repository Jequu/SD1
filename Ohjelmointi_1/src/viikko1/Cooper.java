package viikko1;
import java.util.Scanner;
public class Cooper {
    
public static void main(String[] args) {

Scanner scanneri = new Scanner(System.in);
System.out.print("Anna juostu matka: ");
int matka = scanneri.nextInt();
System.out.print("Kokonaisia 400 metrin kierroksia oli " + matka/400);
scanneri.close();
}

}
