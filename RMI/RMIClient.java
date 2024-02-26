import java.rmi.Naming;

public class RMIClient {
    public static void main(String[] args) {
        try {
            RemoteInterface remoteObject = (RemoteInterface) Naming.lookup("//localhost/RemoteObject");
            String result = remoteObject.convertToUpper("hello I'm Nadine");
            System.out.println("Result from server: " + result);
        } catch (Exception e) {
            System.err.println("Client exception: " + e.toString());
            e.printStackTrace();
        }
    } 
}
