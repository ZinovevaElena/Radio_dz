package ru.netology.radio;

public class Radio {
    private int excessNumberStation = 10;
    private final int maxStation = excessNumberStation - 1;
    private final int minStation = 0;
    private final int minVolume = 0;
    private final int maxVolume = 100;
    private int newNumberRadio;
    private int currentVolumeSound;

    public Radio(int excessNumberStation) {
        this.excessNumberStation = excessNumberStation;
        excessNumberStation = 10;
    }

    public Radio() {
        excessNumberStation = 10;
    }

    public int getExcessNumberStation() {
        return excessNumberStation;
    }

    public int getMaxStation() {
        return maxStation;
    }

    public int getMinStation() {
        return minStation;
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

