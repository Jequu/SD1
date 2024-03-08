package viikko7;
import java.util.Scanner;
import java.text.DecimalFormat;


public class KirjaOhjelma {
    
    public static void main(String[] args) {
        
    Scanner scanner = new Scanner(System.in);
    DecimalFormat dform = new DecimalFormat("0.00");

    System.out.println("Anna nimi: ");
    String nimi = scanner.nextLine();
    System.out.println("Anna isbn: ");
    String isbn = scanner.nextLine();
    System.out.println("Anna hinta: ");
    double hinta = scanner.nextDouble();
    System.out.println("Anna julkaisuvuosi: ");
    int julkaisuvuosi = scanner.nextInt();

    Kirja olio1 = new Kirja(nimi, isbn, hinta, julkaisuvuosi);
    
    System.out.println(olio1.toString());

    scanner.nextLine();


    Kirja olio2 = new Kirja();

    olio2.setNimi(nimi);
    olio2.setIsbn(isbn);
    olio2.setHinta(hinta);
    olio2.setJulkaisuvuosi(julkaisuvuosi);

    System.out.println("Nimi:" + olio2.getNimi());
    System.out.println("Isbn: " + olio2.getIsbn());
    System.out.println("Hinta: " + dform.format(olio2.getHinta()));
    System.out.println("Julkaisuvuosi: " + olio2.getJulkaisuvuosi());
    }
}
