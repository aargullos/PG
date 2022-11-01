import java.util.Scanner;

public class Exercici8 {
    private static final String MSG_1 = "Introdueix un numero: ";
    private static final String MSG_2 = "Introdueix un altre numero: ";
    private static final String MSG_3 = "Has introduit el numero 0. ";
    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println(MSG_1);
        num = sc.nextInt();
        while (num != 0){
            System.out.println(MSG_2);
            num = sc.nextInt();
        }
        System.out.println(MSG_3);
    }
}
