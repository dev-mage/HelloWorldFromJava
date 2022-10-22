package collection_framework;

public class Menu implements Comparable<Menu> {
    private String menuName;
    private int price;
    public Menu(String menuName) {
        this.menuName = menuName;
    }

    public Menu(String menuName, int price) {
        this.menuName = menuName;
        this.price = price;
    }

    public String getMenuName() {
        return menuName;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "<" + menuName + ": " + price + ">";
    }

    @Override
    public int compareTo(Menu menu) {
        return this.getPrice() - menu.getPrice();
    }
}
