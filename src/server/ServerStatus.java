package server;

import java.io.IOException;
import java.net.DatagramSocket;
import java.net.ServerSocket;
import javax.swing.*;

public class ServerStatus extends JComponent {
    /**
     * This code displays a message on the server if the server is
     * running or not. It will be shown in the rectangle box on the
     * server next to the Highest, Lowest values.
     */
    public static JPanel pPanel;//= ServerUI.getPlotPanel();

    public static void startMessage() {
        if (isServerRunning(8080)) {
            JLabel nj = new JLabel();
            nj.setText("Not Running....");
            pPanel.add(nj);
            System.out.println("Running");
        }
    }

    public static void stopMessage() {
        if (!isServerRunning(8080)) {
            JLabel nj = new JLabel();
            nj.setText("Not Running....");
            pPanel.add(nj);
            System.out.println("Not Running");
        }
    }

    /**
     * The server sockets here checks if the ports
     * are in use or not.
     */

    public static boolean isServerRunning(int port) {
        // int port=8080;
        ServerSocket server_socket = null;
        DatagramSocket datagram_socket = null;
        try {
            server_socket = new ServerSocket(port);
            server_socket.setReuseAddress(true);
            datagram_socket = new DatagramSocket(port);
            datagram_socket.setReuseAddress(true);
            return false;
        } catch (IOException e) {
            return true;
        } finally {
            if (datagram_socket != null) {
                datagram_socket.close();
            }

            if (server_socket != null) {
                try {
                    server_socket.close();
                } catch (IOException e) {
                /* should not be thrown */
                    return true;
                }
            }
        }
    }
}
