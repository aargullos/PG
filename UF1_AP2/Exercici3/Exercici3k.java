import java.util.Scanner;

public class Exercici3 {
    private static final String MSG_1 = "Introdueix dos nombres, i el nombre mes gran primer: ";
    private static final String MSG_2 = "És múltiple ";
    private static final String MSG_3 = "No és múltiple. ";
    public static void main(String[] args) {
        int num1, num2;
        Scanner sc = new Scanner(System.in);
        System.out.println(MSG_1);
        num1 = sc.nextInt();
        num2 = sc.nextInt();
        if(num1 % num2 == 0){
            System.out.println(MSG_2);
        } else {
            System.out.println(MSG_3);
        }
    }
}
