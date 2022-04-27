import java.util.Scanner;


public class ex8{
    public static void main(String [] args){
        Scanner scn = new Scanner(System.in);
        double mt,fz,tr,km,mzk,ort;
        System.out.println("Matematik notunuz: ");
        mt = not(scn.nextDouble());
        System.out.println("Fizik notunuz: ");
        fz = not(scn.nextDouble());
        System.out.println("Türkçe notunuz: ");
        tr = not(scn.nextDouble());
        System.out.println("Kimya notunuz: ");
        km = not(scn.nextDouble());
        System.out.println("Müzik notunuz: ");
        mzk = not(scn.nextDouble());

        ort=mt+fz+tr+km+mzk;
        ort /= 5;
        if(ort >= 55){
            System.out.println("TEBRİKLER SINIFI GEÇTİNİZ");
        }else
            System.out.println("SINIFTA KALDINIZ");
        System.out.println("NOT ORTALAMANIZ : "+ ort);
    }

    public static double not(double not){
        if(not > 100 ||not < 0){
            throw new RuntimeException("Geçerli not giriniz");
        }else
            return not;
    }
}
