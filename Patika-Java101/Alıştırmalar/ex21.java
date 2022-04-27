import java.util.Scanner;

public class ex21 {
    public static void main(String[] args) {
        Scanner scn =new Scanner(System.in);
        int sayi1 = scn.nextInt();
        int sayi2=scn.nextInt();
        int ebob = 1;
        int ekok=1;
        int k=sayi1;
        while (k>1){
            if (sayi1%k==0 && sayi2%k==0){
                ebob=k;
                ekok=(sayi1*sayi2)/ebob;
                break;
            }
            k--;
        }
        System.out.println("Ebob : "+ebob+"---EKOK: "+ekok);

    }
}
