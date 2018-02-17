import com.esotericsoftware.kryonet.Client;
import com.esotericsoftware.kryonet.Connection;
import com.esotericsoftware.kryonet.Listener;

import java.io.IOException;

/**
 * Client
 *
 * <P>Client entry point.
 * <P>Starts GUI and connection to server
 *
 * @author Team 7
 * @version 1.0
 */
public class ClientMain {

    private static final int TIMEOUT = 5000;
    private static final String HOST = "localhost";
    private static final int TCP_PORT = 8080;

    public static void main(String[] args) throws IOException {
        // startClient();
    }

    // client will disconnect unless thread keeps running
    // when the UI code is implemented, the client listener will keep its connection
    // to test, uncomment for(;;); to keep the thread alive
    public static void startClient() throws IOException {
        Client client = new Client();
        client.start();
        client.connect(TIMEOUT, HOST, TCP_PORT);

        Register.register(client);

        Request request = new Request();
        request.setText("A message from the client");
        client.sendTCP(request);

        boolean clientIsActive = true;

        client.addListener(new Listener() {
            public void received (Connection connection, Object object) {
                if (object instanceof Response) {
                    Response response = (Response) object;

                    System.out.println("A response from the server: " + response.getText());
                }
            }
        });

        // for(;;);
    }
}
