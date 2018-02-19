import com.esotericsoftware.kryonet.Connection;
import com.esotericsoftware.kryonet.Listener;
import com.esotericsoftware.kryonet.Server;

import java.io.IOException;

/**
 * Server
 *
 * <P>Server entry point.
 * <P>Starts GUI, listens for client connections and sends responses to client
 *
 * @author Team 7
 * @version 1.0
 */
public class ServerMain {

    private static final int TCP_PORT = 8080;
    static Server server;

    /*public static void main(String[] args) throws IOException {
        // startServer();
    }*/

    public static void startServer() throws IOException {
        server = new Server();
        server.start();
        server.bind(TCP_PORT);

        Register.register(server);

        server.addListener(new Listener() {
            public void received (Connection connection, Object object) {
                if (object instanceof Request) {
                    Request request = (Request) object;

                    System.out.println("Server received the request: " + request.getText());

                    Response response = new Response();
                    response.setText("A response from the server...");

                    connection.sendTCP(response);
                }
            }
        });
    }

    public static void stopServer(){
        server.close();
        server.stop();
    }
}
