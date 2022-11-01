import java.util.Scanner;

public class Exercici8 {
    private static final String MSG_1 = "Introdueix un numero de numeros que vols intrduir: ";
    private static final String MSG_2 = "Introdueix un altre numero: ";
    private static final String MSG_3 = "Gràcies per utilitzar aquest programa. ";
    public static void main(String[] args) {
        int count=0, num, i;
        Scanner sc = new Scanner(System.in);
        System.out.println(MSG_1);
        num = sc.nextInt();
        while (count != num){
            System.out.println(MSG_2);
            i = sc.nextInt();
            count++;
        }
        System.out.println(MSG_3);
    }
}
