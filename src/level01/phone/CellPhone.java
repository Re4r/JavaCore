package level01.phone;

public class CellPhone extends WirelessPhone {
    public CellPhone(int year, int workTime) {
        super(year, workTime);
    }

    @Override
    public void call(int outputNumber) {
        System.out.println("Calling to number... " + outputNumber);
    }

    @Override
    public void ring(int inputNumber) {
        System.out.println("Incoming call from number: " + inputNumber);
    }
}
