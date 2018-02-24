package server;
import javax.swing.JTextField;
/**
 * ServerFrequency
 *
 * Reads frequency from the GUI and returns it.
 * @param frequency
 * @author Team 7
 * @version 1.0
 */

public class ServerFrequency {
	public static int frequency(JTextField frequencyValueText) {
		int frequency = 0;
        if(frequencyValueText.getText() != "")
        {
            try
            {
                frequency = Integer.parseInt(frequencyValueText.getText());
            }
            catch(Exception e)
            {
                e.printStackTrace();
            }
        }
        return frequency;
	}
}