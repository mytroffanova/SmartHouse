package smarthouse;

import smarthouse.enums.JalousieStatusOfWork;
import smarthouse.enums.StatusOfWear;

public class Jalousie {

    private JalousieStatusOfWork statusOfWork = JalousieStatusOfWork.CLOSED;
    private StatusOfWear statusOfWear;

    public Jalousie(StatusOfWear statusOfWear) {
        this.statusOfWear = statusOfWear;
    }

    public JalousieStatusOfWork getStatusOfWork() {
        return statusOfWork;
    }

    public void setStatusOfWork(JalousieStatusOfWork statusOfWork) {
        this.statusOfWork = statusOfWork;
    }

    public StatusOfWear getStatusOfWear() {
        return statusOfWear;
    }

    public void setStatusOfWear(StatusOfWear statusOfWear) {
        this.statusOfWear = statusOfWear;
    }
}
