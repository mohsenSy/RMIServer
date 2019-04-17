import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class Hello extends UnicastRemoteObject implements HelloInt {

	protected Hello() throws RemoteException {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String sayHello() throws RemoteException {
		// TODO Auto-generated method stub
		System.out.println("Hi I am on server");
		return "Hello World from RMI";
	}
	public double average(double[] ar)throws RemoteException {
		double sum = 0;
		for(double x : ar) {
			sum += x;
		}
		return sum / ar.length;
	}

}
