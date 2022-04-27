import java.util.Scanner;

public class ex6 {
    public static void main(String []args){
        double n1,n2;
        int select;
        Scanner scn= new Scanner(System.in);
        System.out.println("İlk sayıyı giriniz : ");
        n1 = scn.nextDouble();
        System.out.println("İkinci sayıyı giriniz : ");
        n2 = scn.nextDouble();

        System.out.println("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");
        System.out.println("Seçiminiz :");
        select = scn.nextInt();


        switch (select){
            case 1:
                System.out.println("İki sayının toplamı : "+(n1+n2));
                break;
            case 2:
                System.out.println("İki sayının farkı : "+(n1-n2));
                break;
            case 3:
                System.out.println("İki sayının çarpımı : "+(n1*n2));
                break;
            case 4:
                if (n2==0){
                    System.out.println("BÖLEN SAYI O OLAMAZ");
                }else
                System.out.println("İki sayının bölümü: "+(n1/n2));
                break;
            default:
                System.out.println("GEÇERLİ BİR SAYI GİRİNİZ!");
        }
    }
}
