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
    private boolean frequencyChange;
    private int frequency;

    public Response(int[] channelNumbers, boolean frequencyChange, int frequency) {
        this.channelNumbers = channelNumbers;
        this.frequencyChange = frequencyChange;
        this.frequency = frequency;
    }

    public int[] getChannelNumbers() {
        return channelNumbers;
    }

    public boolean isFrequencyChange() {
        return frequencyChange;
    }

    public int getFrequency() {
        return frequency;
    }

    public void setChannelNumbers(int[] channelNumbers) {
        this.channelNumbers = channelNumbers;
    }

    public void setFrequencyChange(boolean frequencyChange) {
        this.frequencyChange = frequencyChange;
    }

    public void setFrequency(int frequency) {
        this.frequency = frequency;
    }
}
