import java.util.Scanner;

public class Exercici3 {
    private static final String MSG_1 = "Introdueix dos nombres: ";
    private static final String MSG_2 = "El número més gran és: ";
    private static final String MSG_3 = "El número més gran és: ";
    private static final String MSG_4 = "Els números són iguals. ";
    public static void main(String[] args) {
        int num1, num2;
        Scanner sc = new Scanner(System.in);
        System.out.println(MSG_1);
        num1 = sc.nextInt();
        num2 = sc.nextInt();
        if(num1 > num2) {
            System.out.println(MSG_2 + num1);
        } else if(num2 > num1) {
            System.out.println(MSG_3 + num2);
        }else {
            System.out.println(MSG_4);
        }
    }
}
