import java.util.Scanner;

public class hw1 {
    //BMI CALC.
    public static void main(String []args){
        double kg,BMI,boy;
        Scanner scanner= new Scanner(System.in);
        System.out.println("Lütfen boyunuzu (metre cinsinde) giriniz :");
        boy = scanner.nextDouble();
        System.out.println("Lütfen kilonuzu giriniz :");
        kg = scanner.nextDouble();
        BMI=kg/(boy*boy);
        System.out.println("Vücut kitle İndeksiniz : "+ BMI);
    }
}
