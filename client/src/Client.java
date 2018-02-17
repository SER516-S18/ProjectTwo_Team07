/*
    Main Client Frame
 */

import javax.swing.*;

public class Client {

    private JFrame mainFrame;

    public Client(){
        prepareGUI();
    }

    public static void main(String[] args){
        Client client = new Client();
    }

    private void prepareGUI(){
        mainFrame = new JFrame("Client");
        mainFrame.setSize(700,500);
        mainFrame.setVisible(true);
    }
}