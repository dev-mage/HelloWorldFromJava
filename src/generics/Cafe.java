package generics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Cafe {
    public static void main(String[] args) {
        StorageBox<CoffeeBeans> coffeeBeansStorageBox = new StorageBox<>();
        StorageBox<? extends FreshIngredient> fruitBox = new StorageBox<Fruit>();
        StorageBox<? extends FreshIngredient> vegeBox = new StorageBox<Vegetable>();

        Freezer.freeze(new StorageBox<Fruit>());
        Freezer.freeze(new StorageBox<Vegetable>());
//        Collections.sort();
    }
}
