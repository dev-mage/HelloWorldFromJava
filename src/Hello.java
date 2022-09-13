public class Hello {
    static { System.out.println("클래스 초기화 블럭 실행"); }

    //{ System.out.println("인스턴스 초기화 블럭 실행"); }

    public Hello() { System.out.println("생성자 실행"); }
     Hello h0 = new Hello();

    public static void main(String[] args) {
        System.out.println("h1 인스턴스 생성 실행");
        Hello h1 = new Hello();

        System.out.println("h2 인스턴스 생성 실행");
        Hello h2 = new Hello();
    }
}


