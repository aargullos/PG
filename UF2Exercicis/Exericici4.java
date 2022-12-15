package institutmvm.cat;
import java.util.Scanner;

public class Exercici4 {
     public static void main(String[] args) {
        int num;
        Exercici4 met = new Exercici4();
        num = met.validate();
    }
    public int validate() {
       int num, count=0;
       do {
        System.out.println("Introdueix un nombre natural"); 
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        if (num > 0){
           System.out.println("El nombre es natural"); 
        }else {
            System.out.println("El nombre no es natural"); 
        }
       count++; 
       }while (count < 3 && num < 0);
       return num;
    }
}
