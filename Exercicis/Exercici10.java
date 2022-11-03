import java.util.Scanner;

public class Exercici10 {

    private static final String MSG_1 = "Introdueix un nombre: ";
    private static final String MSG_2 = "Error, el nombre a de ser positu.";
    private static final String MSG_3 = "Introdueix un nombre mes gran que el primer: ";
    private static final String MSG_4 = "Aquest son els multiples entre el primer nombre i el segon:";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1, n2;
        do {
            System.out.print(MSG_1);
            n1 = sc.nextInt();
            if (n1 < 0) {
                System.out.println(MSG_2);
            }
        } while (n1 < 0);
        do {
            System.out.print(MSG_3);
            n2 = sc.nextInt();
            if (n2 < 0) {
                System.out.println(MSG_2);
            } else if (n1 >= n2) {
                System.out.println(MSG_4);
            }
        } while (n2 < 0 || n1 > n2);
        System.out.println(MSG_4);
        for (int i=n1;i<n2;i++){
            if (i % n1 == 0) {
                System.out.println(i);
   
            }
        }
    }
}
