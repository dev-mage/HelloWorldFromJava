package generics;

import java.util.ArrayList;

public class StorageBox<T extends Ingredient> {
    ArrayList<T> list = new ArrayList<T>();
    void add(T item) { list.add(item); }
    T get(int i) { return list.get(i); }
    int size() { return list.size(); }
}
