package smarthouse;

import smarthouse.enums.SmartBathStatusOfWork;
import smarthouse.enums.StatusOfWear;

public class SmartBath implements Runnable {

    private int neededLevelOfWater;
    private int levelOfWater = 0;
    private int temperature = 0;
    private SmartBathStatusOfWork statusOfWork = SmartBathStatusOfWork.STAYING;
    private StatusOfWear statusOfWear;

    public SmartBath(StatusOfWear statusOfWear) {
        this.statusOfWear = statusOfWear;
    }

    public int getLevelOfWater() {
        return levelOfWater;
    }

    public void setLevelOfWater(int levelOfWater) {
        this.levelOfWater = levelOfWater;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public StatusOfWear getStatusOfWear() {
        return statusOfWear;
    }

    public void setStatusOfWear(StatusOfWear statusOfWear) {
        this.statusOfWear = statusOfWear;
    }

    public SmartBathStatusOfWork getStatusOfWork() {
        return statusOfWork;
    }

    public void setStatusOfWork(SmartBathStatusOfWork statusOfWork) {
        this.statusOfWork = statusOfWork;
    }

    public int getNeededLevelOfWater() {
        return neededLevelOfWater;
    }

    public void setNeededLevelOfWater(int neededLevelOfWater) {
        this.neededLevelOfWater = neededLevelOfWater;
    }

    public void run() {
        int time = Math.abs(getLevelOfWater() - getNeededLevelOfWater())*3;
        System.out.println((char) 27 + "[32mSmart bath is working...(the approximate time " + time + "" + " seconds)" + (char)27 + "[0m");
        for (int i = 1; i <= time ; i++) {
            try {
                Thread.sleep(1000);
                if (i == time){
                setLevelOfWater(getNeededLevelOfWater());
                System.out.println((char) 27 + "[32mSmart bath is ready" + (char)27 + "[0m");
                setStatusOfWork(SmartBathStatusOfWork.STAYING);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
