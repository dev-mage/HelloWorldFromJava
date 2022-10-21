package collection_framework;

import java.util.*;

public class Cafe {
    public static void main(String[] args) {
        Queue<Order> orderList = new LinkedList<>();
        System.out.println("============= OPEN =============");
        Scanner ordering = new Scanner(System.in);
        while (orderList.size() < 3) {
            System.out.print("주문하실 메뉴를 입력하세요: ");
            Order order = new Order(ordering.next());
            orderList.offer(order);
        }

        int orderNo = 1;
        while (!orderList.isEmpty()) {
            System.out.println("\n>>> 주문 확인 중...");
            System.out.println("주문번호 " + orderNo + "번 " + "메뉴: " + orderList.peek().getMenu());

            System.out.println("\n>>> 음료 제조 중...");

            Order order = orderList.poll();
            System.out.println(order.getMenu() + " 나왔습니다.");
            orderNo++;
        }
        System.out.println("============= CLOSE =============");
    }
}
