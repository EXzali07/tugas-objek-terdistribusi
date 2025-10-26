import java.rmi.Remote;
import java.rmi.RemoteException;

// Interface layanan pemesanan tiket
public interface TicketService extends Remote {
    // Method yang dapat diakses oleh client
    String pesanTiket(String nama, String tujuan) throws RemoteException;
}
