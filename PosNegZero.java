import java.util.*;
public class PosNegZero {
    public static void main(String[] args){
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter your number : ");
       int num=Integer.parseInt(sc.nextLine());
       if(num==0){
        System.out.println("It is Zero");
       }
       else if(num<0){
        System.out.println("Number is negative");
       }
       else{
        System.out.println("It is a positive number");
       }
    }
}
