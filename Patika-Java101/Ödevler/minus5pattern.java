
public class minus5pattern{
    public static void main(String[] args) {
        myPattern(30);

    }
    

    static int myTemp;
    public static void leftPattern(int number){
        while(number>0){
            System.out.print(number+" ");
            number-=5;
            if(number<=0){
                myTemp = number;
            }
            leftPattern(number);
            break;
        }
    }

    public static void rightPattern(int tmp,int number){
        while(tmp<=number){
            System.out.print(tmp+" ");
            tmp+=5;
            rightPattern(tmp, number);
            break;
        }
    }

    public static void myPattern(int myNum){
        leftPattern(myNum);
        rightPattern(myTemp, myNum);
    }

}