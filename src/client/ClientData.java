package client;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ClientData {

    private int max;
    private int min;
    private Map<Integer, ArrayList<Integer>> channelData;

    public ClientData() {
        this.max = 0;
        this.min = Integer.MAX_VALUE;
        this.channelData = new HashMap<>();
    }

    public void addChannelData(int[] randomChannelNumbers) {
        // if the number of channels was changed the clients channel data will restart
        if(randomChannelNumbers.length != channelData.size()) {
            channelData.clear();
            max = 0;
            min = Integer.MAX_VALUE;
        }

        for(int i = 0; i < randomChannelNumbers.length; i++) {
            verifyMaxMin(randomChannelNumbers[i]);
            ArrayList<Integer> channel = channelData.getOrDefault(i, new ArrayList<>());
            channel.add(randomChannelNumbers[i]);
            channelData.put(i, channel);
        }
    }

    private void verifyMaxMin(int sample) {
        if(sample > max) {
            max = sample;
        } else if(sample < min) {
            min = sample;
        }
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }
}
