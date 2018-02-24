package client;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import javax.swing.*;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import util.Constants;

/**
 * This class contains methods to initiate User Interface
 *
 * @author Team 7
 */
public class ClientUI extends JPanel {

    private static JPanel plotPanel;
    private static JPanel consolePanel;
    public static JPanel clientUIPanel;
    private static JButton toggleBtn;
    private static Dimension lblPreferredSize = new Dimension(120, 42);
    private boolean clientActiveFlag;
    ClientConnection clientConnection;

    private static JPanel createTopPanel(JButton toggleBtn) {
        JPanel toggleBtnPanel = new JPanel(new BorderLayout());
        toggleBtnPanel.setPreferredSize(lblPreferredSize);
        toggleBtnPanel.add(toggleBtn, BorderLayout.CENTER);
        return toggleBtnPanel;
    }

    /**
     * Initializes UI components and starts client connection
     *
     */
    public ClientUI() {
        ClientConsole.setMessage("Initializing Client Modules...");

        clientActiveFlag = false;
        clientConnection = new ClientConnection();
        JFrame window = new JFrame();

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

        plotPanel = new JPanel(new BorderLayout());
        JButton placeHolderBtn = new JButton("Placeholder for Plot");
        plotPanel.setSize(250, 250);
        plotPanel.add(placeHolderBtn);
        plotPanel.setBackground(Constants.COLOR_PINK);

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
        clientUIPanel.add(clientConnection.getClientDataPanel(), gbc);

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

    /**
     * Starts the status button
     *
     */
    private void setStatusButtonClick(java.awt.event.ActionEvent evt) {
        if (!clientActiveFlag) {
            try {
                if(clientConnection.setNumChannels(4)){
                clientActiveFlag = true;
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
            ClientConsole.setMessage("Stopping client...");
            clientConnection.stop();
            toggleBtn.setText("Start");
        }
    }
}
