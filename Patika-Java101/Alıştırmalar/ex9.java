import java.util.Scanner;

public class ex9 {
    public static void main(String[] args) {
        Scanner scn=  new Scanner(System.in);
        int tmp , state;
        String
                e1="Kayak",e2="Sinema",e3="Piknik",e4="Yüzme";
        System.out.println("Sıcaklığı girin");
        tmp = scn.nextInt();

        if (tmp<5){
            System.out.println(e1);
        }else if (5<=tmp && tmp<15){
            System.out.println(e2);
        }else if (15<=tmp && tmp<25){
            System.out.println(e3);
        }else if (tmp>25) {
            System.out.println(e4);
        }


    }
}
