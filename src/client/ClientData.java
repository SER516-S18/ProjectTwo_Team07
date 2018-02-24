package client;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Client Data
 * <p>
 * Holds all of the clients data
 *
 * @author Team 7
 * @version 1.0
 */
public class ClientData {

    private int max;
    private int min;
    private float average;
    private Map<Integer, List<Integer>> channelData;

    public ClientData() {
        this.max = 0;
        this.average = 0;
        this.min = Integer.MAX_VALUE;
        this.channelData = new HashMap<>();
    }

    public void addChannelData(int[] randomChannelNumbers) {
        // if the number of channels was changed the clients channel data will restart
        if (randomChannelNumbers.length != channelData.size()) {
            channelData.clear();
            max = 0;
            min = Integer.MAX_VALUE;
        }

        for (int i = 0; i < randomChannelNumbers.length; i++) {
            verifyMaxMin(randomChannelNumbers[i]);
            List<Integer> channel = channelData.getOrDefault(i, new ArrayList<>());
            int sum = 0;
            for (int j = 0; j < randomChannelNumbers.length; j++)
                sum = sum + randomChannelNumbers[i];

            average = sum / randomChannelNumbers.length;
            channel.add(randomChannelNumbers[i]);

            channelData.put(i, channel);
        }
    }

    public Map<Integer, List<Integer>> getChannelData() {
        return channelData;
    }

    private void verifyMaxMin(int sample) {
        if (sample > max) {
            max = sample;
        } else if (sample < min) {
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

    public float getAverage() {
        return average;
    }

    public void setAverage(float average) {
        this.average = average;
    }
}
