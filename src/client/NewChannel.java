package client;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class NewChannel extends JFrame {
    public String temp1;
    private String[] description = {"1", "2", "3", "4", "5", "6", "7", "8"};
    private JComboBox c = new JComboBox();
    private int count = 0;

    NewChannel() {
        for (int i = 0; i < 8; i++)
            c.addItem(description[count++]);
        this.setLayout(new GridBagLayout());
        GridBagConstraints constraints = new GridBagConstraints();
        this.setPreferredSize(new Dimension(100, 100));
        constraints.gridx = 0;
        constraints.gridy = 0;
        this.add(c, constraints);
        this.setVisible(true);
        c.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                temp1 = ((JComboBox) e.getSource()).getSelectedItem().toString();
                getValueFromChannel(temp1);
            }
        });
    }

    public String getValueFromChannel(String valuefromchannel) {
        System.out.print(valuefromchannel);
        return valuefromchannel;
    }

    public static void main(String[] args) {
        NewChannel nc = new NewChannel();
    }
}