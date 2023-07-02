import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class CalculatorImpl extends UnicastRemoteObject implements RemoteCalculator {

    protected CalculatorImpl() throws RemoteException {
        super();
    }

    public int sumNumbers(int[] numbers) throws RemoteException {
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        return sum;
    }
}
