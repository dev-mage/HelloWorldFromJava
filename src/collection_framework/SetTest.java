package collection_framework;

import java.util.*;

public class SetTest {
    public static void main(String[] args) {
        Object[] objects = {"1", new Integer(1), "2", "2", "3", "3", "3", "4", "4"};
        HashSet set = new HashSet<>(Arrays.asList(objects));

        Iterator it = set.iterator();
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }

        // 실행 결과
        // 1 1 2 3 4
    }
}
