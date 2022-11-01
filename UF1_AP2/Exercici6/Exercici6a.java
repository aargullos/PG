import java.util.Scanner;

public class Exercici6 {
    private static final String MSG_1 = "Introdueix un any: ";
    private static final String MSG_2 = "Introdueix un mes ";
    private static final String MSG_3 = "30";
    private static final String MSG_4 = "31";
    private static final String MSG_5 = "28";
    private static final String MSG_6 = "29";
    public static void main(String[] args) {
        int mes, any;
        Scanner sc = new Scanner(System.in);
        System.out.println(MSG_1);
        any = sc.nextInt();
        System.out.println(MSG_2);
        mes = sc.nextInt();
        switch (mes) {
            case 1:
                System.out.println(MSG_4);
                break;
            case 2:
                if (any % 4 == 0){
                    System.out.println(MSG_6);
                }else {
                    System.out.println(MSG_5);
                }
                break;
            case 3:
                System.out.println(MSG_4);
                break;
            case 4:
                System.out.println(MSG_3);
                break;
            case 5:
                System.out.println(MSG_4);
                break;
            case 6:
                System.out.println(MSG_3);
                break;
            case 7:
                System.out.println(MSG_4);
                break;
            case 8:
                System.out.println(MSG_4);
                break;
            case 9:
                System.out.println(MSG_3);
                break;
            case 10:
                System.out.println(MSG_4);
                break;
            case 11:
                System.out.println(MSG_3);
                break;
            case 12:
                System.out.println(MSG_4);
                break;
        }
    }
}
