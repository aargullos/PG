import java.util.Scanner;

public class Exercici5 {
    private static final String MSG_1 = "Introdueix un any: ";
    private static final String MSG_2 = "És any de traspas.";
    private static final String MSG_3 = "No es any de traspas.";
    public static void main(String[] args) {
        int any;
        Scanner sc = new Scanner(System.in);
        System.out.println(MSG_1);
        any = sc.nextInt();
        if (any % 4 == 0){
            System.out.println(MSG_2);
        }else
            System.out.println(MSG_3);
    }
}
