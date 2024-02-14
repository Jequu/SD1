package viikko5;
import java.util.Scanner;

public class SanojenVaihtaminen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Kirjoita lause: ");
        String lause = scanner.nextLine();
        String[] taulu = lause.split(" ");

        System.out.println("Mitkä sanat vaihdetaan keskenään? ");
        int sana1 = scanner.nextInt();
        int sana2 = scanner.nextInt();

        String vaihto = taulu[sana1];
        taulu[sana1] = taulu[sana2];
        taulu[sana2] = vaihto;

        String uusilause = String.join(" ", taulu);
        System.out.println(uusilause);
        scanner.close();
}
}