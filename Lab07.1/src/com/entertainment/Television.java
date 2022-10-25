package com.entertainment;

public class Television {
    private String brand = null;
    private int volume = -1;
    private int volumeTemp = 0;
    private boolean powerOn = false;
    private boolean isMute = false;

    private static final int maxVolume = 100;
    private static final int minVolume = 0;

    DisplayType display = DisplayType.LED;

    public DisplayType getDisplay() {
        return display;
    }

    public void setDisplay(DisplayType display) {
        if(display != null) {
            this.display = display;
        } else {
            System.out.println("invalid display type!");
        }
    }

    public Television(String brand, int volume, DisplayType display){
        this(brand, volume);
        setDisplay(display);
    }

    public String getBrand() {
        return this.brand;
    }

    private void setBrand(String brand) {
        switch (brand) {
            case "Toshiba":
            case "Sony":
            case "LG":
            case "Samsung":
                this.brand = brand;
                break;
            default:
                this.brand = "Invalid";
                System.out.println("Invalid Input.");
        }
    }

    public int getVolume() {
        return this.volume;
    }

    private void setVolume(int volume) {
        if (volume <= maxVolume && volume >= minVolume) {
            this.volume = volume;
            this.volumeTemp = this.volume;
        } else {
            System.out.println("Invalid Volume");
//            if (volume >= maxVolume) {
//                this.volume = maxVolume;
//            } else {
//                this.volume = minVolume;
//            }
        }
    }

    public Television() {
    }

    public Television(String brand, int volume) {
        setBrand(brand);
        if (!this.brand.equals("Invalid")) {
            setVolume(volume);
        }
    }

    public void powerSwitch() {
        if (powerOn) {
            powerOn = false;
            System.out.println(this + " shut down.");
        } else {
            powerOn = true;
            System.out.println(this + " turned on");
        }
    }

    public boolean isMuted() {
        if (isMute) {
            return true;
        }
        return false;
    }

    public void toggleMute() {
        if (isMute) {
            unMute();
        } else {
            mute();
        }
    }

    private void mute() {
        volume = minVolume;
        isMute = true;
    }

    private void unMute() {
        volume = volumeTemp;
        isMute = false;
    }

    public String toString() {
        return getBrand() + " TV with default volume: " + getVolume() + " display mode : " + getDisplay();
    }
}

