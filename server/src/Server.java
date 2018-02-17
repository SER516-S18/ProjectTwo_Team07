/*
    Main Server Frame
 */

import javax.swing.*;

public class Server {

    private JFrame mainFrame;

    public Server(){
        prepareGUI();
    }

    public static void main(String[] args){
        Server server = new Server();
    }

    private void prepareGUI(){
        mainFrame = new JFrame("Server");
        mainFrame.setSize(700,500);
        mainFrame.setVisible(true);
    }
}