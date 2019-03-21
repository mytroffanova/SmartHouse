package smarthouse;

import smarthouse.enums.LightingStatusOfWork;
import smarthouse.enums.StatusOfWear;

import java.awt.*;
public class Lighting {

    private LightingStatusOfWork statusOfWork = LightingStatusOfWork.TURNED_OFF;
    private StatusOfWear statusOfWear;
    private int brightness;
    private final Color color;

    public Lighting(StatusOfWear statusOfWear, Color color) {
        this.statusOfWear = statusOfWear;
        this.color = color;
    }

    public LightingStatusOfWork getStatusOfWork() {
        return statusOfWork;
    }

    public void setStatusOfWork(LightingStatusOfWork statusOfWork) {
        this.statusOfWork = statusOfWork;
    }

    public StatusOfWear getStatusOfWear() {
        return statusOfWear;
    }

    public void setStatusOfWear(StatusOfWear statusOfWear) {
        this.statusOfWear = statusOfWear;
    }

    public int getBrightness() {
        return brightness;
    }

    public void setBrightness(int brightness) {
        this.brightness = brightness;
    }

    public Color getColor() {
        return color;
    }

}
