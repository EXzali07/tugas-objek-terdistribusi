import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

// Client untuk mengakses layanan TicketService
public class TicketClient {
    public static void main(String[] args) {
        try {
            // Terhubung ke registry server (localhost di port 1099)
            Registry registry = LocateRegistry.getRegistry("localhost", 1099);

            // Mendapatkan referensi objek remote
            TicketService service = (TicketService) registry.lookup("TicketService");

            // Memanggil method remote
            String response = service.pesanTiket("Alexander", "Jakarta");

            // Menampilkan hasil dari server
            System.out.println("💬 Response dari server: " + response);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
