package generics;

import java.util.ArrayList;

public class Order<T extends Menu> {
    ArrayList<T> orders = new ArrayList<T>();
    void add(T item) { orders.add(item); }
    T get(int i) { return orders.get(i); }
    int count() { return orders.size(); }
}
