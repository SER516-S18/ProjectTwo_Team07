import java.io.IOException;
import java.net.DatagramSocket;
import java.net.ServerSocket;
import javax.swing.*;

public class ServerStatus extends JComponent{
    
   
    public ServerStatus(){}

    public static void startBlinking(){
        // TODO add your handling code here:
        if(isServerRunning(8080)){             
            System.out.println("Running");
        }
    }
     private void initComponents() {

       
     }
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
    public static void stopBlinking(){
        // TODO add your handling code here:
    if(!isServerRunning(8080)){
        System.out.println("Not Running");
    }
    }
}
