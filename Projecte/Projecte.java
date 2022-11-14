import java.util.Scanner;

public class Projecte {
    private static final String MSG_1 = "id: ";
    private static final String MSG_2 = "edat: ";
    private static final String MSG_3 = "tipus de venda? ";
    private static final String MSG_4 = "import de la compra ";
    private static final String MSG_5 = "telefon: ";
    private static final String MSG_6 = "Error\n" ;
    private static final Integer MAX_COUNT = 3 ;
    private static final Integer MIN_ID = 111 ;
    private static final Integer MAX_ID = 999 ;

    public static void main(String[] args) {
        int id=0, edat=0, imporcomp, telefon, count = 0;
        boolean tipusCorrecte;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print(MSG_1);
            tipusCorrecte = sc.hasNextInt();
            if (tipusCorrecte) {
                id = sc.nextInt();
                if (id < MIN_ID || id > MAX_ID) {
                    System.out.print(MSG_6);
                }
            } else {
                System.out.print(MSG_6);
                sc.next();
            }
            count++;
        } while ((!tipusCorrecte || id < MIN_ID || id > MAX_ID) && count < MAX_COUNT);
        count = 0;
        do {
            System.out.print(MSG_2);
            tipusCorrecte = sc.hasNextInt();
            if (tipusCorrecte) {
                edat = sc.nextInt();
                if (edat < 14 || edat > 90) {
                    System.out.print(MSG_6);
                }
            } else {
                System.out.print(MSG_6);
                sc.next();
            }
            count++;
        } while ((!tipusCorrecte || edat < 14 || edat > 90) && count < MAX_COUNT);
    }
}
