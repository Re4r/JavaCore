package level01.phone;

public abstract class WirelessPhone extends AbstractPhone {

    private int workTime;

    public WirelessPhone(int year, int workTime) {
        super(year);
        this.workTime = workTime;
    }


}
