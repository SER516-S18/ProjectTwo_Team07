package server;

import com.esotericsoftware.kryonet.Connection;
import com.esotericsoftware.kryonet.Listener;
import com.esotericsoftware.kryonet.Server;
import network.Register;
import network.Request;
import network.Response;
import util.Constants;

import java.io.IOException;
import java.util.Timer;
import java.util.TimerTask;

/**
 * Server
 *
 * Server entry point.
 * Starts GUI, listens for client connections and sends responses to client
 *
 * @author Team 7
 * @version 1.0
 */
public class ServerMain {

    static Server server;

    private static ServerData serverData;

    public static void main(String[] args) throws IOException {
        serverData = new ServerData();
        startServer();
    }

    public static void startServer() throws IOException {
        server = new Server();
        server.start();
        server.bind(Constants.TCP_PORT);

        Register.register(server);

        server.addListener(new Listener() {
            public void received (Connection connection, Object object) {
                if (object instanceof Request) {
                    Request request = (Request) object;

                    serverData.setFrequency(2);
                    serverData.setMax(200);
                    serverData.setMin(2);

                    System.out.println("Server received the request: " + request.getNumChannels());

                    buildResponse(connection.getID(), request.getNumChannels());
                }
            }
        });
    }

    public static void stopServer() {
        server.close();
        server.stop();
    }

    private static void buildResponse(int connectionId, int numChannels) {
        Timer timer = new Timer();
        timer.schedule(new SendRespone(connectionId, numChannels), 0, serverData.getResponseSeconds());
    }

    static class SendRespone extends TimerTask {
        private int connectionId;
        private int numChannels;

        public SendRespone(int connectionId, int numChannels) {
            this.connectionId = connectionId;
            this.numChannels = numChannels;
        }

        public void run() {
            Response response = new Response(serverData.generateChannelNumbers(numChannels),  serverData.getFrequency());
            server.sendToTCP(connectionId, response);
        }
    }
}
