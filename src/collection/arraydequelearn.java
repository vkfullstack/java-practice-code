
package collection;
import java.util.ArrayDeque;
public class arraydequelearn {
    public static void main(String args[]){
        ArrayDeque <Integer> dq= new ArrayDeque<>();
        dq.offer(23);
        dq.offerFirst(12);
         dq.add(44);
        dq.add(33);
        dq.add(77);
        dq.offerLast(45);
         System.out.println(dq);
      
        System.out.println(dq.peek());
   
       System.out.println(dq.peekFirst());
   
       System.out.println(dq.peekLast());
       
        
        dq.poll();
        dq.pollFirst();
        dq.pollLast();
        System.out.println(dq);
        
        
    }
}
