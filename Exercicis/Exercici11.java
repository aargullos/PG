import java.util.Scanner;

public class Exercici11 {
    private static final String MSG_1 = "Introdueix un nombre: ";
    private static final String MSG_2 = "La suma és: ";
    public static void main(String[] args) {
        int count=0, num, sum=0;
        boolean stop=false;
        Scanner sc = new Scanner(System.in);
        System.out.println(MSG_1);
        num = sc.nextInt();
        while (!stop) {
            sum=sum+count;
            if (sum > num){
                sum=sum-count;
                stop=true;
            } else if (sum==num) {
                System.out.print(" " + count);
                stop=true;
            }else{
                System.out.print(" " + count);
            }
            count++;
        }
        System.out.println();
        System.out.println(MSG_2 + sum);
    }
}
