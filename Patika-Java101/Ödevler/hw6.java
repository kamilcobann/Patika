import java.util.Scanner;

public class hw6 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Kaç sayı gireceksniz");
        int sayi;
        int buyuk=0;
        int kucuk=0;
        int index = scn.nextInt();
        for (int i = 1; i <=index ; i++) {
            System.out.println(i+". Sayıyı giriniz: ");
            sayi = scn.nextInt();
            if (sayi>buyuk){
                buyuk=sayi;
            }
            if(sayi<kucuk){
                kucuk=sayi;
            }
        }
        System.out.println("En büyük sayı: "+buyuk);
        System.out.println("En küçük sayı: "+kucuk);
    }
}
