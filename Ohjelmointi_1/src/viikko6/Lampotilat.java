package viikko6;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class Lampotilat {
    
    public static void main(String[] args) {
    final int MAX = 100;
    int[] lampotilat = new int [MAX];



    }

    int kysyLampotilat(int[] lampotilat, final int MAX) {
        Scanner scanner = new Scanner(System.in);
        int lkm = 0;

        while (true) {
            System.out.print("Anna lämpötila: ");
            int lampotila = scanner.nextInt();
            if (lampotila == -999 || lkm == MAX) {
                break;
            }
            lampotilat[lkm++] = lampotila;
        }
        
        Arrays.sort(lampotilat, 0, lkm);
        return lkm;
            
        
    }

    void naytaLampotilat(int[] lampotilat, int lkm) {


    }
}
