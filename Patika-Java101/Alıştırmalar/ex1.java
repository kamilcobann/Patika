import java.util.Scanner;

public class ex1 {
    public static void main(String[]args){
        Scanner scn = new Scanner(System.in);
        System.out.println("Matematik notunuz: ");
        int mat = scn.nextInt();

        System.out.println("Fizik notunuz: ");
        int fizik = scn.nextInt();

        System.out.println("Kimya notunuz: ");
        int kimya = scn.nextInt();

        System.out.println("Türkçe notunuz: ");
        int turkce = scn.nextInt();

        System.out.println("Tarih notunuz: ");
        int tarih = scn.nextInt();

        System.out.println("Müzik notunuz: ");
        int muzik= scn.nextInt();

        double ort = (mat+fizik+kimya+turkce+tarih+muzik)/6;

        while(ort>=60){
            System.out.println("Sınıfı Geçti");
            break;
        }
        while(ort<60){
            System.out.println("Sınıfta Kaldı");
            break;
        }


    }
}
