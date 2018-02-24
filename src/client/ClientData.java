package client;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Client Data
 *
 * Holds all of the clients data
 *
 * @author Team 7
 * @version 1.0
 */
public class ClientData {

    private int max;
    private int min;
    private double average;
    private Map<Integer, List<Integer>> channelData;

    public ClientData() {
        this.max = 0;
        this.average = 0;
        this.min = Integer.MAX_VALUE;
        this.channelData = new HashMap<>();
    }

    /**
     * Appends to the channel map, new random channel numbers from the server
     *
     * @param randomChannelNumbers - collection of random numbers from the server
     */
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
            double sum = 0;
            for (int j = 0; j < randomChannelNumbers.length; j++)
                sum = sum + randomChannelNumbers[i];

            channel.add(randomChannelNumbers[i]);

            channelData.put(i, channel);
        }
        updateAverage();
    }

    /**
     * Updates the current average of all the channel numbers
     */
    public void updateAverage() {
        int sum = 0;
        int numElements = 0;
        for (Integer channel : channelData.keySet()) {
            List<Integer> channelNumbers = channelData.get(channel);
            for (Integer channelNumber : channelNumbers) {
                sum += channelNumber;
                numElements++;
            }
        }
        if(numElements != 0) {
            average = sum / numElements;
        }
    }

    /**
     * @return The collection of channels and their numbers
     */
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

    public double getAverage() {
        return average;
    }

    public void setAverage(double average) {
        this.average = average;
    }
}
