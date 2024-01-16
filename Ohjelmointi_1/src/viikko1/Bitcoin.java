package viikko1;

import java.util.Scanner;

public class Bitcoin {
    public static void main(String[] args) {

    Scanner scanneri = new Scanner(System.in);
    System.out.print("Anna Bitcoineihin investoidun rahan määrä: ");
    int bitcoinarvo = scanneri.nextInt();
    double kerroin = 15.06;
    System.out.print("Bitcoin tuotti vuodessa " + (bitcoinarvo*kerroin-bitcoinarvo) + " euroa");
    scanneri.close();
    }
}
