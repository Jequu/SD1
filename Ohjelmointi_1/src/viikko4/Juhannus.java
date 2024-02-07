package viikko4;
import java.util.Scanner;
import java.time.DayOfWeek;
import java.time.LocalDate;

public class Juhannus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Syötä vuosi: ");
        int vuosi1 = scanner.nextInt();
        int kuukausi = 6;
        int paiva = 20;

        LocalDate juhannus = LocalDate.of(vuosi1, kuukausi, paiva);


        DayOfWeek vp = juhannus.getDayOfWeek();

        while (vp != DayOfWeek.SATURDAY) {
            
            juhannus = juhannus.plusDays(1);
            vp = juhannus.getDayOfWeek();
        }
        
        System.out.println("Juhannus on " + juhannus.getDayOfMonth() + "." + juhannus.getMonthValue() + "." + juhannus.getYear() + ".");        
        scanner.close();
    }    
}