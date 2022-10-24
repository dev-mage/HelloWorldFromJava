package collection_framework;

import java.util.*;

public class SetTest {
    public static void main(String[] args) {
//        Object[] objects = {"1", 1, "2", "2", "3", "3", "3", "4", "4"};
//        Integer[] ints = {7, 4, 9, 1, 5};
//        HashSet set = new HashSet<>(Arrays.asList(objects));
        Menu[] menus = {
                new Menu("coffee", 3000),
                new Menu("tea", 3500),
                new Menu("ade", 4500)
        };
        TreeSet set = new TreeSet(Arrays.asList(menus));
        for (Object o : set) {
            System.out.print(o + " ");
        }

        // 실행 결과
        // <coffee: 3000> <tea: 3500> <ade: 4500>
    }
}
