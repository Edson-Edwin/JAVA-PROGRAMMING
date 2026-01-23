import java.util.*;
public class Largestof3 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number");
        int a=sc.nextInt();
        System.out.println("Enter second number");
        int b=sc.nextInt();
        System.out.println("Enter third number");
        int c=sc.nextInt();
        if(a>=b && a>=c){
            System.out.println("Largest is :"+a);
        }
        else if(b>=a && b>=c){
            System.out.println("Largest is :"+b);
        }
        else{
            System.out.println("Largest is :"+c);
        }
        sc.close();
    }
}
