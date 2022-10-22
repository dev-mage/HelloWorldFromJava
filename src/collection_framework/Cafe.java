package collection_framework;

import java.util.*;

public class Cafe {
    public static void main(String[] args) {
        Queue<Menu> menuList = new LinkedList<>();
        System.out.println("============= OPEN =============");
        Scanner ordering = new Scanner(System.in);
        while (menuList.size() < 3) {
            System.out.print("주문하실 메뉴를 입력하세요: ");
            Menu menu = new Menu(ordering.next());
            menuList.offer(menu);
        }

        int orderNo = 1;
        while (!menuList.isEmpty()) {
            System.out.println("\n>>> 주문 확인 중...");
            System.out.println("주문번호 " + orderNo + "번 " + "메뉴: " + menuList.peek().getMenuName());

            System.out.println("\n>>> 음료 제조 중...");

            Menu menu = menuList.poll();
            System.out.println(menu.getMenuName() + " 나왔습니다.");
            orderNo++;
        }
        System.out.println("============= CLOSE =============");
    }
}
