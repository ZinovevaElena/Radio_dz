package ru.netology.radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class RadioTest {

    // Радиостанции
    @Test
    public void shouldRadioStation() { // установка станции +
        Radio service = new Radio();
        service.setNewNumberRadio(8);
        int expected = 8;
        int actual = service.getNewNumberRadio();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldRadioStationMoreThanMax() { // установка станции за пределами +
        Radio service = new Radio();
        service.setNewNumberRadio(15);
        int expected = 0;
        int actual = service.getNewNumberRadio();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldRadioStationLessThanMin() { // установка станции за пределами +
        Radio service = new Radio();
        service.setNewNumberRadio(-5);
        int expected = 0;
        int actual = service.getNewNumberRadio();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldRadioStationLimitMax() { // установка станции - ограничение +
        Radio service = new Radio();
        service.setNewNumberRadio(9);
        int expected = 9;
        int actual = service.getNewNumberRadio();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldRadioStationLimitMin() { // установка станции - ограничение +
        Radio service = new Radio();
        service.setNewNumberRadio(0);
        int expected = 0;
        int actual = service.getNewNumberRadio();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNextNumberRadio() { // переключение вперед +
        Radio service = new Radio();
        service.setNewNumberRadio(5);
        service.nextNumberRadio();
        int expected = 6;
        int actual = service.getNewNumberRadio();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldPrewNumberRadio() { // переключение назад +
        Radio service = new Radio();
        service.setNewNumberRadio(5);
        service.prewNumberRadio();
        int expected = 4;
        int actual = service.getNewNumberRadio();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNextNumberRadioMoreThanMax() { // переключение вперед за лимит+
        Radio service = new Radio();
        service.setNewNumberRadio(9);
        service.nextNumberRadio();
        int expected = 0;
        int actual = service.getNewNumberRadio();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldPrewNumberRadioLessThanMin() { // переключение назад за лимит +
        Radio service = new Radio();
        service.setNewNumberRadio(0);
        service.prewNumberRadio();
        int expected = 9;
        int actual = service.getNewNumberRadio();
        Assertions.assertEquals(expected, actual);
    }

    // Звук
    @Test
    public void shouldVolumeSound() { // установка звука +
        Radio service = new Radio();
        service.setCurrentVolumeSound(75);
        int expected = 75;
        int actual = service.getCurrentVolumeSound();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldVolumeMoreThanMax() { // установка звука за пределами +
        Radio service = new Radio();
        service.setCurrentVolumeSound(125);
        int expected = 0;
        int actual = service.getCurrentVolumeSound();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldVolumeLessThanMin() { // установка звука за пределами +
        Radio service = new Radio();
        service.setCurrentVolumeSound(-125);
        int expected = 0;
        int actual = service.getCurrentVolumeSound();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSoundLimitMax() { // установка звука - ограничение +
        Radio service = new Radio();
        service.setCurrentVolumeSound(0);
        int expected = 0;
        int actual = service.getCurrentVolumeSound();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSoundLimitMin() { // установка звука - ограничение +
        Radio service = new Radio();
        service.setCurrentVolumeSound(0);
        int expected = 0;
        int actual = service.getCurrentVolumeSound();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolumeSound() { // переключение звука вперед +
        Radio service = new Radio();
        service.setCurrentVolumeSound(25);
        service.increaseVolumeSound();
        int expected = 26;
        int actual = service.getCurrentVolumeSound();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldReduceVolumeSound() { // переключение звука назад +
        Radio service = new Radio();
        service.setCurrentVolumeSound(25);
        service.reduceVolumeSound();
        int expected = 24;
        int actual = service.getCurrentVolumeSound();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolumeSoundMoreThanMax() { // переключение звука вперед за лимит
        Radio service = new Radio();
        service.setCurrentVolumeSound(100);
        service.increaseVolumeSound();
        int expected = 100;
        int actual = service.getCurrentVolumeSound();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldReduceVolumeSoundLessThanMin() { // переключение звука назад за лимит
        Radio service = new Radio();
        service.setCurrentVolumeSound(0);
        service.reduceVolumeSound();
        int expected = 0;
        int actual = service.getCurrentVolumeSound();
        Assertions.assertEquals(expected, actual);
    }
}