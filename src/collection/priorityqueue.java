
package collection;
import java.util.*;
public class priorityqueue {
    public static void main(String args[]){
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.offer(40);
        pq.offer(30);
        pq.offer(22);
        pq.offer(35);
        pq.poll();
        System.out.println(pq.peek());
        System.out.println(pq);
        
    }
    
}
