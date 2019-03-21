package smarthouse;

import smarthouse.enums.RoomsStatus;
import smarthouse.enums.StatusOfWear;
import smarthouse.enums.VacuumCleanerStatusOfWork;
import javax.swing.*;
import static java.lang.Thread.sleep;

public class VacuumCleaner extends JFrame implements Runnable {

    private int neededPower;
    private int uniqueNumber;
    private int power;
    private VacuumCleanerStatusOfWork statusOfWork = VacuumCleanerStatusOfWork.STAYING;
    private StatusOfWear statusOfWear;

    public VacuumCleaner(StatusOfWear statusOfWear) {
        this.statusOfWear = statusOfWear;
    }
    
    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public VacuumCleanerStatusOfWork getStatusOfWork() {
        return statusOfWork;
    }

    public void setStatusOfWork(VacuumCleanerStatusOfWork statusOfWork) {
        this.statusOfWork = statusOfWork;
    }

    public StatusOfWear getStatusOfWear() {
        return statusOfWear;
    }

    public void setStatusOfWear(StatusOfWear statusOfWear) {
        this.statusOfWear = statusOfWear;
    }

    public int getUniqueNumber() {
        return uniqueNumber;
    }

    public void setUniqueNumber(int uniqueNumber) {
        this.uniqueNumber = uniqueNumber;
    }

    public int getNeededPower() {
        return neededPower;
    }

    public void setNeededPower(int neededPower) {
        this.neededPower = neededPower;
    }

    public String getName() {
        if(uniqueNumber == 1) return "kitchen";
        if(uniqueNumber == 2) return "bathroom";
        if(uniqueNumber == 3) return "living room";
        if(uniqueNumber == 4) return "bedroom";
        if(uniqueNumber == 5) return "corridor";
        return null;
    }

    public boolean running() {
        if (getStatusOfWork().equals(VacuumCleanerStatusOfWork.WORKING)) {
            return true;
        } else {
            return false;
        }
    }

    public int getArea() {
        if(uniqueNumber == 1) return GetInfo.kitchen.getArea();
        if(uniqueNumber == 2) return GetInfo.bathroom.getArea();
        if(uniqueNumber == 3) return GetInfo.livingroom.getArea();
        if(uniqueNumber == 4) return GetInfo.bedroom.getArea();
        if(uniqueNumber == 5) return GetInfo.corridor.getArea();
        return 0;
    }

    public synchronized void run() {
        boolean running = running();
        if (running == true) {
            String result;
            String name = getName();
            int area = getArea();
            int time = area/2;
            System.out.println((char) 27 + "[32mVacuum Cleaner is cleaning "+ name
                    + " right now....(the approximate time " + time + " seconds)" + (char) 27  + "[0m");

            for (int i = 1; i <= area ; i++) {
                try {
                    sleep(500);
                    this.power--;
                    if (i == area){
                        result = "\n"+(char) 27 + "[32m"+ name + " is clear" + (char) 27  + "[0m";
                        System.out.println(result);
                        System.out.print("Type: ");
                        if(uniqueNumber == 1){ GetInfo.kitchen.setStatus(RoomsStatus.CLEAN);}
                        if(uniqueNumber == 2){ GetInfo.bathroom.setStatus(RoomsStatus.CLEAN);}
                        if(uniqueNumber == 3){ GetInfo.livingroom.setStatus(RoomsStatus.CLEAN);}
                        if(uniqueNumber == 4){ GetInfo.bedroom.setStatus(RoomsStatus.CLEAN);}
                        if(uniqueNumber == 5){ GetInfo.corridor.setStatus(RoomsStatus.CLEAN);}
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

        }else if (running == false) {
            int time = getNeededPower() - getPower();
            System.out.println((char) 27 + "[32mVacuum Cleaner is charging right now....(the approximate time " + time + " seconds)"+ (char) 27  + "[0m");
            String result = "\n" + (char) 27 + "[32mVacuum Cleaner has charged" + (char) 27  + "[0m";
            for (int i = getPower(); i <= this.neededPower; i++) {
                try {
                    sleep(1000);
                    setPower(i);
                    if (i == this.neededPower) {
                        System.out.println(result);
                        System.out.print("Type: ");
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
        setStatusOfWork(VacuumCleanerStatusOfWork.STAYING);
    }
}