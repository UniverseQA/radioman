package ru.netology.radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

        @Test
    public void shouldSwitchNextStation() {
        Radio radio = new Radio();

        radio.setNumberOfStation(8);

        radio.next();

        int expected = 9;
        int actual = radio.getNumberOfStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSwitchNextStationFrom25() {
        Radio radio = new Radio(25);

        radio.setNumberOfStation(24);

        radio.next();

        int expected = 0;
        int actual = radio.getNumberOfStation();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldSwitchAfterMaxStation() {
        Radio radio = new Radio();

        radio.setNumberOfStation(10);

        radio.next();

        int expected = 1;
        int actual = radio.getNumberOfStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSwitchMaxStation() {
        Radio radio = new Radio();

        radio.setNumberOfStation(9);

        radio.next();

        int expected = 0;
        int actual = radio.getNumberOfStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSwitchPrevBelowZeroStation() {
        Radio radio = new Radio();

        radio.setNumberOfStation(-1);

        radio.prev();

        int expected = 9;
        int actual = radio.getNumberOfStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSwitchPrevZeroStation() {
        Radio radio = new Radio();

        radio.setNumberOfStation(0);

        radio.prev();

        int expected = 9;
        int actual = radio.getNumberOfStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSwitchPrevStation() {
        Radio radio = new Radio();

        radio.setNumberOfStation(1);

        radio.prev();

        int expected = 0;
        int actual = radio.getNumberOfStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolume() {
        Radio radio = new Radio();

        radio.setVolume(99);
        radio.increaseVolume();

        int expected = 100;
        int actual = radio.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseMaxVolume() {
        Radio radio = new Radio();

        radio.setVolume(100);
        radio.increaseVolume();

        int expected = 100;
        int actual = radio.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseAboveMaxVolume() {
        Radio radio = new Radio();

        radio.setVolume(1010);
        radio.increaseVolume();

        int expected = 1;
        int actual = radio.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseVolume() {
        Radio radio = new Radio();

        radio.setVolume(1);
        radio.decreaseVolume();

        int expected = 0;
        int actual = radio.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseZeroVolume() {
        Radio radio = new Radio();

        radio.setVolume(0);
        radio.decreaseVolume();

        int expected = 0;
        int actual = radio.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseBelowZeroVolume() {
        Radio radio = new Radio();

        radio.setVolume(-1);
        radio.decreaseVolume();

        int expected = 0;
        int actual = radio.getVolume();

        Assertions.assertEquals(expected, actual);
    }

}
