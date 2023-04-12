package lection02;

public class Solution1 {
    public static void main(String[] args) {
        Cow cow = new Whale();
        System.out.println(cow.getName());

    }

    public static class Cow {
        public String getName() {
            return "Я - корова";
        }
    }

    public static class Whale extends Cow {
        @Override
        public String getName() {
            System.out.print("Я не корова, ");
            return "Я - Кит";
        }
    }
}
