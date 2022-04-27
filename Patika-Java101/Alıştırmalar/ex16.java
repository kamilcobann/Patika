import java.util.Scanner;

public class ex16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Üssü alınacak sayı");
        int k=scanner.nextInt();
        System.out.println("üs olacak sayı");
        int t= scanner.nextInt();
        int sayi = 1;

        for (int i = 1; i <= t; i++) {
            sayi*=k;
        }
        System.out.println(k+"^"+t+"="+sayi);
    }
}
