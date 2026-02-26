//in this program i used custom exception 
package Exceptionprogram;
class AgeException extends  Exception{
    AgeException(String name){
        super(name);
    }
}
public class AgeValidato {
    static void validateage(int age) throws AgeException{
        if(age<18){
            throw new AgeException("Age is not valid");
        }
        System.out.println("Age is valid:"+ age);
    }
    public static void main(String args[]){
        int [] testage={20,30,18,10};
        for(int age : testage){
            try{
                validateage(age);
            }
            catch(AgeException e){
                System.out.println(e.getMessage());
            }
        }
    }
    
}
