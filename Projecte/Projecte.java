import java.util.Scanner;

public class Projecte {
    private static final String MSG_1 = "id: ";
    private static final String MSG_2 = "edat: ";
    private static final String MSG_3 = "tipus de venda? ";
    private static final String MSG_4 = "import de la compra: ";
    private static final String MSG_5 = "telefon: ";
    private static final String MSG_6 = "Error\n";
    private static final String MSG_7 = "Id  edat  tipus  import  telèfon.";
    private static final String CASE_0 = "venda lliure.";
    private static final String CASE_1 = "pensionista.";
    private static final String CASE_2 = "carnet jove.";
    private static final String CASE_3 = "soci.";
    private static final Integer MAX_COUNT = 3;
    private static final Integer MIN_ID = 111;
    private static final Integer MAX_ID = 999;
    private static final Integer MIN_EDAT = 14;
    private static final Integer MAX_EDAT = 120;
    private static final Integer MIN_TIPUS = 0;
    private static final Integer MAX_TIPUS = 3;
    private static final Integer MIN_IMPORT = 0;
    private static final Integer MAX_IMPORT = 1000;
    private static final Integer MIN_TELEFON = 111111111;
    private static final Integer MAX_TELEFON = 999999999;

    public static void main(String[] args) {
        int id=0, edat=0, tipusvenda=0, imporcomp=0, telefon=0, count = 0;
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
                if (edat < MIN_EDAT || edat > MAX_EDAT) {
                    System.out.print(MSG_6);
                }
            } else {
                System.out.print(MSG_6);
                sc.next();
            }
            count++;
        } while ((!tipusCorrecte || edat < MIN_EDAT || edat > MAX_EDAT) && count < MAX_COUNT);
        count = 0;
        do {
            System.out.print(MSG_3);
            tipusCorrecte = sc.hasNextInt();
            if (tipusCorrecte) {
                tipusvenda = sc.nextInt();
                if (tipusvenda < MIN_TIPUS || tipusvenda > MAX_TIPUS) {
                    System.out.print(MSG_6);
                }
            } else {
                System.out.print(MSG_6);
                sc.next();
            }
            count++;
        } while ((!tipusCorrecte || tipusvenda < MIN_TIPUS || tipusvenda > MAX_TIPUS) && count < MAX_COUNT);
        switch(tipusvenda) {
            case 0:
                System.out.println(CASE_0);
                break;
            case 1:
                System.out.println(CASE_1);
                break;
            case 2:
                System.out.println(CASE_2);
                break;
            case 3:
                System.out.println(CASE_3);
                break;
        }
        count = 0;
        do {
            System.out.print(MSG_4);
            tipusCorrecte = sc.hasNextInt();
            if (tipusCorrecte) {
                imporcomp = sc.nextInt();
                if (imporcomp < MIN_IMPORT || imporcomp > MAX_IMPORT ) {
                    System.out.print(MSG_6);
                }
            } else {
                System.out.print(MSG_6);
                sc.next();
            }
            count++;
        } while ((!tipusCorrecte || imporcomp < MIN_IMPORT || imporcomp > MAX_IMPORT) && count < MAX_COUNT);
        count = 0;
        do {
            System.out.print(MSG_5);
            tipusCorrecte = sc.hasNextInt();
            if (tipusCorrecte) {
                telefon = sc.nextInt();
                if (telefon < MIN_TELEFON || telefon > MAX_TELEFON) {
                    System.out.print(MSG_6);
                }
            } else {
                System.out.print(MSG_6);
                sc.next();
            }
            count++;
        } while ((!tipusCorrecte || telefon < MIN_TELEFON  || telefon > MAX_TELEFON) && count < MAX_COUNT);
        System.out.println(MSG_7);
        System.out.print(id + "  " + edat + "        " + tipusvenda + "  " + imporcomp + "    " + telefon);
    }
}
