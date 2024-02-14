package viikko5;
import java.util.Scanner;

public class MerkkijononPalat {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
         
        System.out.println("Kirjoita lause: ");
        String lause = scanner.nextLine();
        String[] splitted = lause.split(" ");

        for (String part : splitted) {
            System.out.println(part);
        }

        scanner.close();
}
}