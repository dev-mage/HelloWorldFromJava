public class Barista {
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
    Coffee makeCoffee(String state, int size) {
        Coffee coffee = null;
        class Disposables {
            final int cup = 1;
            final int lid = 1;
            final int straw = 1;
            void pack(Coffee coffee) {
                int cup = this.cup;
                int lid = this.lid;
                int straw = this.straw;
            }
        }
        if(state.equals("Iced")) {
            switch (size) {
                case CoffeeSize.GRANDE: coffee = new Coffee(3, 300, 90); break;
                case CoffeeSize.VENTI: coffee = new Coffee(4, 400, 120); break;
                default: coffee = new Coffee(2, 250, 60);
            }
        } else {
            switch (size) {
                case CoffeeSize.GRANDE: coffee = new Coffee(3, 390); break;
                case CoffeeSize.VENTI: coffee = new Coffee(4, 520); break;
                default: coffee = new Coffee(2, 310);
            }
        }
        Disposables disposables = new Disposables();
        disposables.pack(coffee);
        return coffee;
    }

    void serve(Coffee coffee) {
        String name = coffee.ice > 0 ? "아이스 커피" : "따뜻한 커피";
        String size;
        switch (coffee.shot) {
            case 3: size = "그란데"; break;
            case 4: size = "벤티"; break;
            default: size = "톨";
        }
        System.out.println("주문하신 " + size + " 사이즈 " + name + " 나왔습니다.");
    }

    public static void main(String[] args) {
        Barista barista = new Barista();
        barista.serve(barista.makeCoffee("Iced", CoffeeSize.TALL));
        barista.serve(barista.makeCoffee("Hot", CoffeeSize.GRANDE));
        barista.serve(barista.makeCoffee("Iced", CoffeeSize.VENTI));
    }

}
