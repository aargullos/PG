import java.util.Scanner;

public class Exercici3 {
    private static final String MSG_1 = "Introdueix un nombre: ";
    private static final String MSG_2 = "El nombre introduït és positiu ";
    private static final String MSG_3 = "El nombre introduït és negatiu ";
    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println(MSG_1);
        num = sc.nextInt();
        if (num > 0){
            System.out.println(MSG_2);
        }else
            System.out.println(MSG_3);
    }
}
