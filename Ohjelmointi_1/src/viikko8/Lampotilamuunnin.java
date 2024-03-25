package viikko8;
import java.util.Scanner;
import java.text.DecimalFormat;

public class Lampotilamuunnin {
    

    public static double muunnaFahrenheitiksi(double celsius) {
        return celsius*9/5+32;

    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat dform = new DecimalFormat("0.0");
        double celsius = 0;

        System.out.println("Anna lämpötila celsiuksena: ");
        celsius = scanner.nextDouble();

        System.out.println("Lämpötila Fahrenheitteina on: " + dform.format(muunnaFahrenheitiksi(celsius)));
        
        
    }
}
