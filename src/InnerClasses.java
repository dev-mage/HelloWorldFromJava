public class InnerClasses {
    class InstanceInner {
        int iv = 100;

        // 에러 -> Static declarations in inner classes are not supported at language level '8' / 16부터 가능
        // static int cv = 100;

        final static int CONST = 200; // 상수는 허용
        void instanceInnerMethod() {
            System.out.println("인스턴스 클래스의 메소드 > 인스턴스 클래스의 지역 변수: " + iv);
        }

    }

    static class StaticInner {
        int iv = 300;
        static int cv = 400; // static 내부 클래스만 static 멤버를 정의할 수 있음.
    }

    void method() {
        class LocalInner {
            int iv = 500;
//            static int cv = 300; -> 에러
            final static int CONST = 600; // 상수 허용
        }
//        InstanceInner instanceInner = new InstanceInner();
//        instanceInner.instanceInnerMethod();

        System.out.println("지역 클래스의 상수: " + LocalInner.CONST);

        LocalInner localInner = new LocalInner();
        System.out.println("지역 클래스의 지역 변수: " + localInner.iv);
    }

    public static void main(String[] args) {
        System.out.println("인스턴스 클래스의 상수: " + InstanceInner.CONST);
        System.out.println("정적 클래스의 상수: " + StaticInner.cv);

        StaticInner staticInner = new StaticInner();
        System.out.println("정적 클래스의 지역 변수: " + staticInner.iv);

        InnerClasses innerClasses = new InnerClasses();
        innerClasses.method();

    }
}
