import java.util.*;

public class Palindrome{
    
    public static int reversing(int number){
        int tmp = number, reverseNum = 0,lastNum;
        while(tmp != 0){
            System.out.println("========\nSayı : "+tmp);
            lastNum = tmp % 10;
            System.out.println("Son Basamak : "+lastNum);
            reverseNum = (reverseNum)*10 + lastNum;
            System.out.println("Yeni Sayı : "+reverseNum);
            tmp /= 10;
        }
        return reverseNum;
    }

    public static boolean isPalindrome(int number){
        int newNum = reversing(number);
        if(newNum == number){
            System.out.println(number+" is palindrome");
            return true;
        }else{
            System.out.println(number+" is not palindrome");
            return false;
        }
    }

    public static void main(String[] args) {
       isPalindrome(1001);
    }
}