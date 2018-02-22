import javax.swing.*;
/**
 *
 * @author Dileep Pandey
 */
public class ServerUI extends JFrame {

    // Variables declaration   
	private static Logger Log = Logger.getLogger(ServerUI.class.getName());
    private JLabel consoleLbl;
    private JPanel consolePanel;
    private JScrollPane consoleScrollPane;
    private JTextArea consoleTxt;
    private JPanel controlsPanel;
    private JLabel frequencyLbl;
    private JTextField frequencyTxt;
    private JLabel highestValLbl;
    private JTextField highestValTxt;
    private JLabel lowestValLbl;
    private JTextField lowestValTxt;
    private JPanel plotContainerPnl;
    private JLabel plotLbl;
    private JPanel plotPanel;
    private JButton startStopBtn;
    private boolean serverActiveFlag;

    /**
     * Creates new form ServerUI
     */
    public ServerUI() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        plotPanel = new JPanel();
        plotLbl = new JLabel();
        plotContainerPnl = new JPanel();
        consolePanel = new JPanel();
        consoleLbl = new JLabel();
        consoleScrollPane = new JScrollPane();
        consoleTxt = new JTextArea();
        controlsPanel = new JPanel();
        highestValLbl = new JLabel();
        highestValTxt = new JTextField();
        lowestValLbl = new JLabel();
        lowestValTxt = new JTextField();
        frequencyLbl = new JLabel();
        frequencyTxt = new JTextField();
        startStopBtn = new JButton();

        serverActiveFlag = false;

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        plotPanel.setBackground(new java.awt.Color(255, 204, 204));

        plotLbl.setText("Plot:");

        plotContainerPnl.setBackground(new java.awt.Color(255, 204, 204));

        GroupLayout plotContainerPnlLayout = new GroupLayout(plotContainerPnl);
        plotContainerPnl.setLayout(plotContainerPnlLayout);
        plotContainerPnlLayout.setHorizontalGroup(
            plotContainerPnlLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        plotContainerPnlLayout.setVerticalGroup(
            plotContainerPnlLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        GroupLayout plotPanelLayout = new GroupLayout(plotPanel);
        plotPanel.setLayout(plotPanelLayout);
        plotPanelLayout.setHorizontalGroup(
            plotPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(plotPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(plotPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(plotContainerPnl, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(plotPanelLayout.createSequentialGroup()
                        .addComponent(plotLbl)
                        .addGap(0, 293, Short.MAX_VALUE)))
                .addContainerGap())
        );
        plotPanelLayout.setVerticalGroup(
            plotPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(plotPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(plotLbl, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(plotContainerPnl, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        consolePanel.setBackground(new java.awt.Color(200, 200, 200));

        consoleLbl.setText("Console:");

        consoleTxt.setBackground(new java.awt.Color(200, 200, 200));
        consoleTxt.setColumns(20);
        consoleTxt.setRows(5);
        consoleTxt.setBorder(null);
        consoleScrollPane.setViewportView(consoleTxt);

        GroupLayout consolePanelLayout = new GroupLayout(consolePanel);
        consolePanel.setLayout(consolePanelLayout);
        consolePanelLayout.setHorizontalGroup(
            consolePanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(consolePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(consolePanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(consolePanelLayout.createSequentialGroup()
                        .addComponent(consoleLbl)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(consoleScrollPane))
                .addContainerGap())
        );
        consolePanelLayout.setVerticalGroup(
            consolePanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(consolePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(consoleLbl, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(consoleScrollPane, GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                .addContainerGap())
        );

        controlsPanel.setBackground(new java.awt.Color(200, 200, 200));

        highestValLbl.setBackground(new java.awt.Color(153, 153, 255));
        highestValLbl.setHorizontalAlignment(SwingConstants.CENTER);
        highestValLbl.setText("Highest Value");
        highestValLbl.setOpaque(true);

        highestValTxt.setBackground(new java.awt.Color(255, 204, 204));
        highestValTxt.setHorizontalAlignment(JTextField.CENTER);
        highestValTxt.setText("1024");

        lowestValLbl.setBackground(new java.awt.Color(255, 204, 204));
        lowestValLbl.setHorizontalAlignment(SwingConstants.CENTER);
        lowestValLbl.setText("Lowest Value");
        lowestValLbl.setOpaque(true);

        lowestValTxt.setBackground(new java.awt.Color(153, 153, 255));
        lowestValTxt.setHorizontalAlignment(JTextField.CENTER);
        lowestValTxt.setText("0");
        lowestValTxt.setPreferredSize(new java.awt.Dimension(76, 16));

        frequencyLbl.setBackground(new java.awt.Color(153, 153, 255));
        frequencyLbl.setHorizontalAlignment(SwingConstants.CENTER);
        frequencyLbl.setText("Frequency (Hz)");
        frequencyLbl.setOpaque(true);

        frequencyTxt.setBackground(new java.awt.Color(255, 204, 204));
        frequencyTxt.setHorizontalAlignment(JTextField.CENTER);
        frequencyTxt.setText("5");

        GroupLayout controlsPanelLayout = new GroupLayout(controlsPanel);
        controlsPanel.setLayout(controlsPanelLayout);
        controlsPanelLayout.setHorizontalGroup(
            controlsPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(controlsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(controlsPanelLayout.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
                    .addComponent(frequencyLbl, GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE)
                    .addComponent(lowestValLbl, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(highestValLbl, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(controlsPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(highestValTxt)
                    .addComponent(lowestValTxt, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE)
                    .addComponent(frequencyTxt))
                .addContainerGap())
        );
        controlsPanelLayout.setVerticalGroup(
            controlsPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(controlsPanelLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(controlsPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                    .addComponent(highestValLbl, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
                    .addComponent(highestValTxt, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(controlsPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(lowestValLbl, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
                    .addComponent(lowestValTxt, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addGroup(controlsPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(frequencyLbl, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
                    .addComponent(frequencyTxt, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31))
        );

        startStopBtn.setText("Start");
        startStopBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startStopBtnClick(evt);
            }
        });

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(consolePanel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(plotPanel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                            .addComponent(startStopBtn, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(controlsPanel, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(startStopBtn)
                .addGap(3, 3, 3)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                    .addComponent(plotPanel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(controlsPanel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(consolePanel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }

    private void startStopBtnClick(java.awt.event.ActionEvent evt){
        if(!serverActiveFlag){
            serverActiveFlag = true;
            try{
                ServerMain.startServer();
            }catch (Exception e){
                ServerConsole.setErrorMessage(e.getMessage());
            }
            ServerStatus.startBlinking();
            ServerConsole.setMessage("Starting server...");
            startStopBtn.setText("Stop");
        }
        else{
            serverActiveFlag = false;
            ServerStatus.stopBlinking();
            ServerConsole.setMessage("Stopping server...");
            ServerMain.stopServer();
            startStopBtn.setText("Start");
        }
    }// </editor-fold>

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) 
			{
                if ("Nimbus".equals(info.getName())) 
				{
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } 
		
		catch (UnsupportedLookAndFeelException e) 
        {
        	Log.log(Level.WARNING, null, e);
            
        } catch (ClassNotFoundException e) 
        {
			Log.log(Level.SEVERE, null, e);
		} catch (InstantiationException e) 
		{
			
			Log.log(Level.SEVERE, null, e);
		} catch (IllegalAccessException e) 
		{
			
			Log.log(Level.SEVERE, null, e);
		}

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ServerUI().setVisible(true);
            }
        });
    }

                      
}
