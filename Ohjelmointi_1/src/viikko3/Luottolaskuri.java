package viikko3;
import java.util.Scanner;
import java.text.DecimalFormat;

public class Luottolaskuri {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat Dformat = new DecimalFormat("0.00");

        //double hintaostos = 0;
        //double kuukaudet = 0;
        

    System.out.println("Anna luotollisen ostoksen hinta: ");
        double hintaostos = scanner.nextDouble();
        System.out.println("Anna kuukausierien lukumäärä: ");
        double kuukaudet = scanner.nextDouble();
        double era = hintaostos/kuukaudet;
        double luotto = hintaostos - era;

        
       for (int i = 1; i <= kuukaudet; i++) {
        System.out.println( i + ". erä " + Dformat.format(era) + "euroa, luottoa jäljellä " + Dformat.format(luotto) + " euroa");
        luotto -= era;
       }
       scanner.close();

       
    }
    
}
