
package collection;
import java.util.ArrayList;
public class arraylist {
    public static void  main(String args[]){
        ArrayList<Integer> li= new ArrayList();
        li.add(10);
        li.add(20);
        li.add(30);
        li.add(40);
        // add the value according to the indexs
         li.add(3,60);
         System.out.println(li);
           System.out.println(li.get(2));
           //remove the value 
           li.remove(3);
               // System.out.println(li);
        // modify the value 
        li.set(2,80);
        System.out.println(li);
         //itrate throw function  
        for (Integer element :li){
            System.out.println(element);
        }
    }
  
    
}
