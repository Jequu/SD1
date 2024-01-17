package viikko1;
import java.util.Scanner;
import java.text.DecimalFormat;

public class Bensa {

public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    DecimalFormat formatti = new DecimalFormat("0.00");

    System.out.println("Anna tankattu määrä: ");
    double tankattu = scanner.nextDouble();
    System.out.println("Anna ajetut kilometrit: ");
    double kilsat = scanner.nextDouble();
    System.out.println("Anna litrahinta: ");
    double litrahinta = scanner.nextDouble();
    System.out.println("Ajo per kilometri maksaa ");
    System.out.println(formatti.format(tankattu/kilsat*litrahinta));
    scanner.close();
}
}
