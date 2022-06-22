import java.util.Scanner;

public class Harmonic {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Sayi girin");
        int x = scn.nextInt();
        double sum = 0;


        for (int i = 1; i <=x; i++) {
            sum += (1.0/i);
        }
        System.out.println(sum);
    }
}
