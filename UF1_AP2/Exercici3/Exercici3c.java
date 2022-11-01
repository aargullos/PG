import java.util.Scanner;

public class Exercici3 {
    private static final String MSG_1 = "Introdueix un nombre: ";
    private static final String MSG_2 = "Si és positiu i menor a 100.";
    private static final String MSG_3 = "No és positiu ni menor a 100.";
    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println(MSG_1);
        num = sc.nextInt();
        if (num > 0 && num < 100 ){
            System.out.println(MSG_2);
        }else
            System.out.println(MSG_3);
    }
}
