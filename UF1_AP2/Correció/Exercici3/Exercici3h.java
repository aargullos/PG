import java.util.Scanner;

/*
Joel
Espadas Almazor
INS Manuel Vázquez Montalbán
28-10-2022
DAW 1
UF1, Programació estructurada


public class Exercici3_h {
    private static final String MSG_1 = "Introdueix un número";

    public static void main(String[] args) {
        float num;
        Scanner sc = new Scanner(System.in);
        System.out.println(MSG_1);
        num = sc.nextFloat();
            if(num % 2 == 0){
                System.out.println("parell i elevat al quadrat: " + num*num);
            }else {
                System.out.println("Senar i elevat al cub: " + num*num*num);
            }
    }
}
*/

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
