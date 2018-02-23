package server;
import javax.swing.JTextField;

public class ServerFrequency {
	public static int frequency(JTextField frequencyTxt) {
		int frequency = 0;
        if(frequencyTxt.getText() != "")
        {
            try
            {
                frequency = Integer.parseInt(frequencyTxt.getText());
            }
            catch(Exception e)
            {
                System.out.println("Default value is returned.");
            }
        }
        return frequency;
	}
}