package collection_framework;

import java.util.*;
import java.util.stream.Collectors;

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
        int[] A = {1, 3, 6, 4, 1, 2};
        TreeSet<Integer> set = Arrays.stream(A).filter(x -> x > 0).boxed().collect(Collectors.toCollection(TreeSet::new));


        // 실행 결과
        // <coffee: 3000> <tea: 3500> <ade: 4500>
    }
}
