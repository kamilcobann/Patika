import java.util.Scanner;
public class PowerRecurisive {
    static int pow(int base,int power){
        if(power==0){
            return 1;
        }else{
            return base*pow(base,power-1);
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        int j = scanner.nextInt();
        int result = pow(i, j);
        System.out.println(result);
    }
}
