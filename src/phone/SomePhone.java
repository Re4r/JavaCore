package phone;

public class SomePhone extends AbstractPhone {

    private String company;

    public SomePhone(int year, String company) {
        super(year);
        this.company = company;
    }

    private void openConnection() {
        System.out.println("Find commutator...");
        System.out.println("Open new connection...");
    }

    @Override
    public void call(int outputNumber) {
        openConnection();
        System.out.println("Calling to number...");
    }

    @Override
    public void ring(int inputNumber) {
        System.out.println("Incoming call...");

    }
}
