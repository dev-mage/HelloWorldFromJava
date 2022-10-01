package cafe.employee;

import cafe.menu.Menu;

public class Staff extends Employee{
    public Staff() {}
    public Staff(String nickname) {
        super(nickname);
        System.out.println("스태프 " + nickname + " 출근");
    }
    public void clean() { System.out.println("매장 청소 중입니다."); }
    public Menu takeAnOrder(Menu menu) { // 주문 접수
        System.out.println(menu.getClass().getSimpleName() + " 주문 받았습니다.");
        return menu;
    }
    public Menu serve(Menu menu) {
        System.out.println("주문하신 " + menu.getClass().getSimpleName() + " 나왔습니다.");
        return menu;
    }

}
