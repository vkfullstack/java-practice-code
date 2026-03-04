
package collection;
import java.util.Queue;
import java.util.LinkedList;
public class queulearn {
    public static void main(String args[]){
    Queue<Integer> queue= new LinkedList<>();
    queue.offer(10);
    queue.offer(20);
    queue.offer(30);
    queue.poll();
   System.out.println( queue.peek());
    System.out.println(queue);
    
            
    
}
}
