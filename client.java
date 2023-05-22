import java.rmi.*;
public class client{
    public static void main(String[]args){
        try{

       
        Adder skeleton=(Adder) Nameing.lookup("rmi://localhost:1234/nist");
        System.out.println(skeleton.add(1,2));
        }

        catch(Exception e){
            System.out.println(e);
        }
     }

}