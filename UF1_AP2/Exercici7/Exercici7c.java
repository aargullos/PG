import java.util.Scanner;

public class Exercici7 {
    public static void main(String[] args) {
        int count=0;
        Scanner sc = new Scanner(System.in);
        while (count <= 100) {
            if (count % 2 == 0){
                System.out.println(count); 
            }
            count++;
        }
    }
}
