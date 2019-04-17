import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

public class Server {
	final static String HOST = "localhost";

	public static void main(String[] args)throws RemoteException {
		// TODO Auto-generated method stub
		Hello h = new Hello();
		LocateRegistry.createRegistry(1099);
		String objectName = "rmi://" + HOST + "/hello";
		try {
			Naming.rebind(objectName, h);
			System.out.println("Server is ready");
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
