package server;

import java.awt.Color;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTextPane;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyledDocument;

public class ServerConsole {

	private final static Logger LOGGER = Logger.getLogger(ServerConsole.class.getName());
	private JTextPane console = new ServerUI().getConsolePane();
	
	public ServerConsole() {
	
	}
	
	public void setErrorMessage(String errorMessage) {

		StyledDocument doc = (StyledDocument) console.getDocument();
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

	public void setMessage(String message) {
		try {
			StyledDocument doc = (StyledDocument) console.getDocument();
			SimpleAttributeSet keyWord = new SimpleAttributeSet();
			StyleConstants.setForeground(keyWord, Color.BLACK);
			StyleConstants.setFontFamily(keyWord, "Times New Roman");
			StyleConstants.setBackground(keyWord, Color.LIGHT_GRAY);
			doc.insertString(0,new Date()+"- Message - "+message+"\n",keyWord );
		} catch (Exception ex) {
			LOGGER.log(Level.SEVERE,"Exception while adding Message", ex);
		}
	}
}

