import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.*;
import javax.swing.WindowConstants;

/**
 * ClientDataPanel - returns panel containing client data values
 */
public class ClientDataPanel extends JPanel{
    private static JPanel clientDataPanel;
    private static JLabel highestValLbl;
    private static JTextField highestTxtField;
    private static JLabel lowestValLbl;
    private static JTextField lowestTxtField;
    private static JLabel averageValLbl;
    private static JTextField averageTxtfield;
    private static JLabel chanelValLbl;
    private static JSpinner spinner;
    private static JLabel frequencyValLbl;
    private static JTextField frequencyTxtField;
    private static SpinnerModel value = new SpinnerNumberModel(0, 0, 10, 1);  
    private static Dimension txtFieldPreferredSize = new Dimension(120, 50);
    private static Dimension lblPreferredSize = new Dimension(120, 42);

    /*
    Creates new JLabel object for client data labels
    @param: String lbl
    */
    private static JLabel createDataLabel(String lbl) {
        JLabel dataLbl = new JLabel(lbl);
        dataLbl.setHorizontalAlignment(JLabel.CENTER);
        dataLbl.setVerticalAlignment(JLabel.CENTER);
        return dataLbl;
    }

    /*
    Creates new Jpanel object to contain client data labels
    @param: JLabel dataLbl, Color clr
    */
    private static JPanel createDataLabelPanel(JLabel dataLbl, Color clr) {
        JPanel dataLblPanel = new JPanel(new BorderLayout());
        dataLblPanel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        dataLblPanel.setPreferredSize(lblPreferredSize);
        dataLblPanel.setBackground(clr);
        dataLblPanel.add(dataLbl, BorderLayout.CENTER);
        return dataLblPanel;
    }

    /*
    Creates new JPanel to contain text fields for client data output
    @param: JTextField txtField
    */
    private static JPanel createTxtFieldPanel(JTextField txtField) {
        JPanel txtFieldPanel = new JPanel(new BorderLayout());
        txtFieldPanel.add(txtField, BorderLayout.CENTER);
        return txtFieldPanel;
    }

    public ClientDataPanel() {
        GridBagLayout grid = new GridBagLayout();
        GridBagConstraints gbc = new GridBagConstraints();
        clientDataPanel = new JPanel(grid);
        clientDataPanel.setSize(new Dimension(250, 250));
        spinner = new JSpinner(value);
        spinner.setPreferredSize(txtFieldPreferredSize);

        lowestValLbl = createDataLabel("Highest Value: ");
        JPanel highestValLblPanel = createDataLabelPanel(lowestValLbl, Color.PINK);

        lowestTxtField = new JTextField();
        lowestTxtField.setPreferredSize(txtFieldPreferredSize);
        JPanel lowestTxtFieldPanel = createTxtFieldPanel(lowestTxtField);

        highestValLbl = createDataLabel("Lowest Value: ");
        JPanel lowestValLblPanel = createDataLabelPanel(highestValLbl, Color.PINK);

        highestTxtField = new JTextField();
        highestTxtField.setPreferredSize(txtFieldPreferredSize);
        JPanel highestTxtFieldPanel = createTxtFieldPanel(highestTxtField);

        averageValLbl = createDataLabel("Average: ");
        JPanel averageValLblPanel = createDataLabelPanel(averageValLbl, Color.PINK);

        averageTxtfield = new JTextField();
        averageTxtfield.setPreferredSize(txtFieldPreferredSize);
        JPanel averageTxtfieldPanel = createTxtFieldPanel(averageTxtfield);

        chanelValLbl = createDataLabel("Channel: ");
        JPanel chanelValLblPanel = createDataLabelPanel(chanelValLbl, Color.PINK);

        frequencyValLbl = createDataLabel("Frequency(Hz): ");
        JPanel frequencyValLblPanel = createDataLabelPanel(frequencyValLbl, Color.PINK);

        frequencyTxtField = new JTextField();
        frequencyTxtField.setPreferredSize(txtFieldPreferredSize);
        JPanel frequencyTxtFieldPanel = createTxtFieldPanel(frequencyTxtField);

        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridx = 0;
        gbc.gridy = 0;
        clientDataPanel.add(highestValLblPanel, gbc);

        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridx = 1;
        gbc.gridy = 0;
        clientDataPanel.add(highestTxtFieldPanel, gbc);

        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridx = 0;
        gbc.gridy = 1;
        clientDataPanel.add(lowestValLblPanel, gbc);

        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridx = 1;
        gbc.gridy = 1;
        clientDataPanel.add(lowestTxtFieldPanel, gbc);

        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridx = 0;
        gbc.gridy = 2;
        clientDataPanel.add(averageValLblPanel, gbc);

        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridx = 1;
        gbc.gridy = 2;
        clientDataPanel.add(averageTxtfieldPanel, gbc);

        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridx = 0;
        gbc.gridy = 3;
        clientDataPanel.add(chanelValLblPanel, gbc);

        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridx = 1;
        gbc.gridy = 3;
        clientDataPanel.add(spinner, gbc);

        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridx = 0;
        gbc.gridy = 4;
        clientDataPanel.add(frequencyValLblPanel, gbc);

        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridx = 1;
        gbc.gridy = 4;
        clientDataPanel.add(frequencyTxtFieldPanel, gbc);
    }

    // public static void main(String[] args) {
    //     JFrame window = new JFrame();
    //     ClientDataPanel cdpanel = new ClientDataPanel();
    //     window.add(cdpanel.clientDataPanel);
    //     window.setSize(new Dimension(700, 700));
    //     window.setVisible(true);
    //     window.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    // }
    
}