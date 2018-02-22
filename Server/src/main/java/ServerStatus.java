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
    ServerSocket ss = null;
    DatagramSocket ds = null;
    try {
        ss = new ServerSocket(port);
        ss.setReuseAddress(true);
        ds = new DatagramSocket(port);
        ds.setReuseAddress(true);
        return false;
    } catch (IOException e) {
        return true;
    } finally {
        if (ds != null) {
            ds.close();
        }

        if (ss != null) {
            try {
                ss.close();
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
