import java.util.Scanner;

public class Projecte {
    private static final String MSG_1 = "Error, has introduit una lletra ";
    private static final String MSG_2 = "id: ";
    private static final String MSG_3 = "edat: ";
    private static final String MSG_4 = "tipus de venda? ";
    private static final String MSG_5 = "import de la compra ";
    private static final String MSG_6 = "telefon: ";
    private static final String MSG_7 = "Error, introdueix un nombre dins del rang: ";
    private static final String MSG_8 = "Error, has fet 3 intents. ";

    public static void main(String[] args) {
        int id, edat, imporcomp, telefon, count = 0;
        boolean tipusCorrecte;
        boolean stop = false;
        do{
            Scanner sc = new Scanner (System.in);
            System.out.println(MSG_2);
            tipusCorrecte = sc.hasNextInt();
            if (tipusCorrecte){
                count++;
                id = sc.nextInt();
                while ((id < 111 || id > 999) && (count != 3) && tipusCorrecte && !stop) {
                    System.out.println(MSG_7);
                    tipusCorrecte = sc.hasNextInt();
                    if (tipusCorrecte){
                        id = sc.nextInt();
                        count++;
                    }else {
                        count++;
                        tipusCorrecte = false;
                        System.out.println(MSG_1);
                    }
                }
            }else{
                System.out.println(MSG_1);
                count++;
            }

            if(count==3){
                System.out.println(MSG_8);
            }

        }while (!tipusCorrecte && count != 3);
    }
}
