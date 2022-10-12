package ru.netology.radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void shouldSwitchNextStation() {
        Radio radio = new Radio();

        radio.setNumberOfStation(9);

        radio.next();

        int expected = 0;
        int actual = radio.getNumberOfStation();

        Assertions.assertEquals(expected, actual);
    }
    @Test
        public void shouldSwitchPrevStation() {
        Radio radio = new Radio();

        radio.setNumberOfStation(0);

        radio.prev();

        int expected = 9;
        int actual = radio.getNumberOfStation();

        Assertions.assertEquals(expected, actual);
    }
}
