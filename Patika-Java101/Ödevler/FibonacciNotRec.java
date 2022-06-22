import java.util.Scanner;

public class hw10 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Sayıyı giriniz");
        int sayi = scn.nextInt();
        int n1=0,n2=1,n3;
        System.out.print(n1+" "+n2+" ");
        for (int i = 2; i <sayi ; ++i) {
        n3=n2+n1;
            System.out.print(n3+" ");
            n1=n2;
            n2=n3;
        }
    }
}
