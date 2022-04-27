import java.util.ArrayList;
import java.util.Scanner;

public class ex13 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int k,k1,sum=0;
        boolean state=true;

        while(true){
            System.out.println("Sayıyı girin");
            k=scn.nextInt();
            sum+=k;
            if (k%2==1){
                sum-=k;
                System.out.println("Toplamı : " + sum);
                break;
            }
        }

    }
}
