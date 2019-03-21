package smarthouse;

import smarthouse.enums.ClimateControlStatusOfWork;

public class ClimateControl implements Runnable{

    private int neededTemperature;
    private int temperature = 20;
    private ClimateControlStatusOfWork statusOfWork = ClimateControlStatusOfWork.STAYING;

    public int getNeededTemperature() {
        return neededTemperature;
    }

    public void setNeededTemperature(int neededTemperature) {
        this.neededTemperature = neededTemperature;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public ClimateControlStatusOfWork getStatusOfWork() {
        return statusOfWork;
    }

    public void setStatusOfWork(ClimateControlStatusOfWork statusOfWork) {
        this.statusOfWork = statusOfWork;
    }

    public void run() {
    int time = Math.abs(getTemperature() - getNeededTemperature());
    System.out.println((char) 27 + "[32mClimate control is working...(the approximate time " + time + "" + " seconds)" + (char)27 + "[0m");

        for (int i = 1; i <= time ; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        setTemperature(getNeededTemperature());
        setStatusOfWork(ClimateControlStatusOfWork.STAYING);
        System.out.println((char) 27 + "[32mDone! Current temperature:  " + getTemperature() + (char)27 + "[0m");

    }

}
