import java.util.Scanner;

public class hw2 {
    public static void main(String []args){
        double armut=2.14,elma=3.67,domates=1.11,muz=0.95,patlican=5;
        double armutKilo,elmaKilo,domatesKilo,muzKilo,patlicanKilo;
        double top;
        Scanner scn=new Scanner(System.in);
        System.out.println("Armut kaç kilo");
        armutKilo=scn.nextDouble();
        System.out.println("Elma kaç kilo");
        elmaKilo=scn.nextDouble();
        System.out.println("Domates kaç kilo");
        domatesKilo=scn.nextDouble();
        System.out.println("Muz kaç kilo");
        muzKilo=scn.nextDouble();
        System.out.println("Patlıcan kaç kilo");
        patlicanKilo=scn.nextDouble();

        top= (armut*armutKilo)+(elma*elmaKilo)+(domatesKilo*domates)+(muzKilo*muz)+(patlicanKilo*patlican);
        System.out.println("Toplam tutar: "+ top);
    }
}
