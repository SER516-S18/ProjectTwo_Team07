package client;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Component;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.*;
import javax.swing.BorderFactory;
import javax.swing.Box.Filler;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextPane;
import javax.swing.UIManager;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;

import util.Constants;

/**
 * This class contains methods to initiate User Interface
 *
 *
 * @author Team 7
 */
public class ClientUI extends JPanel {

    private static JPanel plotPanel;
    public static JPanel clientDataPanel;
    private static JPanel consolePanel;
    private static JPanel clientTopPanel;
    public static JPanel clientUIPanel;
    private static JButton toggleBtn;
    private static Dimension lblPreferredSize = new Dimension(120, 42);
    private boolean clientActiveFlag;
    ClientConnection clientConnection;
    JFrame window;


    private static JPanel createTopPanel(JButton toggleBtn) {
        JPanel toggleBtnPanel = new JPanel(new BorderLayout());
        toggleBtnPanel.setPreferredSize(lblPreferredSize);
        toggleBtnPanel.add(toggleBtn, BorderLayout.CENTER);
        return toggleBtnPanel;
    }

    public ClientUI() {
        ClientConsole.setMessage("Initializing Client Modules...");

        clientActiveFlag = false;
        clientConnection = new ClientConnection();
        JFrame window = new JFrame();

        ClientDataPanel cdpanel = new ClientDataPanel();
        clientDataPanel = cdpanel.clientDataPanel;
        toggleBtn = new JButton("Start");
        toggleBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                setStatusButtonClick(evt);
            }
        });

        GridBagLayout grid = new GridBagLayout();
        GridBagConstraints gbc = new GridBagConstraints();
        clientUIPanel = new JPanel(grid);
        clientUIPanel.setSize(new Dimension(600, 800));

        // Replace with Plot Panel code
        plotPanel = new JPanel(new BorderLayout());
        JButton placeHolderBtn = new JButton("Placeholder for Plot");
        plotPanel.setSize(250, 250);
        plotPanel.add(placeHolderBtn);
        plotPanel.setBackground(Constants.COLOR_PINK);

        // Replace with Console Panel code
        consolePanel = ClientConsole.getConsolePanel();

        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridx = 1;
        gbc.gridy = 0;
        clientUIPanel.add(createTopPanel(toggleBtn), gbc);

        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridx = 0;
        gbc.gridy = 1;
        clientUIPanel.add(plotPanel, gbc);

        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridx = 1;
        gbc.gridy = 1;
        clientUIPanel.add(clientDataPanel, gbc);

        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.gridwidth = 2;
        clientUIPanel.add(consolePanel, gbc);

        ClientConsole.setMessage("Client Modules Initialized");
        window.add(clientUIPanel);
        window.pack();
        window.setVisible(true);
        window.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    private void setStatusButtonClick(java.awt.event.ActionEvent evt) {
        if (!clientActiveFlag) {
            try {
                if(clientConnection.setNumChannels(4)){
                clientActiveFlag = true;
                //ClientGraphPlotter.startGraphPlotting();
                ClientConsole.setMessage("Starting client...");
                toggleBtn.setText("Stop");
                }
                else{
                    ClientConsole.setErrorMessage("Server not connected. Cannot start client..");
                }
            } catch (Exception e) {
                ClientConsole.setErrorMessage(e.getMessage());
            }
        } else {
            clientActiveFlag = false;
            //ClientGraphPlotter.stopGraphPlotting();
            ClientConsole.setMessage("Stopping client...");
            clientConnection.stop();
            toggleBtn.setText("Start");
        }
    }
        // public static void main(String[] args) {
        //         JFrame window = new JFrame();
        //         ClientUI clientui = new ClientUI();
        //         window.add(clientui.clientUIPanel);
        //         window.pack();
        //         window.setVisible(true);
        //         window.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        // }


}
