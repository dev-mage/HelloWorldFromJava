package cafe;

import cafe.employee.*;
import cafe.menu.*;

import java.util.Scanner;
import java.util.Vector;

public class Cafe {
    String state = "close";
    Vector<Employee> employees = new Vector<>();
    Staff staff; Barista barista; Patissier patissier;
    int orderCount;
    public Cafe() {
        employees.add(new Staff("Bob"));
        employees.add(new Barista("Kelly"));
        employees.add(new Patissier("Jessica"));
        state = "open";
        orderCount = 0;
        System.out.println("오늘 영업을 시작합니다.");
    }
    public void order() {
        System.out.println("[MENU]");
        Menu order = null;
        Scanner scanner = new Scanner(System.in);
        System.out.print(">>> (1)음료 (2)디저트 : ");
        int num = scanner.nextInt();
        if (num == 1) {
            System.out.print(">>> (1)커피 (2)차 (3)스무디 (0)처음으로 : ");
            switch (scanner.nextInt()) {
                case 1: order = new Coffee(); break;
                case 2: order = new Tea(); break;
                case 3: order = new Smoothie(); break;
            }
        } else if (num == 2) {
            System.out.print(">>> (1)쿠키 (2)케이크 (0)처음으로 : ");
//            switch (scanner.nextInt()) {
//                case 1: order = new cafe.menu.Coffee(); break;
//                case 2: order = new cafe.menu.Tea(); break;
//            }
        } else {
            return;
        }
        if(order != null) {
            orderCount++;
            System.out.println("\n--- 오늘의 " + orderCount + "번째 주문 ---");
            Menu menu = staff.takeAnOrder(order);
            if(menu instanceof Drink) {
                menu = barista.make(menu, barista.prepareIngredients(menu));
            }
            staff.serve(menu);
        }
        if(orderCount >= 1) {
            System.out.println("\n주문이 마감되었습니다.");
            state = "close";
            scanner.close();
        }
    }
    public static void main(String[] args) {
        Cafe cafe = new Cafe();
        for(Employee e : cafe.employees) {
            if(e instanceof Staff) {
                cafe.staff = (Staff) e;
            } else if (e instanceof Barista) {
                cafe.barista = (Barista) e;
            } else {
                cafe.patissier = (Patissier) e;
            }

        }

        System.out.println("\n*-------------------------------------------*");

        while (cafe.state.equals("open")) {
            cafe.order();
        }

        System.out.println("*-------------------------------------------*\n");

        if(cafe.state.equals("close")) {
            for(Employee e : cafe.employees) {
                e.clean();
                if(e instanceof CookingEmployee) {
                    ((CookingEmployee) e).manageStock();
                }
            }
            System.out.println("\n오늘 영업을 마감합니다.");
        }

    }
}
