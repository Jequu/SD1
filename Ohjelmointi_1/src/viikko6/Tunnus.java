package viikko6;

import java.util.Scanner;

public class Tunnus {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Anna sukunimi: ");
        String sukunimi = scanner.nextLine();
        System.out.println("Anna etunimi: ");
        String etunimi = scanner.nextLine();
        System.out.println(teeTunnus(etunimi, sukunimi));
        scanner.close();

    }

    public static String teeTunnus(String etu, String suku) {

        String etu2 = etu.substring(0,3);
        String suku2 = suku.substring(0,3);
        String tunnus = "Tunnus on " + suku2 + etu2;
        return tunnus;
    }
}
