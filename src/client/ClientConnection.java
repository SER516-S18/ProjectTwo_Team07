package client;

import com.esotericsoftware.kryonet.Client;
import com.esotericsoftware.kryonet.Connection;
import com.esotericsoftware.kryonet.Listener;
import network.Register;
import network.Request;
import network.Response;
import util.Constants;

import javax.swing.*;
import java.io.IOException;
import java.util.Arrays;

/**
 * ClientConnection
 *
 * Creates socket client connection and sends requests to the server
 * and handles responses.
 *
 * @author Team 7
 * @version 1.0
 */
public class ClientConnection {

	private Client client;
	private ClientData clientData;
	ClientPlotGraph graphPlot = new ClientPlotGraph();
	ClientDataPanel cdpanel;

	public ClientConnection() {
		clientData = new ClientData();
		client = new Client();
		cdpanel = new ClientDataPanel();
	}

	/**
	 * Sets a listener that waits for responses from the server
	 *
	 * @param channels 		the number of channels
	 */
	private void setListener(int channels) {
		client.addListener(new Listener() {
			public void received (Connection connection, Object object) {
				if (object instanceof Response) {
					Response response = (Response) object;
					System.out.println("A response from the server: " + Arrays.toString(response.getChannelNumbers()));
					//Called to plot the data sent by the server
					setGraph(channels) ;
					clientData.addChannelData(response.getChannelNumbers());
					System.out.println(
							"Max is: " + clientData.getMax()
							+ " Min is: " + clientData.getMin()
							+ " Average is: " + clientData.getAverage()
							+ " Frequency is: " + response.getFrequency());

					cdpanel.setAverage((int) clientData.getAverage());
					cdpanel.setFrequency(response.getFrequency());
					cdpanel.setMax(clientData.getMax());
					cdpanel.setMin(clientData.getMin());
				}
			}
		});
	}

	/**
	 * Starts an empty graph with the number of channels
	 *
	 * @param channels 		the number of channels
	 */
	public void initGraph(int channels) {
    	graphPlot.drawGraph(channels);
   	}

	/**
	 * Called when number of channels changes, resets the channel data
	 *
	 * @param channels 		the number of channels
	 */
	public void setGraph(int channels) {
    	graphPlot.plotGraph(channels, clientData.getChannelData());
    }


	/**
	 * Alerts the server the number of channels has changed
	 *
	 * @param channels 		the number of channels
	 */
	public boolean setNumChannels(int channels) {
	    boolean isServerActive = false;
		if(!client.isConnected()) {
			isServerActive = start(channels);
		}
		Request request = new Request(channels);
		client.sendTCP(request);
		return isServerActive;
	}

	/**
	 * Get the average from all the channel data
	 */
	public double getAverage() {
		return clientData.getAverage();
	}

	public JPanel getClientDataPanel() {
		return cdpanel.getClientDataPanel();
	}

	/**
	 * Starts the client connection
	 *
	 * @param channels 		the number of channels
	 */
	public boolean start(int channels) {
		if(!client.isConnected()) {
			client.start();

			try {
				client.connect(Constants.TIMEOUT, Constants.HOST, Constants.TCP_PORT);
			} catch (IOException e) {
				System.out.println("Cannot connect, Server is not up.");
				return false;
			}

			Register.register(client);
			// called to render the initial graph
			initGraph(channels);
			setListener(channels);
		}
		return true;
	}

	/**
	 * Ends the connection to the server
	 */
	public void stop() {
		client.close();
		client.stop();
	}
}
