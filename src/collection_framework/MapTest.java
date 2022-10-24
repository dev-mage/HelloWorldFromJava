package collection_framework;

import java.util.HashMap;
import java.util.Iterator;

public class MapTest {
    public static void main(String[] args) {
        HashMap map = new HashMap();
        map.put("1111", "David");
        map.put("1111", "David");
//        Iterator it = map.entrySet().iterator();
        for (Object o : map.keySet()) {
            System.out.println(o.toString());
        }
    }
}
