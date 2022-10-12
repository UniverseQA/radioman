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
}