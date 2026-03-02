
package Exceptionprogram;
class emp{
 String name;
 int age;
    emp( String  name, int age){
        this.name= name;
        this.age=age;
    }
    public void display(){
        System.out.println("the name is " + name);
    }
}
class vk extends emp{
    String name;
     public void display1( String name){
         this.name= name
        System.out.println(name);
    }
}
public class demo {
    public static void main(String args[]){
        emp e = new emp("vijay",22);
        e.display();
    }
    
}
