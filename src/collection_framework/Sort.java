package collection_framework;

import java.util.Arrays;
import java.util.Comparator;

public class Sort {
    public static void main(String[] args) {
//        String[] arr = {"cake", "banana", "oreo", "apple", "app1e", "0re0"};
//        Arrays.sort(arr, new Comparator() {
//            @Override
//            public int compare(Object o1, Object o2) {
//                if (o1 instanceof String && o2 instanceof String)
//                    return ((String) o2).compareTo((String) o1);
//                return 0;
//            }
//        });
        Menu[] menus = {
                new Menu("coffee", 3500),
                new Menu("tea", 3000),
                new Menu("ade", 4500),
        };
        Arrays.sort(menus);
        System.out.println(Arrays.toString(menus));
    }
}
