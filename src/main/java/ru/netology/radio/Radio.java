package ru.netology.radio;

public class Radio {
    public int numberOfStation;
    public int volume;

    public int getNumberOfStation() {
        return numberOfStation;
    }

    public void setNumberOfStation(int newNumberOfStation) {
        if (newNumberOfStation < 0) {
            return;
        }
        if (newNumberOfStation > 9) {
            return;
        }
        numberOfStation = newNumberOfStation;
    }

    public void next() {
        int nextStation = numberOfStation + 1;
        if (nextStation > 9) {
            nextStation = 0;
        }
        setNumberOfStation(nextStation);
    }

    public void prev() {
        int prevStation = numberOfStation - 1;
        if (prevStation < 0) {
            prevStation = 9;
        }
        setNumberOfStation(prevStation);
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int newVolume) {
        if (newVolume < 0) {
            return;
        }
        if (newVolume > 10) {
            return;
        }
        volume = newVolume;
    }

    public void increaseVolume() {
        int highVolume = volume + 1;
        setVolume(highVolume);
    }

    public void decreaseVolume() {
        int lowVolume = volume - 1;
        if (lowVolume < 0) {
            lowVolume = 0;
        }
        setVolume(lowVolume);
    }
}