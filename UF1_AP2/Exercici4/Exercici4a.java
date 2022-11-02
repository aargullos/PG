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
    private static final Integer MSG_num2 = 2;
    private static final Integer MSG_num3 = 3;
    private static final Integer MSG_num4 = 4;
    private static final Integer MSG_num5 = 5;
    private static final Integer MSG_num6 = 6;
    private static final Integer MSG_num7 = 7;
    private static final Integer MSG_num8 = 8;
    private static final Integer MSG_num9 = 9;
    private static final Integer MSG_num10 = 10;
    private static final Integer MSG_num11 = 11;
    private static final Integer MSG_num12 = 12;
    public static void main(String[] args) {
        int mes;
        Scanner sc = new Scanner(System.in);
        System.out.println(MSG_1);
        mes = sc.nextInt();
        if (mes < MSG_num1 || mes > MSG_num12){
            System.out.println(MSG_2);
        } else if (mes == MSG_num1) {
            System.out.println(MSG_3);
        }else if (mes == MSG_num2) {
            System.out.println(MSG_4);
        }else if (mes == MSG_num3) {
            System.out.println(MSG_5);
        }else if (mes == MSG_num4) {
            System.out.println(MSG_6);
        }else if (mes == MSG_num5) {
            System.out.println(MSG_7);
        }else if (mes == MSG_num6) {
            System.out.println(MSG_8);
        }else if (mes == MSG_num7) {
            System.out.println(MSG_9);
        }else if (mes == MSG_num8) {
            System.out.println(MSG_10);
        }else if (mes == MSG_num9) {
            System.out.println(MSG_11);
        }else if (mes == MSG_num10) {
            System.out.println(MSG_12);
        }else if (mes == MSG_num11) {
            System.out.println(MSG_13);
        }else if (mes == MSG_num12) {
            System.out.println(MSG_14);
        }
    }
}
