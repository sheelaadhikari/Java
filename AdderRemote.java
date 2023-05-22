import java.rmi.*;
import java.rmi.server.*;
public class RemoteAdder extends UnicastRemoteObject implements Adder{
    RemoteAddress()throws Exception{

    }
    public int add(int x, int y){
        return x+y;
    }
}