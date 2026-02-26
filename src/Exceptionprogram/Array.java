
package Exceptionprogram;
import java.util.Scanner;
public class Array {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int arg[]={10,20,30,40};
  System.out.println("enter the index of the array");
  int index=sc.nextInt();
  try{
      int value=arg[index];
      System.out.println("the value is:" + value +" the index is:" + index);
  }
  catch(ArrayIndexOutOfBoundsException e){
      System.out.println( e.getMessage());
      
  }
      
    
    
    
    }
                
}

