package viikko1;
import java.util.Scanner;

public class HeiEtunimi {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Syötä etunimi: ");
        String etunimi = scanner.nextLine();

        
        System.out.println("Hei " + etunimi + "!");

        scanner.close();
    }
}
