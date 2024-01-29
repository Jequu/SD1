package viikko3;
import java.util.Scanner;

public class Toisto {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i= 1;
        while (i <= 100) {
             System.out.println(i);
             i++;
        }
        scanner.close();
    }
    
}
