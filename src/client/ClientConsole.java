package client;

import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.JTextPane;
import javax.swing.text.html.HTMLDocument;

/**
 * A class to handle displaying message and error message in the client console
 *
 * @author raamprashanthns
 * @version 1
 */
public class ClientConsole {

    static JTextPane console = ClientUI.getConsoleTextArea();
    private final static Logger LOGGER = Logger.getLogger(ClientConsole.class.getName());
    private final static String CONTENT_TYPE = "text/html";

    /**
     * Used to display error messages in the client console
     *
     * @param errorMessage - error message that has to be displayed in the client console
     */
    public static void setErrorMessage(String errorMessage) {
        try {
            console.setContentType(CONTENT_TYPE);
            HTMLDocument doc=(HTMLDocument) console.getStyledDocument();
            doc.insertAfterEnd(doc.getCharacterElement(doc.getLength()),"<span style=\"color:red\">[" + new Date() + "] " + errorMessage + "</span> <br>");
        } catch (Exception ex) {
            LOGGER.log(Level.SEVERE, "Exception while adding Error Message to client console", ex);
        }
    }

    /**
     * Used to display messages in the client console
     *
     * @param message - message that has to be displayed in the client console
     */
    public static void setMessage(String message) {
        try {
            console.setContentType(CONTENT_TYPE);
            HTMLDocument doc=(HTMLDocument) console.getStyledDocument();
            doc.insertAfterEnd(doc.getCharacterElement(doc.getLength()),"<span style=\"color:black\">[" + new Date() + "] " + message + "</span> <br>");
        } catch (Exception ex) {
            LOGGER.log(Level.SEVERE, "Exception while adding Message to client console", ex);
        }
    }
}
