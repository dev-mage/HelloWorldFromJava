import java.util.Scanner;

public class Event {
    public static void main(String[] args) {
        Customer customer = new Customer();
        System.out.println("어떻게 그려드릴까요?");
        Scanner scanner = new Scanner(System.in);
        String request = scanner.nextLine();
        scanner.close();
        CaricatureService caricatureService = new CaricatureService() {
            @Override
            public Caricature draw() {
                System.out.println("고객 요청사항: " + request);
                System.out.println("요청사항에 따라 그리는 중...");
                System.out.println("캐리커처 완성");
                return new Caricature();
            }
        };
        customer.receive(caricatureService.draw());
    }
}
