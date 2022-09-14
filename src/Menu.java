public class Menu {
    String name;
    int price;
    int count;

    public Menu() {}
    int getTotalPrice(int price, int count) {
        return price * count;
    }
}
