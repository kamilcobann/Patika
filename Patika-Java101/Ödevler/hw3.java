import java.util.Scanner;

public class hw3 {
    public static void main(String[] args) {
     Scanner scn = new Scanner(System.in);
     int yas,mesafe,tip;
     double fiyat;
        System.out.println("Mesafeyi km türünden giriniz: ");
        mesafe = scn.nextInt();
        System.out.println("Yaşınızı giriniz: ");
        yas = scn.nextInt();
        System.out.println("Yolculuk tipini giriniz (1=> TEK YÖN 2=> GİDİŞ DÖNÜŞ  ): ");
        tip = scn.nextInt();

        if (yas>0 && mesafe>0 && (tip==1 || tip==2)){
            fiyat=mesafe*0.10;
            double indirimliFiyat = 0;
            if (tip==1){
                if(yas <=12){
                    indirimliFiyat=fiyat-(fiyat*0.50);
                }if (yas>12 && yas <=24 ){
                    indirimliFiyat=fiyat-(fiyat*0.10);
                }if (yas>24 && yas <=65){
                    indirimliFiyat=fiyat;
                }if (yas>65){
                    indirimliFiyat=fiyat-(fiyat*0.20);
                }
            }

            if (tip==2){
                fiyat=mesafe*0.10;
                fiyat-=(fiyat*0.20);
                if(yas <=12){
                    indirimliFiyat=fiyat-(fiyat*0.50);
                }if (yas>12 && yas <=24 ){
                    indirimliFiyat=fiyat-(fiyat*0.10);
                }if (yas>24 && yas <=65){
                    indirimliFiyat=fiyat;
                }if (yas>65){
                    indirimliFiyat=fiyat-(fiyat*0.20);
                }
                indirimliFiyat*=2;

            }
            System.out.println("Toplam tutar" + indirimliFiyat);


        }else
            System.out.println("Hatalı veri girdiniz!");


    }

}
