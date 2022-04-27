import java.util.Scanner;

public class ex19 {


    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n= scn.nextInt();
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <=(n-i) ; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k<=(2*i)+1;k++){
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i=n;i>=0;i--){

            for (int j=n-i;j>=0;j--){
                System.out.print(" ");
            }
            for (int k =(2*i)+1; k>=1;k--){
                System.out.print("*");
            }
            System.out.println();

        }

    }


}
