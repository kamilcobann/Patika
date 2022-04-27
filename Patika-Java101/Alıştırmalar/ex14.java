import java.util.Scanner;

public class ex14 {
    public static void main(String[] args) {
        int i;
        Scanner scn= new Scanner(System.in);

        System.out.println("sayı giriniz");
        i= scn.nextInt();

        System.out.println("4'ün katları : ");
        for (int j = 0; j <= i; j++) {
            if (j%4==0){
                System.out.println(j);
            }
        }
        System.out.println("5'in katları");
        for (int j = 0; j <=i; j++) {
            if (j%5==0){
                System.out.println(j);
            }
        }
    }
}
