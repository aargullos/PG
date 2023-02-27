import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String codiArticle, nomArticle, tipus, quantitat, preu;
        int num;
        switch (num) {
            case 1: 
                System.out.print("Introdueix el codi: ")
                break;
            case 2:
        System.out.print("Introdueix el codi: ");
        codiArticle = sc.nextLine();
        System.out.print("Introdueix el nom del article: ");
        nomArticle = sc.nextLine();
        System.out.print("Introdueix el tipus: ");
        tipus = sc.nextLine();       
        System.out.print("Introdueix la quantitat: ");
        quantitat = sc.nextLine();      
        System.out.print("Introdueix el preu: ");
        preu = sc.nextLine();
        sc.close();
         try (BufferedWriter bw = new BufferedWriter(new FileWriter("prova1.txt", true))) {
            bw.write("codi,nom article,tipus,quantitat,preu");
            bw.newLine();
            bw.write(codiArticle + "," + nomArticle + "," + tipus + "," + quantitat + "," + preu);
            bw.newLine();
            System.out.println("Dades afegides correctament.");
        } catch (IOException e) {
            System.out.println("Error escrivint les dades al document de text: " + e.getMessage());
        }
        break;
    }
}
