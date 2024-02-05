package viikko4;
import java.util.Scanner;


public class Lento {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Anna lennon numero: ");
        String nimi = scanner.nextLine();
        int numero = Character.getNumericValue(nimi.charAt(2));

        if (nimi.startsWith("AY")) {
            
        
        if (numero == 1) {
            System.out.println("Kaukolento");
        } else if (numero > 1 && numero<7 ) {
            System.out.println("Kotimaan lento"); 
        } else if (numero == 7) {
            System.out.println("Venäjän lento");
        }
    } else {
        System.out.println("Ei ole Finnairin lento");

    }
    scanner.close();
    }

}