package ru.netology;

public class Radio {
    private int currentRadioStation = 0;
    private int currentVolume = 0;
    public int minVolume = 0;
    public int maxVolume = 10;
    public int minRadioStations = 0;
    public int maxRadioStations = 9;

    public void setCurrentRadioStation(int numberRadioStation) {
        if (numberRadioStation < minRadioStations || numberRadioStation > maxRadioStations) {
            return;
        }
        currentRadioStation = numberRadioStation;
    }

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume < minVolume || newCurrentVolume > maxVolume) {
            return;
        }
        currentVolume = newCurrentVolume;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void increaseVolume() {
        if (currentVolume < maxVolume) {
            currentVolume = currentVolume + 1;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > minVolume) {
            currentVolume = currentVolume - 1;
        }
    }

    public void increaseRadioStation() {
        if (currentRadioStation == maxRadioStations) {
            currentRadioStation = minRadioStations;
            return;
        }
        currentRadioStation++;
    }

    public void decreaseRadioStation() {
        if (currentRadioStation == minRadioStations) {
            currentRadioStation = maxRadioStations;
            return;
        }
        currentRadioStation = currentRadioStation - 1;
    }

}
