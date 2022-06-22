import java.util.Scanner;

public class bankBasic {


    public static void main(String[] args) {
        String userName,password;
        Scanner scn = new Scanner(System.in);
        int right=3;
        int balance=1500;
        int select;
        int price;
        while(right>0){
            System.out.println("Kullanıcı Adınız :");
            userName= scn.nextLine();
            System.out.println("Parolanız");
            password=scn.nextLine();

            if (userName.equals("patika") && password.equals("dev123")){
                System.out.println("Merhaba, Kodluyoruz Bankasına Hoşgeldiniz!");
                do {


                    System.out.println("1-Para Yatırma\n" +
                            "2-Para Çekme \n" +
                            "3-Bakiye Sorgula\n" +
                            "4-Çıkış Yap");
                    select = scn.nextInt();
                    switch (select) {
                        case 1:
                            System.out.println("Para miktarı :");
                            price = scn.nextInt();
                            balance += price;
                            break;
                        case 2:
                            System.out.println("Para miktarı :");
                            price = scn.nextInt();
                            if (price > balance) {
                                System.out.println("Bakiye yetersiz");
                            } else {
                                balance -= price;
                            }
                            break;
                        case 3:
                            System.out.println("Bakiyeniz :" + balance);
                            break;
                    }
                }while(select!=4);
                System.out.println("Tekrar Görüşmek Üzere");
                    break;
                }

            else {
                right--;
                System.out.println("Hatalı kullanıcı adı ya da şifre");
                if (right==0){
                    System.out.println("Hesabınız bloke olmuştur lütfen banka ile ilteşime geçiniz.");

                }else
                    System.out.println("Kalan Hakkınız"+right);
            }
        }
    }

}
