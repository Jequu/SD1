package viikko1;
import java.util.Scanner;
import java.text.DecimalFormat;

public class Alennus {
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    DecimalFormat Dform = new DecimalFormat("0.00");
    System.out.println("Anna alentamaton hinta:");
    Double Fullprice = scanner.nextDouble();
    System.out.println("Anna alennusprosentti:");
    Double Sale = scanner.nextDouble();
    Double Dprice = Fullprice*(100.0 - Sale)/ 100.0;
    System.out.println("Alennettu hinta on" + Dform.format(Dprice));
    scanner.close();

}    
}
