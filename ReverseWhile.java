import java.util.*;
public class ReverseWhile {
    public static int reverseNumber(int num){
        int reversed=0;
        int sign=(num<0)?-1:1;
        num=Math.abs(num);
        if(num==0){
            return 0;
        }
        while(num!=0){
            reversed=reversed*10+num%10;
            num=num/10;
        }
        return reversed*sign;
    }
    public static void main(String[] args){
        System.out.print("Enter your First number: ");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        System.out.println("Reversed Number is: "+reverseNumber(num));
        sc.close();
    }
    
}
