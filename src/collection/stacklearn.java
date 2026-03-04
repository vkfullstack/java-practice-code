
package collection;
import java.util.Stack;
public class stacklearn {
    public static void main(String args[]){
        Stack<String> animals = new Stack<>();
        animals.push("dog");
        animals.push("cat");
        animals.push("lion");
        animals.push("hors");
        animals.pop();
        System.out.println(animals.peek());
    }
    
}
