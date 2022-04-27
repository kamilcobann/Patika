import java.util.Scanner;

public class ex2 {
    public static void main (String[] args){
        Scanner scn= new Scanner(System.in);
        double fiyat,KDV,sonFiyat = 0;
        System.out.println("Lütfen ürünün tutarını giriniz");
        fiyat = scn.nextDouble();

        if (fiyat >= 0 || fiyat <= 1000){
            KDV=0.18;
            sonFiyat=fiyat+(KDV*fiyat);

        }else if (fiyat > 1000){
            KDV=0.8;
            sonFiyat=fiyat+(KDV*fiyat);
        }
        System.out.println("Ürünün KDV dahil fiyatı : "+ sonFiyat +" TL");
    }
}
