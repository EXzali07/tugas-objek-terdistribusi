import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

// Implementasi server untuk layanan TicketService
public class TicketServer extends UnicastRemoteObject implements TicketService {

    // Konstruktor wajib yang melempar RemoteException
    protected TicketServer() throws RemoteException {
        super();
    }

    // Implementasi method remote
    public String pesanTiket(String nama, String tujuan) throws RemoteException {
        return "Tiket untuk " + nama + " ke " + tujuan + " berhasil dipesan!";
    }

    public static void main(String[] args) {
        try {
            // Membuat objek server
            TicketServer server = new TicketServer();

            // Membuat RMI registry di port 1099
            Registry registry = LocateRegistry.createRegistry(1099);

            // Mendaftarkan objek remote ke registry
            registry.rebind("TicketService", server);

            System.out.println("✅ Server siap dan menunggu client...");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
