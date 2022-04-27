import java.util.Scanner;

public class ex12 {
    public static void main(String[] args) {
        int k,sum=0;
        int j=0;
        Scanner scn=new Scanner(System.in);
        System.out.println("Sayıyı girin");
        k= scn.nextInt();

        for (int i = 0; i <=k ; i++) {
            if (i%3==0 && i%4==0){
                sum+=i;
                j++;
            }
        }
        System.out.println(sum/j);

    }
}
