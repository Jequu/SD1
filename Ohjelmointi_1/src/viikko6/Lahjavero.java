package viikko6;
import java.util.Scanner;
import java.text.DecimalFormat;
public class Lahjavero {
    
    public static double laskeVero(double arvo) {
        if (arvo <= 5000) {
            arvo = 0;
        } else if (arvo >= 5000 && arvo < 25000){
            arvo = (arvo - 5000)*0.08;
        }else if (arvo <= 25000) {
                arvo = 1700;
        } else if (arvo >= 25000 && arvo < 55000) {
            arvo = (arvo - 25000)*0.1 + 1700;
        }else if (arvo <= 55000) {
            arvo = 4700;
        } else if (arvo >= 55000 && arvo < 200000) {
            arvo = (arvo - 55000)*0.12 + 4700;
        }else if (arvo <= 200000) {
            arvo = 22100;
        } else if (arvo >= 200000 && arvo < 1000000) {
            arvo = (arvo - 200000)*0.15 + 22100;
        }else if (arvo <= 1000000) {
            arvo = 142000;
        } else if (arvo >= 1000000) {
            arvo = (arvo - 1000000)*0.17 + 142000;
        }
        return arvo;
    
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat Dform = new DecimalFormat("0.00");
        System.out.println("Anna lahjan suuruus: ");
        Double suuruus = scanner.nextDouble();
        Double vero = laskeVero(suuruus);
        System.out.println("Lahjavero on " + Dform.format(vero) + " euroa");
        scanner.close();
    }
}
