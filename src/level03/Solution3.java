package level03;

public class Solution3 {
    public static void main(String[] args) {

    }

    interface Selectable {
        void onSelect();
    }

    interface Updatable extends Selectable {
        void refresh();
    }

    class Screen implements Selectable, Updatable {
        @Override
        public void onSelect() {

        }
        @Override
        public void refresh() {

        }
    }
}
