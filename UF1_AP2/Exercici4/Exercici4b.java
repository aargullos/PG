import java.util.Scanner;

public class Exercici4 {
    private static final String MSG_1 = "Introdueix un mes: ";
    private static final String MSG_2 = "No has introduit un mes.";
    private static final String MSG_3 = "Gener.";
    private static final String MSG_4 = "Febrer.";
    private static final String MSG_5 = "Març.";
    private static final String MSG_6 = "Abril.";
    private static final String MSG_7 = "Maig.";
    private static final String MSG_8 = "Juny.";
    private static final String MSG_9 = "Juliol.";
    private static final String MSG_10 = "Agost.";
    private static final String MSG_11 = "Septembre.";
    private static final String MSG_12 = "Octubre.";
    private static final String MSG_13 = "Nomembre.";
    private static final String MSG_14 = "Decembre.";
    private static final Integer MSG_num1 = 1;
    private static final Integer MSG_num12 = 12;

    public static void main(String[] args) {
        int mes;
        Scanner sc = new Scanner(System.in);
        System.out.println(MSG_1);
        mes = sc.nextInt();
        if (mes < MSG_num1 || mes > MSG_num12) {
            System.out.println(MSG_2);
        }
        switch (mes) {
            case 1:
                System.out.println(MSG_3);
                break;
            case 2:
                System.out.println(MSG_4);
                break;
            case 3:
                System.out.println(MSG_5);
                break;
            case 4:
                System.out.println(MSG_6);
                break;
            case 5:
                System.out.println(MSG_7);
                break;
            case 6:
                System.out.println(MSG_8);
                break;
            case 7:
                System.out.println(MSG_9);
                break;
            case 8:
                System.out.println(MSG_10);
                break;
            case 9:
                System.out.println(MSG_11);
                break;
            case 10:
                System.out.println(MSG_12);
                break;
            case 11:
                System.out.println(MSG_13);
                break;
            case 12:
                System.out.println(MSG_14);
                break;
        }
    }
}
