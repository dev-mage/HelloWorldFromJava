public class Coffee extends Beverage{
    int extraShot;
    public Coffee(String name, int price, int extraShot) {
        super(name, price);
        this.extraShot = extraShot;
    }
    int calculatePrice() {
        return price + (extraShot * 500);
    }

    public static void main(String[] args) {
        Coffee coffee = new Coffee("아메리카노", 3000, 2);
        System.out.println( coffee.name + ": " + coffee.calculatePrice() + "원");
    }
}
