import java.util.Scanner;

public class hw5 {
    public static void main(String[] args) {
        int yıl;
        Scanner scn = new Scanner(System.in);
        System.out.println("Yıl giriniz : ");
        yıl=scn.nextInt();

        if (yıl%100==0){
            if (yıl%400==0){
                System.out.println(yıl + " artık yıldır");
            }else
                System.out.println(yıl + " artık yıl değilir");
        }else if (yıl%4==0){
            System.out.println(yıl + " artık yıldır");
        }else
            System.out.println(yıl + " artık yıl değildir");


    }
}
