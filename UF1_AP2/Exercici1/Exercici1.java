import java.util.Scanner;

public class Exercici1 {
    public static void main(String[] args) {
        System.out.println("Arnau"); //a
        System.out.println("Arnau Argullós"); //b
        System.out.println("Arnau \nArgullós"); //c
        Scanner sc = new Scanner(System.in);
        System.out.println("");
        System.out.println("Cuadrat");
        System.out.println("");
        for(int i=1;i<=10;i++) {

            for(int j=1;j<=10;j++) {

                System.out.print(" * ");
            }
            System.out.println();
        }
        System.out.println(" ");
        System.out.println("Triagle");
        System.out.println("");
        int rows = 10;
        for (int x = 1; x <= rows; x++)
        {
            for (int i = 1; i <= x; i++)
            {
                System.out.print(" * ");
            }
            System.out.println("");
        }
    }
}
