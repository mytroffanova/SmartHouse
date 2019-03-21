package smarthouse;

import smarthouse.enums.AudioSystemStatusOfWork;
import smarthouse.enums.StatusOfWear;

public class AudioSystem {

    private int volume = 0;
    private AudioSystemStatusOfWork statusOfWork = AudioSystemStatusOfWork.NOT_PLAYING;
    private StatusOfWear statusOfWear;

    public AudioSystem(StatusOfWear statusOfWear) {
        this.statusOfWear = statusOfWear;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public AudioSystemStatusOfWork getStatusOfWork() {
        return statusOfWork;
    }

    public void setStatusOfWork(AudioSystemStatusOfWork statusOfWork) {
        this.statusOfWork = statusOfWork;
    }

    public StatusOfWear getStatusOfWear() {
        return statusOfWear;
    }

    public void setStatusOfWear(StatusOfWear statusOfWear) {
        this.statusOfWear = statusOfWear;
    }
}
