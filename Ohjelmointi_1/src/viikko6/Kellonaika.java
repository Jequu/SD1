package viikko6;

import java.util.Scanner;

public class Kellonaika {
    
    public static void main(String[] args) {
        String kello = kysyKellonaika();
        if (tarkastaKellonaika(kello) == true ) {
            System.out.println("Kellonaika on oikein");
        } if (tarkastaKellonaika(kello) == false) {
            System.out.println("Kellonaika on väärin");
        }


    }

    public static String kysyKellonaika() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Anna kellonaika muodossa tt:mm:");
        return scanner.nextLine();

    }

    public static boolean tarkastaKellonaika(String kellonaika) {
        if (kellonaika.matches("\\d{2}:\\d{2}")) {
            
        String tunnit = kellonaika.substring(0,2);
        String minuutit = kellonaika.substring(3);
        int h = Integer.parseInt(tunnit);
        int m = Integer.parseInt(minuutit);
        boolean aika;

        if (h >= 0 && h <= 23 && m >= 0 && m <= 59) {
            aika = true;
        } else {
            aika = false;
        }
        
        return aika;
    } else{
        return false;
    }
    }
}
