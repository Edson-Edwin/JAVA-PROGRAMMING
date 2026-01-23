import java.util.*;
public class PalindromeWhile {
    public static boolean isPalindrome(int n){
        int original=n;
        int reversed =0;
        if(n<0){
            return false;
        }
        while(n!=0){
            reversed =reversed*10+n%10;
            n=n/10;
        }
        if(original==reversed){
            return true;
        }
        return false;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number:");
        int num=sc.nextInt();
        if(isPalindrome(num)){
            System.out.println(num+" is a palindrome");
        }else{
            System.out.println(num+" is not a palindrome");
        }
        sc.close();
        }
}

