import java.util.Scanner;

public class Exercici3 {
    private static final String MSG_1 = "Introdueix un número: ";
    private static final String MSG_2 = "El número és parell i elevat al quadrat: ";
    private static final String MSG_3 = "El número és senar i elevat al cub: ";
    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println(MSG_1);
        num = sc.nextInt();
        if(num % 2 == 0){
            System.out.println(MSG_2 + num*num);
        }else {
            System.out.println(MSG_3 + num*num*num);
        }
    }
}
