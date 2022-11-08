package generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Cafe {
    public static void main(String[] args) {
//        StorageBox<CoffeeBeans> coffeeBeansStorageBox = new StorageBox<>();
//        StorageBox<? extends FreshIngredient> fruitBox = new StorageBox<Fruit>();
//        StorageBox<? extends FreshIngredient> vegeBox = new StorageBox<Vegetable>();
        List[] stringLists = new ArrayList[1]; // 제네릭 배열을 생성. 런타임시에는 제네릭 타입은 소거되므로 ArrayList[]가 된다.

        ArrayList<Integer> intList = (ArrayList<Integer>) Arrays.asList(1);              // 타입 소거로 인해 런타임시 ArrayList가 된다.
        Object[] objects = stringLists;                             // 배열은 공변성을 가지므로 Object[]는 ArrayList[]가 될 수 있다.
        objects[0] = intList;                                       // intList또한 ArrayList이므로 배열의 요소가 될 수 있다.
        String s = (String) stringLists[0].get(0);

//        Freezer.freeze(new StorageBox<Fruit>());
//        Freezer.freeze(new StorageBox<Vegetable>());
//        Collections.sort();
    }
}
