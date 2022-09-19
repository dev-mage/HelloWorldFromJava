public class Coffee{
    private int price;
    private int extraShot;
    public int calculatePrice() {
        return this.getPrice() + (this.getExtraShot() * 500);
    }
    public void setPrice(int price) {
        if(price < 3000) price = 3000;
        this.price = price;
    }
    public int getPrice() { return price; }
    public void setExtraShot(int extraShot) {
        if(extraShot < 0) extraShot = 0;
        this.extraShot = extraShot;
    }
    public int getExtraShot() { return extraShot; }

    public static void main(String[] args) {
        Coffee coffee = new Coffee();
        coffee.setPrice(3000);
        coffee.setExtraShot(2);
        System.out.println(coffee.calculatePrice());
    }
}
