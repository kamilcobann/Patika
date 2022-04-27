import java.util.Scanner;

public class hw4
{
    public static void main(String[] args) {
        int yıl;
        Scanner scn = new Scanner(System.in);
        System.out.println("Doğum yılınızı giriniz: ");
        yıl= scn.nextInt();
        int rem = yıl%12;
        String [] burc= {"Maymun","Horoz","Köpek","Domuz","Fare","Öküz","Kaplan",
                "Tavşan","Ejderha","Yılan","At","Koyun"};
        System.out.println("Çin zodyağı burcunuz : "+burc[rem]);

    }
}
