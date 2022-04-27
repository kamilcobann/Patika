import java.util.Scanner;

public class hw8 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Sayıyı giriniz");
        int sayi = scn.nextInt();

        for (int i=sayi-1;i>=0;i--){

            for (int j=sayi-i;j>=0;j--){
                System.out.print(" ");
            }
            for (int k =(2*i)+1; k>=1;k--){
                System.out.print("*");
            }
            System.out.println();

        }
    }
}
