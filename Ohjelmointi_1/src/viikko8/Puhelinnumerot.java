    package viikko8;
    import java.util.Scanner;

    public class Puhelinnumerot {
        
        public static void main(String[] args) {

            String numero;
            String korjattu;
            String num;
            String num2;
            Scanner scanner = new Scanner(System.in);
            System.out.println("Anna puhelinnumero: ");
            numero = scanner.nextLine();

            num = numero.substring(0,3);
            num2 = numero.substring(1, 4);
        
            
            if (num.equals("040") == true || num.equals("050") == true ) {
                korjattu = numero.substring(1);
                System.out.println("Numero korjattuna on:" + "+358" + korjattu);
            } else if (num2.equals("358") == true) {
                System.out.println("Numerossa ei löytynyt korjattavaa.");
            } else {
                System.out.println("error");
            }
            


        }
        
    }
