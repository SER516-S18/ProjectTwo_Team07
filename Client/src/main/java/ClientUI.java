import java.awt.Color;
import java.awt.Dimension;

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

//package clientui;

/**
 *
 * @author akuma174
 */
public class ClientUI extends javax.swing.JFrame {

    /**
     * Creates new form ServerUI
     */
    public ClientUI() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form
     */
    private void initComponents() {

        Frame = new JFrame();
        OuterPanel = new JPanel();
        setStatusButton = new JButton();
        clientStatusPanel = new JPanel();
        graphPlottingPanel = new JPanel();
        Filler = new Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0),
                new java.awt.Dimension(32767, 32767));
        highestValuePanel = new JPanel();
        highestValueLabel = new JLabel();
        lowestValuePanel = new JPanel();
        lowestValueLabel = new JLabel();
        frequencyPanel = new JPanel();
        frequencyLabel = new JLabel();
        showHighestValuePanel = new JPanel();
        showHighestValueLabel = new JLabel();
        showLowestValuePanel = new JPanel();
        showLowestValueLabel = new JLabel();
        frequencyValuePanel = new JPanel();
        frequencyValueLabel = new JLabel();
        averagePanel = new JPanel();
        averageLabel = new JLabel();
        averageValuePanel = new JPanel();
        averageValueLabel = new JLabel();
        consolePanel = new JPanel();
        consoleLabel = new JLabel();
        jPanel2 = new JPanel();
        jLabel4 = new JLabel();
        consoleText = new JTextPane();
        consoleScroller = new JScrollPane(consoleText);


        /*
         * Design frame with required dimensions and specification
         */
        GroupLayout jFrame1Layout = new GroupLayout(Frame.getContentPane());
        Frame.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
                jFrame1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
                jFrame1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(Frame.EXIT_ON_CLOSE);
        setTitle("CLIENT");
        setAlwaysOnTop(true);
        setBackground(new java.awt.Color(204, 245, 255));
        setForeground(new java.awt.Color(210, 246, 255));
        setPreferredSize(new java.awt.Dimension(800, 750));
        setResizable(false);

        /*
         * Method to color and size OuterPanel(largest panel covering all the frames) and add button on the Frame
         *
         */

        OuterPanel.setBackground(new Color(153, 204, 255));
        OuterPanel.setBorder(BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        OuterPanel.setForeground(new Color(204, 204, 255));
        OuterPanel.setPreferredSize(new Dimension(750, 550));

        setStatusButton.setBackground(new Color(255, 204, 204));
        setStatusButton.setFont(new java.awt.Font("Courier New", 0, 18));
        setStatusButton.setText("Start/Stop");
        setStatusButton.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1,
                new java.awt.Color(153, 153, 255)));
        setStatusButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        /*
         * Formatting panel containing the client status results and highest,lowest and average value labels along with
         * channel setting dropdown and the label showing frequency
         *
         */
        clientStatusPanel.setBackground(new Color(204, 204, 204));
        clientStatusPanel.setBorder(BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        /*
         * Panel for plotting graph for the values received by the client
         */
        graphPlottingPanel.setBackground(new Color(255, 204, 204));
        graphPlottingPanel.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1,
                new java.awt.Color(153, 153, 255)));

        GroupLayout jPanel5Layout = new GroupLayout(graphPlottingPanel);
        graphPlottingPanel.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
                jPanel5Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                                .addContainerGap(252, Short.MAX_VALUE)
                                .addComponent(Filler,GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
                                        GroupLayout.PREFERRED_SIZE)
                                .addGap(165, 165, 165))
        );
        jPanel5Layout.setVerticalGroup(
                jPanel5Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Filler, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
                                        GroupLayout.PREFERRED_SIZE)
                                .addGap(161, 161, 161))
        );


        /*
         * Panel for holding Highest value label
         */
        highestValuePanel.setBackground(new java.awt.Color(204, 255, 255));
        highestValuePanel.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1,
                new java.awt.Color(153, 153, 255)));

        highestValueLabel.setFont(new java.awt.Font("Courier New", 0, 18));
        highestValueLabel.setText("Highest value");

        GroupLayout jPanel6Layout = new GroupLayout(highestValuePanel);
        highestValuePanel.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
                jPanel6Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(highestValueLabel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE,
                                        Short.MAX_VALUE)
                                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
                jPanel6Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(highestValueLabel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE,
                                        Short.MAX_VALUE)
                                .addGap(8, 8, 8))
        );


        /*
         * Panel for holding Lowest value label
         *
         */
        lowestValuePanel.setBackground(new Color(255, 204, 204));
        lowestValuePanel.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1,
                new Color(153, 153, 255)));

        lowestValueLabel.setFont(new java.awt.Font("Courier New", 0, 18));
        lowestValueLabel.setText("Lowest Value");

        GroupLayout jPanel7Layout = new GroupLayout(lowestValuePanel);
        lowestValuePanel.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
                jPanel7Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel7Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(lowestValueLabel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE,
                                        Short.MAX_VALUE)
                                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
                jPanel7Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(lowestValueLabel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE,
                                        Short.MAX_VALUE)
                                .addContainerGap())
        );

        /*
         * Panel for holding Average label
         *
         */
        averagePanel.setBackground(new Color(255, 204, 204));
        averagePanel.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1,
                new Color(153, 153, 255)));

        averageLabel.setFont(new java.awt.Font("Courier New", 0, 18));
        averageLabel.setText("Average");

        GroupLayout jPanel12Layout = new GroupLayout(averagePanel);
        averagePanel.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
                jPanel12Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel12Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(averageLabel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE,
                                        Short.MAX_VALUE)
                                .addContainerGap())
        );
        jPanel12Layout.setVerticalGroup(
                jPanel12Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(averageLabel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE,
                                        Short.MAX_VALUE)
                                .addContainerGap())
        );


        /*
         * Panel for holding Frequency label
         *
         */

        frequencyPanel.setBackground(new java.awt.Color(204, 255, 255));
        frequencyPanel.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1,
                new java.awt.Color(153, 153, 255)));

        frequencyLabel.setFont(new java.awt.Font("Courier New", 0, 18));
        frequencyLabel.setText("Frequency(Hz)");

        GroupLayout jPanel8Layout = new GroupLayout(frequencyPanel);
        frequencyPanel.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
                jPanel8Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel8Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(frequencyLabel)
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
                jPanel8Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(frequencyLabel, GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                                .addContainerGap())
        );


        /*
         * Panel for holding Highest value label value
         */
        showHighestValuePanel.setBackground(new java.awt.Color(255, 204, 204));
        showHighestValuePanel.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1,
                new java.awt.Color(153, 153, 255)));

        showHighestValueLabel.setFont(new java.awt.Font("Courier New", 0, 18)); // NOI18N

        GroupLayout jPanel9Layout = new GroupLayout(showHighestValuePanel);
        showHighestValuePanel.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
                jPanel9Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel9Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(showHighestValueLabel)
                                .addContainerGap(50, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
                jPanel9Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(showHighestValueLabel, GroupLayout.DEFAULT_SIZE, 27,
                                        Short.MAX_VALUE)
                                .addContainerGap())
        );


        /*
         * Panel for holding Lowest value label value
         *
         */

        showLowestValuePanel.setBackground(new java.awt.Color(204, 255, 255));
        showLowestValuePanel.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1,
                new java.awt.Color(153, 153, 255)));

        showLowestValueLabel.setFont(new java.awt.Font("Courier New", 0, 18)); // NOI18N

        GroupLayout jPanel10Layout = new GroupLayout(showLowestValuePanel);
        showLowestValuePanel.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
                jPanel10Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel10Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(showLowestValueLabel, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
                jPanel10Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel10Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(showLowestValueLabel, GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
                                .addContainerGap())
        );


        /*
         * Panel for holding Frequency label value
         *
         */
        frequencyValuePanel.setBackground(new java.awt.Color(204, 255, 255));
        frequencyValuePanel.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1,
                new java.awt.Color(153, 153, 255)));

        frequencyValueLabel.setFont(new java.awt.Font("Courier New", 0, 18)); // NOI18N

        GroupLayout jPanel11Layout = new GroupLayout(frequencyValuePanel);
        frequencyValuePanel.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
                jPanel11Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel11Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(frequencyValueLabel, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel11Layout.setVerticalGroup(
                jPanel11Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel11Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(frequencyValueLabel, GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
                                .addContainerGap())
        );


        /*
         * Panel for holding Average label value
         *
         */
        averageValuePanel.setBackground(new java.awt.Color(204, 255, 255));
        averageValuePanel.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1,
                new java.awt.Color(153, 153, 255)));

        averageValueLabel.setFont(new java.awt.Font("Courier New", 0, 18)); // NOI18N

        GroupLayout jPanel13Layout = new GroupLayout(averageValuePanel);
        averageValuePanel.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
                jPanel13Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel13Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(averageValueLabel, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel13Layout.setVerticalGroup(
                jPanel13Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel13Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(averageValueLabel, GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
                                .addContainerGap())
        );

        GroupLayout jPanel3Layout = new GroupLayout(clientStatusPanel);
        clientStatusPanel.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
                jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(graphPlottingPanel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addGap(38, 38, 38)
                                .addGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                        .addComponent(highestValuePanel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(lowestValuePanel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(averagePanel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(frequencyPanel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                        .addComponent(showLowestValuePanel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(frequencyValuePanel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(averageValuePanel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(showHighestValuePanel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
                jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addComponent(graphPlottingPanel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                                .addGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(highestValuePanel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(showHighestValuePanel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(showLowestValuePanel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(lowestValuePanel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(averageValuePanel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(averagePanel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                                                .addGap(1, 1, 1)
                                                                .addComponent(frequencyValuePanel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                        .addComponent(frequencyPanel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                                .addGap(0, 342, Short.MAX_VALUE)))
                                .addContainerGap())
        );

        /*
         * Panel for holding Console label
         * Panel  displays success and error message
         */
        consolePanel.setBackground(new java.awt.Color(204, 204, 204));
        consolePanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));

        consoleLabel.setFont(new java.awt.Font("Courier New", 0, 18)); // NOI18N
        consoleLabel.setText("Console:");
        
        consoleText.setEditable(false);
        consoleText.setContentType("text/html");
        Color backgroundColor = new Color(204, 204, 204);
        SimpleAttributeSet background = new SimpleAttributeSet();
        StyleConstants.setBackground(background, backgroundColor);
        consoleText.getStyledDocument().setParagraphAttributes(0, 
        	consoleText.getDocument().getLength(), background, false);
        consoleText.setBorder(BorderFactory.createEmptyBorder());
     
        consoleScroller.setBorder(BorderFactory.createEmptyBorder());
        consoleScroller.setPreferredSize(new Dimension(40, 80));
        
        GroupLayout consolePanelLayout = new GroupLayout(consolePanel);
        consolePanel.setLayout(consolePanelLayout);
        consolePanelLayout.setHorizontalGroup(
                consolePanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(consolePanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(consoleLabel)
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(consolePanelLayout.createSequentialGroup()
                        		.addContainerGap()
                        		.addComponent(consoleScroller))
        );
        consolePanelLayout.setVerticalGroup(
                consolePanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(consolePanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(consoleLabel)
                                .addComponent(consoleScroller)
                                .addContainerGap(88, Short.MAX_VALUE))
        );
        
        GroupLayout jPanel1Layout = new GroupLayout(OuterPanel);
        OuterPanel.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(consolePanel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                                .addGap(644, 644, 644)
                                                .addComponent(setStatusButton, GroupLayout.PREFERRED_SIZE, 137, GroupLayout.PREFERRED_SIZE))
                                        .addComponent(clientStatusPanel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(setStatusButton, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(clientStatusPanel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(consolePanel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
        );

        GroupLayout jPanel2Layout = new GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
                jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
                jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGap(0, 100, Short.MAX_VALUE)
        );



        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(OuterPanel, GroupLayout.DEFAULT_SIZE, 825, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(jPanel2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE)))
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(jLabel4)
                                        .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(OuterPanel, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 806, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(jPanel2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE)))
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(jLabel4)
                                        .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
        
    }
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }



    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ClientUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ClientUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ClientUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ClientUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ClientUI().setVisible(true);
            }
        });
    }
    
    public static JTextPane getConsoleTextArea() {
    		return consoleText;
    }

    // Variables declaration
    private Filler Filler;
    private JButton setStatusButton;
    private JFrame Frame;
    private JLabel highestValueLabel;
    private JLabel lowestValueLabel;
    private JLabel frequencyLabel;
    private JLabel jLabel4;
    private JLabel showHighestValueLabel;
    private JLabel consoleLabel;
    private JLabel showLowestValueLabel;
    private JLabel frequencyValueLabel;
    private JLabel averageLabel;
    private JLabel averageValueLabel;
    private JPanel OuterPanel;
    private JPanel showLowestValuePanel;
    private JPanel jPanel2;
    private JPanel clientStatusPanel;
    private JPanel consolePanel;
    private JPanel graphPlottingPanel;
    private JPanel highestValuePanel;
    private JPanel lowestValuePanel;
    private JPanel frequencyPanel;
    private JPanel showHighestValuePanel;
    private JPanel frequencyValuePanel;
    private JPanel averagePanel;
    private JPanel averageValuePanel;
    private static JTextPane consoleText;
    private JScrollPane consoleScroller;
    // End of variables declaration
}

