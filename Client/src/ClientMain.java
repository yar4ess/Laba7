import Client.Client;
import java.io.IOException;
import Utility.PortAsker;

public class ClientMain {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Client client = new Client("localhost", PortAsker.getPort());
        client.run();
    }
}
