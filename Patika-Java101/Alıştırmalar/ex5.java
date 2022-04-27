import java.util.Scanner;

public class ex5 {
    public static void main(String[]args){
        double r,pi=3.14,alpha,alan,cevre,dilimAlan;
        Scanner scn = new Scanner(System.in);
        System.out.println("Yarıçap girin ");
        r = scn.nextDouble();
        System.out.println("Açı girin ");
        alpha = scn.nextDouble();

        alan = (pi)*Math.pow(r,2);
        cevre=2*(pi)*r;
        dilimAlan=(alan*alpha)/360;

        System.out.println("Cevre : "+ cevre+" Alan : "+alan+ "Daire diliminin alanı :"+dilimAlan);
    }
}
