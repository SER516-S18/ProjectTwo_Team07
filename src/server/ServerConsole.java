package server;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTextPane;
import javax.swing.border.LineBorder;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyledDocument;

public class ServerConsole {

	private final static Logger LOGGER = Logger.getLogger(ServerConsole.class.getName());
	private static JTextPane consoletextPane = null;
    private final static String CONTENT_TYPE = "text/html";
	
	public ServerConsole() {
	
	}
	
	public static void setErrorMessage(String errorMessage) {

		consoletextPane.setContentType(CONTENT_TYPE);
		StyledDocument doc = (StyledDocument) consoletextPane.getDocument();
		SimpleAttributeSet keyWord = new SimpleAttributeSet();
		StyleConstants.setForeground(keyWord, Color.RED);
		StyleConstants.setFontFamily(keyWord, "Times New Roman");
		StyleConstants.setBackground(keyWord, Color.LIGHT_GRAY);
		try
		{
			doc.insertString(0,new Date()+" - Error - "+errorMessage +"\n",keyWord );
		}
		catch(Exception ex) 
		{ 
			LOGGER.log(Level.SEVERE,"Exception while adding Error Message.", ex); 
		}

	}

	public static void setMessage(String message) {
		try {
			consoletextPane.setContentType(CONTENT_TYPE);
			StyledDocument doc = (StyledDocument) consoletextPane.getDocument();
			SimpleAttributeSet keyWord = new SimpleAttributeSet();
			StyleConstants.setForeground(keyWord, Color.BLACK);
			StyleConstants.setFontFamily(keyWord, "Times New Roman");
			StyleConstants.setBackground(keyWord, Color.LIGHT_GRAY);
			doc.insertString(0,new Date()+"- Message - "+message+"\n",keyWord );
		} catch (Exception ex) {
			LOGGER.log(Level.SEVERE,"Exception while adding Message", ex);
		}
	}
	
	private static void constructConsolePanel()
	{
		consoletextPane = new JTextPane();
		consoletextPane.setBorder(new LineBorder(Color.BLUE));
		consoletextPane.setFont(new Font("Tahoma", Font.PLAIN, 18));
		consoletextPane.setEditable(false);
		consoletextPane.setContentType("text/html");
		consoletextPane.setForeground(Color.BLACK);
		consoletextPane.setBackground(Color.LIGHT_GRAY);
		consoletextPane.setBounds(28, 459, 834, 157);
		
	}
	
	public static Container getConsolePane()
	{
		if(consoletextPane == null)
		{	
			constructConsolePanel();
		}
		return consoletextPane;
	}
	
}


