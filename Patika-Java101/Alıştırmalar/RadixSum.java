import java.util.Scanner;

public class RadixSum {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a, sum = 0,b;
        System.out.println("Sayı girin:");
        a = scn.nextInt();

        if (a>9){
            while(a != 0){
                b = a%10;
                a/=10;
                sum += b;
            }
        }else{
            System.out.println("HATA");
        }
        System.out.println(sum);
    }
}