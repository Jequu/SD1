package viikko4;
import java.util.Scanner;

public class Salasana {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);



        System.out.println("Anna salasana: ");
        String salis = scanner.nextLine();
        int pituus = salis.length();

        if (pituus > 8 && salis.matches(".*[A-Z].*") && salis.matches(".*[a-z].*") && salis.matches(".*\\d.*")) {
            System.out.println("Salasana kelpaa.");


        } else { 
            System.out.println("Salasana ei käy.");
        }
        scanner.close();
    } 
}