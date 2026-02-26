
package Exceptionprogram;
import java.util.Scanner;
public class ArithmeticEX {
      static int divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero!"); // throw exception
        }
        return a / b;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the first no");
        int a=sc.nextInt();
        System.out.println("enter the second no");
        int b=sc.nextInt();
        try{
            int result=divide(a,b);
            System.out.println("the result is:" + result);
        }
        catch(ArithmeticException e){
           System.out.println("error is:" + e.getMessage());
        }
        finally{
             System.out.println("Program execution completed.");
        }
        sc.close();
        
    }
}
