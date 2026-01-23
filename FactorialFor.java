import java.util.*;
public class FactorialFor {
     public static int factorial(int n){
            int fact=1;
            if(n<0){
               return -1;
            }
                 for(int i=1;i<=n;i++){
                 fact=fact*i;
               }        
            return fact;
     }
     public static void main(String[] args){
          Scanner sc=new Scanner(System.in);
          System.out.print("Enter your number: ");
          int num=sc.nextInt();
          System.out.println("Factorial of the number is :"+factorial(num));
          sc.close();
     }
    
}
