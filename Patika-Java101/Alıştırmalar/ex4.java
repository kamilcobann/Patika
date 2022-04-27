import java.util.Scanner;

public class ex4 {
    public static void main(String [] args){
        double acılıs=10,TLperKM=2.20,minTL=20,gidilenKM;
        Scanner scn=new Scanner(System.in);
        System.out.println("Gidilen KM'yi girin ");
        gidilenKM = scn.nextDouble();

        if (((gidilenKM*TLperKM)+acılıs)<=minTL){
            System.out.println("Ödemeniz gereken tutar "+minTL);
        }else
            System.out.println("Ödemeniz gereken tutar "+((gidilenKM*TLperKM)+acılıs));

    }
}
