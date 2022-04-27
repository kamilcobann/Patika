import java.util.*;
public class ex11 {
    public static void main(String[] args) {
       Scanner scanner=new Scanner(System.in);
        int ay,gun;

        System.out.println("Ayı girin ");
        ay=scanner.nextInt();
        System.out.println("Gunu girin ");
        gun=scanner.nextInt();

        if (ay==1){
            if (gun>=1 && gun<=31){
                if (gun<=21){
                    System.out.println("OĞLAK");
                }else
                    System.out.println("KOVA");
            }
        }
        if (ay==2){
            if (gun>=1 && gun<=28){
                if (gun<=19){
                    System.out.println("KOVA");
                }else
                    System.out.println("BALIK");
            }
        }if (ay==3){
            if (gun>=1 && gun<=31){
                if (gun<=20){
                    System.out.println("BALIK");
                }else
                    System.out.println("KOÇ");
            }
        }if (ay==4){
            if (gun>=1 && gun<=30){
                if (gun<=20){
                    System.out.println("KOÇ");
                }else
                    System.out.println("BOGA");
            }
        }if (ay==5){
            if (gun>=1 && gun<=31){
                if (gun<=21){
                    System.out.println("BOĞA");
                }else
                    System.out.println("İKİZLER");
            }
        }if (ay==6){
            if (gun>=1 && gun<=31){
                if (gun<=22){
                    System.out.println("İKİZLER");
                }else
                    System.out.println("YENGEÇ");
            }
        }if (ay==7){
            if (gun>=1 && gun<=30){
                if (gun<=23){
                    System.out.println("YENGEÇ");
                }else
                    System.out.println("ASLAN");
            }
        }if (ay==8){
            if (gun>=1 && gun<=31){
                if (gun<=21){
                    System.out.println("ASLAN");
                }else
                    System.out.println("BASAK");
            }
        }if (ay==9){
            if (gun>=1 && gun<=31){
                if (gun<=21){
                    System.out.println("BASAK");
                }else
                    System.out.println("TERAZI");
            }
        }if (ay==10){
            if (gun>=1 && gun<=31){
                if (gun<=21){
                    System.out.println("TERAZI");
                }else
                    System.out.println("AKREP");
            }
        }if (ay==11){
            if (gun>=1 && gun<=31){
                if (gun<=21){
                    System.out.println("AKREP");
                }else
                    System.out.println("YAY");
            }
        }if (ay==12){
            if (gun>=1 && gun<=31){
                if (gun<=21){
                    System.out.println("YAY");
                }else
                    System.out.println("OĞLAK");
            }
        }




    }
}
