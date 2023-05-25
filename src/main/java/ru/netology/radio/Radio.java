package ru.netology.radio;

public class Radio {
    private int excessNumberStation = 10;
    private final int maxStation;
    private final int minStation;
    private final int minVolume;
    private final int maxVolume;
    private int newNumberRadio;
    private int currentVolumeSound;

    public Radio() {
        maxStation = excessNumberStation - 1;
        minStation = 0;
        minVolume = 0;
        maxVolume = 100;
    }

    public int getNewNumberRadio() {
        return newNumberRadio;
    }

    public void setNewNumberRadio(int newNumberRadio) { // ограничение волн
        if (newNumberRadio < minStation) {
            return;
        }
        if (newNumberRadio > maxStation) {
            return;
        }
        this.newNumberRadio = newNumberRadio;
    }

    public void nextNumberRadio() { // переключение вперед
        if (newNumberRadio != maxStation) {
            newNumberRadio++;
        } else {
            newNumberRadio = minStation;
        }
    }

    public void prewNumberRadio() { // переключение назад
        if (newNumberRadio != minStation) {
            newNumberRadio--;
        } else {
            newNumberRadio = maxStation;
        }
    }

    public int getCurrentVolumeSound() {
        return currentVolumeSound;
    }

    public void setCurrentVolumeSound(int currentVolumeSound) { // ограничение звука
        if (currentVolumeSound < minVolume) {
            return;
        }
        if (currentVolumeSound > maxVolume) {
            return;
        }
        this.currentVolumeSound = currentVolumeSound;
    }

    public void increaseVolumeSound() { // переключение звука вперед
        if (currentVolumeSound != maxVolume) {
            currentVolumeSound++;
        } else {
            currentVolumeSound = maxVolume;
        }
    }

    public void reduceVolumeSound() { // переключение звука назад
        if (currentVolumeSound != minVolume) {
            currentVolumeSound--;
        } else {
            currentVolumeSound = minVolume;
        }
    }
}

