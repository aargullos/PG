import java.util.Scanner;

public class Exercici3 {
    private static final String MSG_1 = "Introdueix un nombre: ";
    private static final String MSG_2 = "No està dins de l'interval.";
    private static final String MSG_3 = "Si està dins de l'interval.";
    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println(MSG_1);
        num = sc.nextInt();
        if (num  <= 25 || num >= 50 ){
            System.out.println(MSG_2);
        }else
            System.out.println(MSG_3);
    }
}
