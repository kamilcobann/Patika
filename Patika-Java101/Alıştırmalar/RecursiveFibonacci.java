import java.util.*;

public class RecursiveFibonacci{

    public static int fibonacci(int n){
        if(n==1 || n==2){
            return 1;
        }else{
            return fibonacci(n-1)+fibonacci(n-2);
        }
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Sayı girin :");
        int number = scn.nextInt();
        System.out.println(fibonacci(number));
        scn.close();
    }
}