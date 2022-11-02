import java.util.Scanner;

public class Exercici9 {
    private static final String MSG_1 = "Introdueix un numero: ";
    private static final String MSG_2 = "Introdueix un altre numero: ";
    private static final String MSG_3 = "La mitjana es: ";
    private static final String MSG_4 = "No es pot fer la mitjana.";
    public static void main(String[] args) {
        int num, sum=0, count=0;
        float mitjana;
        Scanner sc = new Scanner(System.in);
        System.out.println(MSG_1);
        num = sc.nextInt();
        while(num > 0){
            sum += num;
            count++;
            System.out.println(MSG_2);
            num=sc.nextInt();
        }
        if (count == 0)
            System.out.println(MSG_4);
        else {
            mitjana =(float)sum/count;
            System.out.println(MSG_3 + mitjana);
        }
    }
}
