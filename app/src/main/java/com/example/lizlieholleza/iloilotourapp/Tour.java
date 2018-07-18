package com.example.lizlieholleza.iloilotourapp;

public class Tour {
    private String name;
    private int imageID;
    private int distance;
    private int time;
    private String food;
    private int soundID;
    private String englishWord;
    private String nativeWord;

    public Tour(String place, int distance, int time, int image) {
        this.name = place;
        this.distance = distance;
        this.time = time;
        this.imageID = image;
    }

    public Tour(String event, int image) {
        this.name = event;
        this.imageID= image;
    }

    public Tour(String place, String food, int image) {
        this.name = place;
        this.food = food;
        this.imageID = image;
    }
    public Tour(String englishWord, String nativeWord, int sound, int image) {
        this.englishWord = englishWord;
        this.nativeWord = nativeWord;
        this.soundID = sound;
        this.imageID = image;
    }

    public String getName() {
        return name;
    }

    public int getImageID() {
        return imageID;
    }

    public int getDistance() {
        return distance;
    }

    public int getTime() {
        return time;
    }

    public int getSoundID() {
        return soundID;
    }

    public String getEnglishWord() {
        return englishWord;
    }

    public String getNativeWord() {
        return nativeWord;
    }

    public String getFood() {
        return food;
    }
}
