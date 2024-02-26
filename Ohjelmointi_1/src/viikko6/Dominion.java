package viikko6;


import java.util.Scanner;

public class Dominion {

    public static int laskePisteet(int kirous, int tila, int pitaja, int laani) {
            
        int yht = kirous*-1 + tila*2 + pitaja*3 + laani*6;
        return yht;

    }
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Anna kirouskorttien määrä: ");
        int kirous = scanner.nextInt();
        System.out.println("Anna tilakorttien määrä: ");
        int tila = scanner.nextInt();
        System.out.println("Anna pitäjäkorttien määrä: ");
        int pitaja = scanner.nextInt();
        System.out.println("Anna läänikorttien määrä: ");
        int laani = scanner.nextInt();
        int pisteet = laskePisteet(kirous, tila, pitaja, laani);
        System.out.println("Pisteiden yhteismäärä on " + pisteet);
        scanner.close();


}




}