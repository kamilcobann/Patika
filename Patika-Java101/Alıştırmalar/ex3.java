import java.util.Scanner;

public class ex3 {

    public static void main(String [] args){
        double a,b,c;
        Scanner scn = new Scanner(System.in);
        System.out.println("Kenar uzunluklarını girin: ");
        System.out.println("Kenar 1");
        a=scn.nextDouble();
        System.out.println("Kenar 2");
        b=scn.nextDouble();
        System.out.println("Kenar 3");
        c=scn.nextDouble();

        double d=(a+b+c)/2;
        double alan = Math.sqrt(d*(d-a)*(d-b)*(d-c));
        System.out.println("Çevresi "+ (2*d));
        System.out.println("Alanı "+ alan);
    }
}
