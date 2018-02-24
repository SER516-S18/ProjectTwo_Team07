package client;

import javax.swing.*;
import java.io.IOException;

/**
 * Client
 * <p>
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
        JFrame window = new JFrame();
        ClientUI clientui = new ClientUI();
        window.add(clientui.clientUIPanel);
        window.pack();
        window.setVisible(true);
        window.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        for (; ; ) ;
    }
}