package cafe;

import java.util.Scanner;

public class JavaCafe {
    static final String[][] MENU = {{"coffee", "3000"}, {"tea", "3500"}, {"ade", "4000"}};

    static void order() throws FailedOrderException {
        System.out.println("---- 메뉴 ----");
        for(int i = 0; i < MENU.length; i++) {
            System.out.printf("%d. %s: %s원 %n", i+1, MENU[i][0], MENU[i][1]);
        }
        System.out.print("선택: ");
        try (Scanner scanner = new Scanner(System.in)) {
            int price = checkMenu(scanner.nextInt());
            System.out.print("지불 금액: ");
            int money = scanner.nextInt();
            if (checkMoney(price, money)) {
                System.out.println("주문 완료");
            }
        } catch (NoSuchMenuException | WrongAmountOfMoneyException e) {
            FailedOrderException fe = new FailedOrderException("주문 실패: " + e.getMessage());
            fe.initCause(e);
            throw fe;
        }

    }
    static int checkMenu(int order) throws NoSuchMenuException {
        switch (order) {
            case 1 :
                return Integer.parseInt(MENU[0][1]);
            case 2 :
                return Integer.parseInt(MENU[1][1]);
            case 3 :
                return Integer.parseInt(MENU[2][1]);
        }
        throw new NoSuchMenuException("없는 메뉴");
    }
    static boolean checkMoney(int price, int money) throws WrongAmountOfMoneyException {
        if(price == money) {
            return true;
        }
        throw new WrongAmountOfMoneyException("잘못된 금액");
    }

    public static void main(String[] args) {
        try {
            order();
        } catch (FailedOrderException fe) {
            System.out.println(fe.getMessage());
            System.out.println("다시 주문해 주세요.");
        }
    }
}
