/*nextBoolean()
nextByte()
nextDouble()
nextFloat()
nextInt()
nextLine()
nextLong()
nextShort() */

import java.util.*;
public class Userinput {
   public static void main(String[] args){
    Scanner sc= new Scanner(System.in);
    System.out.print("Enter your first number : ");
    int num1=Integer.parseInt(sc.nextLine());
    System.out.print("Enter your name:");
    String name=sc.nextLine();
    System.out.print("Enter your CGPA:");
    float cgpa=Float.parseFloat(sc.nextLine());
    System.out.println("Hello "+name);
    System.out.println("Your number is :"+num1);
    System.out.println("Your CGPA is :"+cgpa);
    sc.close();
   }
 //Usiong this because of input buffer issue   
}
