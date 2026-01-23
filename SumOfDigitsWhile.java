import java.util.*;
public class SumOfDigitsWhile {
    public static int sumOfDigits(int num){
        int sum=0;
        num=Math.abs(num);
         while(num!=0){
            sum=sum+num%10;
            num=num/10;
        }
        return sum;
    }
    public static void main(String[] args){
        System.out.print("Enter a number: ");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        System.out.println("Sum of the Digits are: "+sumOfDigits(num));
        sc.close();
    }
}
