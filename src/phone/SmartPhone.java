package phone;

public class SmartPhone extends CellPhone {

    private String operationSystem;

    public SmartPhone(int year, int workTime, String operationSystem) {
        super(year, workTime);
        this.operationSystem = operationSystem;
    }

    public void install(String program) {
        System.out.println("Install " + program + " for " + operationSystem);
    }

    @Override
    public void call(int outputNumber) {
        super.call(outputNumber);
    }

    @Override
    public void ring(int inputNumber) {
        super.ring(inputNumber);
    }
}
