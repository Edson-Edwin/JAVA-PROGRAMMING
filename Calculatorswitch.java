import java.util.*;
public class Calculatorswitch {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your First number: ");
        int a=sc.nextInt();
        System.out.print("Enter your second number: ");
        int b=sc.nextInt();
        System.out.print("Enter the operator (+,-,*,/): ");
        char op=sc.next().charAt(0);
        switch (op){
            case '+':
                System.out.println("Addition: " + (a+b));
                break;
            case '-':
                System.out.println("Subtraction: " + (a-b));
                break;
            case '*':
                System.out.println("Multiplication: " + (a*b));
                break;
            case '/':
                if(b!=0){
                    System.out.println("Division: " + (a/b));
                } else {
                    System.out.println("Error: Division by zero");
                }
                break;
            default:
                System.out.println("Invalid operator");
                break;
        }
        sc.close();                                                                                         
    }
}
