package client;

import java.io.IOException;

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

    public static void main(String[] args) throws IOException {
        ClientConnection clientConnection = new ClientConnection();
        clientConnection.setNumChannels(4);
        for(;;);
    }
}