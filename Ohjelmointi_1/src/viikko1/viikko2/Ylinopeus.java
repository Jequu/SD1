package viikko1.viikko2;
import java.util.Scanner;

public class Ylinopeus {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Kerro nopeus:");
        int nopeus = scanner.nextInt();
        if (nopeus > 120 ) {
            System.out.println("Ylinopeussakko!");
        }
        else {
            System.out.print("");
        }
        scanner.close();
    }
}
