package viikko6;
import java.util.Scanner;
import java.text.DecimalFormat;

public class Sairaspaivaraha {
 
    public static void main(String[] args) {
    DecimalFormat Dform = new DecimalFormat("0.00");
    double tulot = kysyTulot();
    System.out.println("Vuosituloilla" + Dform.format(tulot) + " sairaspäiväraha on " + Dform.format(laskepr(tulot)) + "euroa/päivä.");
    

    }

    public static double kysyTulot() {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Anna vuositulosi: ");
    return scanner.nextDouble();
    }

    public static double laskepr(double tulot) {
    double pr;
    if (tulot <= 1399) {
        pr = 0.0;
    } else if (tulot <= 36419){
        pr = 0.7 * tulot / 300.0;
    } else if (tulot <= 56032) {
        pr =  84.98 + 0.4 * (tulot - 36419) / 300.0;
    } else {
        pr = 111.13 + 0.25 * (tulot - 56032) / 300.0;
    }
    return pr;
    }
}
