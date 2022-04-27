import java.util.Scanner;

public class ex15 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n,r,com;
        System.out.println("Kombinasyon değerlerini girin n,r");
        n = scn.nextInt();
        r = scn.nextInt();
        com= factorial(n)/(factorial(r)*(factorial(n-r)));
        System.out.println(com);

    }
    public static int factorial(int n){
        if (n>=1)
            return n*factorial(n-1);
        else
            return 1;
    }
}
