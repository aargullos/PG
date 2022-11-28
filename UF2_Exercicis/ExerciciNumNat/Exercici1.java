public class Exercici1 {
    private static final String MSG_1 = "Introdueix un nombre natural: ";
    private static final String MSG_2 = "Aquest és el numero introduit: ";
    private static int validate() {
       int num;
       do {
        System.out.println(MSG_1); 
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
       }while (num < 1);
       return num;
    }
    public static void main(String[] args) {
        int num;
        num = validate(); 
        System.out.println(MSG_2 + num);
    }   
}
