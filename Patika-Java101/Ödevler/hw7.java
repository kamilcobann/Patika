import java.util.Scanner;

public class hw7 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Sayıyı giriniz");
        int sayi = scn.nextInt();
        int sum=0;
        for (int i = 1; i < sayi; i++) {
            if (sayi%i==0){
                sum+=i;
            }
        }
        if (sum==sayi)
            System.out.println(sayi+" mükemmel sayıdır");
        else
            System.out.println(sayi+" mükemmel sayı değildir");
    }
}
