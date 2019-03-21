package smarthouse;

import smarthouse.enums.MicrowaveAndOvenStatusOfWork;
import smarthouse.enums.StatusOfWear;

public class MicrowaveAndOven implements Runnable {

    private int uniqueNumber = 0;
    private long time;
    private Boolean fullness = true;
    private MicrowaveAndOvenStatusOfWork statusOfWork = MicrowaveAndOvenStatusOfWork.STAYING;
    private StatusOfWear statusOfWear;

    public MicrowaveAndOven(StatusOfWear statusOfWear) {
        this.statusOfWear = statusOfWear;
    }

    public int getUniqueNumber() {
        return uniqueNumber;
    }

    public void setUniqueNumber(int uniqueNumber) {
        this.uniqueNumber = uniqueNumber;
    }

    public long getTime() {
        return time;
    }

    public void setTime(long time) {
        this.time = time;
    }

    public MicrowaveAndOvenStatusOfWork getStatusOfWork() {
        return statusOfWork;
    }

    public void setStatusOfWork(MicrowaveAndOvenStatusOfWork statusOfWork) {
        this.statusOfWork = statusOfWork;
    }

    public StatusOfWear getStatusOfWear() {
        return statusOfWear;
    }

    public void setStatusOfWear(StatusOfWear statusOfWear) {
        this.statusOfWear = statusOfWear;
    }

    public Boolean getFullness() {
        return fullness;
    }

    public void setFullness(Boolean fullness) {
        this.fullness = fullness;
    }

    public synchronized void run() {
        long time = getTime()/1000;
        System.out.println((char) 27 + "[32mCooking...(the approximate time " + time + "" + " seconds)" + (char)27 + "[0m");
        try {
            Thread.sleep(time);
            System.out.println("\n" + (char) 27 + "[32mThe dish is ready" + (char)27 + "[0m");
            setStatusOfWork(MicrowaveAndOvenStatusOfWork.STAYING);
            System.out.print("Type: ");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
