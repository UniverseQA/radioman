package ru.netology.radio;

import java.util.stream.IntStream;

public class Radio {

    public int currentNumberOfStation;
    int[] defaultQuantityOfStation = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
    int maxNumberOfStation = defaultQuantityOfStation[9];
    int minNumberOfStation = defaultQuantityOfStation[0];

    public Radio () {
    }

    public Radio (int[] defaultQuantityOfStation) {
        int i = defaultQuantityOfStation.length - 1;
        this.defaultQuantityOfStation = defaultQuantityOfStation;
        defaultQuantityOfStation = IntStream.rangeClosed(0, defaultQuantityOfStation.length - 1).toArray();
        this.minNumberOfStation = defaultQuantityOfStation[0];
        this.maxNumberOfStation = defaultQuantityOfStation[i];
    }

    public int currentVolume;
    int[] volume = IntStream.rangeClosed(0, 100).toArray();
    int maxVolume = volume[100];
    int minVolume = volume[0];


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
        int nextStation = currentNumberOfStation + 1;
        if (nextStation > maxNumberOfStation) {
            nextStation = minNumberOfStation;
        }
        setNumberOfStation(nextStation);
    }

    public void prev() {
        int prevStation = currentNumberOfStation - 1;
        if (prevStation < minNumberOfStation) {
            prevStation = maxNumberOfStation;
        }
        setNumberOfStation(prevStation);
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