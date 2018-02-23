package network;

/**
 * Response
 *
 * Message class for a response from the server
 *
 * @author Team 7
 * @version 1.0
 */
public class Response {
    private int[] channelNumbers;

    public Response(int[] channelNumbers) {
        this.channelNumbers = channelNumbers;
    }

    public int[] getChannelNumbers() {
        return channelNumbers;
    }

    public void setChannelNumbers(int[] channelNumbers) {
        this.channelNumbers = channelNumbers;
    }
}
