package ru.netology.radio;

import java.util.stream.IntStream;

public class Radio {

    private int currentNumberOfStation;
    private int defaultQuantityOfStation;
    private int maxNumberOfStation;
    private int minNumberOfStation;

    public Radio () {
        this.defaultQuantityOfStation = 10;
        this.maxNumberOfStation = defaultQuantityOfStation - 1;
        this.minNumberOfStation = defaultQuantityOfStation - defaultQuantityOfStation;
    }

    public Radio (int defaultQuantityOfStation) {
        this.defaultQuantityOfStation = defaultQuantityOfStation;
        this.minNumberOfStation = defaultQuantityOfStation - defaultQuantityOfStation;
        this.maxNumberOfStation = defaultQuantityOfStation - 1;
    }

    private int currentVolume;
    private int[] volume = IntStream.rangeClosed(0, 100).toArray();
    private int maxVolume = volume[100];
    private int minVolume = volume[0];


    public int getNumberOfStation() {

        return currentNumberOfStation;
    }

    public void setNumberOfStation(int newNumberOfStation) {
        if (newNumberOfStation < minNumberOfStation) {
            return;
        }
        if (newNumberOfStation > maxNumberOfStation) {
            return;
        }
        currentNumberOfStation = newNumberOfStation;
    }

    public void next() {
        if (currentNumberOfStation < maxNumberOfStation) {
            currentNumberOfStation++;
        } else {
            currentNumberOfStation = minNumberOfStation;
        }
    }

    public void prev() {
        if (currentNumberOfStation > minNumberOfStation) {
            currentNumberOfStation--;
        } else {
            currentNumberOfStation = maxNumberOfStation;
        }
    }

    public int getVolume() {
        return currentVolume;
    }

    public void setVolume(int newVolume) {
        if (newVolume < minVolume) {
            return;
        }
        if (newVolume > maxVolume) {
            return;
        }
        currentVolume = newVolume;
    }

    public void increaseVolume() {
        int highVolume = currentVolume + 1;
        setVolume(highVolume);
    }

    public void decreaseVolume() {
        int lowVolume = currentVolume - 1;
        if (lowVolume < minVolume) {
            lowVolume = minVolume;
        }
        setVolume(lowVolume);
    }
}