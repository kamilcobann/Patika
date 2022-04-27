import java.util.Scanner;

public class ex10 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a,b,c;
        System.out.println("Sayıları sırayla giriniz");
        System.out.println("a:");
        a= scn.nextInt();
        System.out.println("b:");
        b= scn.nextInt();
        System.out.println("c:");
        c =scn.nextInt();
        if ((a>b) && (a>c)){
            if (b>c){
                System.out.println("a>b>c");
            }else
                System.out.println("a>c>b");
        }
        if ((b>a) && (b>c)){
            if (a>c){
                System.out.println("b>a>c");
            }else
                System.out.println("b>c>a");
        }
        if ((c>b) && (c>a)){
            if (a>b){
                System.out.println("c>a>b");
            }else
                System.out.println("c>b>a");
        }
    }
}
