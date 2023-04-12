package level01.phone;

public class User {

    public static void main(String[] args) {
        AbstractPhone cellPhone = new CellPhone(2003, 24);
        AbstractPhone smartPhone = new SmartPhone(2015, 36, "Android");

        User user = new User("Derta");

        user.callAnotherUser(234567, cellPhone);
        user.callAnotherUser(678905, smartPhone);
        user.incomingCall(123456,cellPhone);
        user.incomingCall(14564,smartPhone);
    }

    private String name;

    public User(String name) {
        this.name = name;
    }

    public void callAnotherUser(int number, AbstractPhone phone) {
        phone.call(number);
    }

    public void incomingCall(int number, AbstractPhone phone) {
        phone.ring(number);
    }
}
