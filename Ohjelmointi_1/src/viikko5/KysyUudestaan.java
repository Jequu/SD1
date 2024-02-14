package viikko5;
import java.util.Scanner;

public class KysyUudestaan {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

    
        int kluku;

        while (true) {
            System.out.println("Syötä kokonaisluku: ");
            String luku = scanner.nextLine();
        
        try {
            kluku = Integer.parseInt(luku);
            break;

        } catch (Exception e) {
            System.out.println("Virheellinen luku!");
        }

    }
    System.out.println("Syötit luvun " + kluku + ".");
    scanner.close();
}
}