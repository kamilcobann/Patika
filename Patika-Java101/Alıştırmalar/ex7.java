import java.util.Scanner;

public class ex7 {
    public static void main(String[]args){
        String userName,password,newPass,option;

        Scanner scn = new Scanner(System.in);
        System.out.println("Kullanıcı adınız:");
        userName=scn.nextLine();
        System.out.println("Şifreniz");
        password=scn.nextLine();
        if (userName.equals("patika")&&password.equals("java123")){
            System.out.println("Giriş yaptınız");
        }else {

            System.out.println("Bilgileriniz yanlış! \n Şifrenizi sıfırlamak ister misiniz? (e//h)");
            option= scn.nextLine();
            if (option.equals("e")){
                boolean cvp=true;
                while(cvp==true){
                    System.out.println("Yeni Şifre:");
                    newPass=scn.nextLine();
                    if (newPass.equals(password) || newPass.equals("java123"))
                        System.out.println("GEÇERLİ ŞİFRE GİRİNİZ");
                    else{
                        password=newPass;
                        cvp=false;
                        System.out.println("ŞİFRE DEĞİŞTİRİLDİ");
                    }
                }
            }else
                System.out.println("GİRİŞ BAŞARISIZ");

        }
    }
}
