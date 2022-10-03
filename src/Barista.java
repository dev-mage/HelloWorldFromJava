public class Barista {
    static int sales;
    class Order {
        int size; String state;
        public Order(int size, String state) {
            this.size = size;
            this.state = state;
        }
    }
    class Coffee {
        int shot; int water; int ice;
        public Coffee(int shot, int water) {
            this.shot = shot;
            this.water = water;
        }
        public Coffee(int shot, int water, int ice) {
            this(shot, water);
            this.ice = ice;
        }
    }
    static class CoffeeSize {
        static final int TALL = 350;
        static final int GRANDE = 450;
        static final int VENTI = 600;
    }

    Coffee makeCoffee(Order order) {
        Coffee coffee = null;
        class CoffeeBeans{

        }
        if(order.state.equals("Iced")) {
            switch (order.size) {
                case CoffeeSize.GRANDE: coffee = new Coffee(3, 300, 90); break;
                case CoffeeSize.VENTI: coffee = new Coffee(4, 400, 120); break;
                default: coffee = new Coffee(2, 250, 60);
            }
        } else {
            switch (order.size) {
                case CoffeeSize.GRANDE: coffee = new Coffee(3, 390); break;
                case CoffeeSize.VENTI: coffee = new Coffee(4, 520); break;
                default: coffee = new Coffee(2, 310);
            }
        }
        return coffee;
    }

    void help() {

        class CafeInfo {
            static final String LOCATION = "";
            static final String BUSINESS_HOURS = "";
            static final String PHONE_NUMBER = "";

        }
    }

}
