
package collection;
import java.util.*;
public class maplearn {
    public static void main(String args[]){
        Map <String,Integer> e= new HashMap<>();
        e.put("one",1);
        e.put("two",2);
        e.put("three", 3);
        e.put("four", 4);
        e.put("five",5);
        e.putIfAbsent("five", 5);
  
        
      for (Map.Entry<String, Integer> v : e.entrySet()) {
          System.out.println(v);
    System.out.println("Key: " + v.getKey());
    System.out.println("Value: " + v.getValue());
}
      System.out.println(e.isEmpty());
    }
    
}
