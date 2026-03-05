
package collection;
import java.util.*;
public class hashsetlearn {
    public static void main(String args[]){
        // does not mainatin insertion order
        // LinkedHashSet  maintain the inseretion order methods  are same just replace the HashSet with LinkedHashSet
        //treeSet  sorted order red-boack tree same  methods are same follow 
        Set<Integer> set = new HashSet<>();
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(40);
        System.out.println(set);
        
        // remove method 
        set.remove(20);
        System.out.println(set);
        // conatins  isEmpty  return the boolean value
        System.out.print(set.contains(88));
        
    }
    
}
