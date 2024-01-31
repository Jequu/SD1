package viikko3;
import java.util.Scanner;
import java.text.DecimalFormat;

public class Kassakone {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat Dformat = new DecimalFormat("0.00");
        double hinta = 0;
        double hintayhteensa = 0;

        do {
            System.out.println("Anna ostoksen hinta (0 lopettaa): ");
            hinta = scanner.nextDouble();
            hintayhteensa += hinta;
            
        } while (hinta > 0);

        
    
        System.out.println("Ostosten verollinen hinta on " + Dformat.format(hintayhteensa)); 
        System.out.println("ALV:n osuus on " + Dformat.format(hintayhteensa *24/124));
        System.out.println("Veroton hinta on " + Dformat.format((hintayhteensa - hintayhteensa * 24/124)));
        scanner.close();
    }
}