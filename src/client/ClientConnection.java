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
 * ClientConnection
 * <p>
 * Creates socket client connection and sends requests to the server
 * and handles responses.
 *
 * @author Team 7
 * @version 1.0
 */
public class ClientConnection {

    private Client client;
    private ClientData clientData;

    public ClientConnection() {
        clientData = new ClientData();
        client = new Client();
    }

    private void setListener() {
        // listens for messages from the server
        client.addListener(new Listener() {
            public void received(Connection connection, Object object) {
                if (object instanceof Response) {
                    Response response = (Response) object;

                    System.out.println("A response from the server: " + Arrays.toString(response.getChannelNumbers()));

                    clientData.addChannelData(response.getChannelNumbers());

                    System.out.println(
                            "Max is: " + clientData.getMax()
                                    + " Min is: " + clientData.getMin()
                                    + " Average is: " + clientData.getAverage()
                                    + " Frequency is: " + response.getFrequency());
                }
            }
        });
    }

    // called when the number of channels changes
    public void setNumChannels(int channels) {
        if (!client.isConnected()) {
            start();
        }
        Request request = new Request(channels);
        client.sendTCP(request);
    }

    public void start() {
        if (!client.isConnected()) {
            client.start();

            try {
                client.connect(Constants.TIMEOUT, Constants.HOST, Constants.TCP_PORT);
            } catch (IOException e) {
                e.printStackTrace();
            }

            Register.register(client);
            setListener();
        }
    }

    // ends client session
    public void stop() {
        client.close();
        client.stop();
    }
}
