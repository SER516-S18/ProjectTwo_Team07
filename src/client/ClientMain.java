package client;

import com.esotericsoftware.kryonet.Client;
import com.esotericsoftware.kryonet.Connection;
import com.esotericsoftware.kryonet.Listener;
import network.Register;
import network.Request;
import network.Response;
import util.Constants;

import java.io.IOException;
import java.util.Arrays;

/**
 * Client
 *
 * Client entry point.
 * Starts GUI and connection to server
 *
 * @author Team 7
 * @version 1.0
 */
public class ClientMain {

    private static Client client;
    private static ClientData clientData;

    public static void main(String[] args) throws IOException {
        clientData = new ClientData();
        startClient();
    }

    // client will disconnect unless thread keeps running
    // when the UI code is implemented, the client listener will keep its connection
    // to test, uncomment for(;;); to keep the thread alive
    public static boolean startClient() throws IOException {
        client = new Client();
        client.start();

        try {
            client.connect(Constants.TIMEOUT, Constants.HOST, Constants.TCP_PORT);
        }catch(Exception e){
            System.out.println(e.getStackTrace());
            return false;
        }

        Register.register(client);

        Request request = new Request(4);
        client.sendTCP(request);

        // listens for messages from the server
        client.addListener(new Listener() {
            public void received (Connection connection, Object object) {
                if (object instanceof Response) {
                    Response response = (Response) object;

                    System.out.println("A response from the server: " + Arrays.toString(response.getChannelNumbers()));

                    clientData.addChannelData(response.getChannelNumbers());

                    System.out.println(
                            "Max is: " + clientData.getMax()
                            + " Min is: " + clientData.getMin()
                            + " Frequency is: " + response.getFrequency());
                }
            }
        });

        for(;;);
    }

    // called when the number of channels changes
    public static void setChannels(int channels) {
        Request request = new Request(channels);
        client.sendTCP(request);
    }

    public static void stopClient(){
        client.close();
        client.stop();
    }
}