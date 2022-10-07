public class Outer {
    private String outerInstanceVar = "1. 외부 클래스의 private 인스턴스 변수";
    static String outerStaticVar = "2. 외부 클래스의 클래스 변수";

    class InstanceInner { // 인스턴스 클래스
        String instanceInnerVar = "3-1. 인스턴스 클래스의 인스턴스 변수";
        // static String CONST = "* 인스턴스 클래스의 상수 *"; // 에러
        // -> Static declarations in inner classes are not supported at language level '8' / 16부터 가능
        static final String CONST = "3-2. 인스턴스 클래스의 상수"; // 상수는 허용
        void instanceInnerMethod() {
            System.out.println("-- 인스턴스 클래스의 메서드 시작--");
            System.out.println(outerInstanceVar);
            System.out.println(outerStaticVar);
            System.out.println(instanceInnerVar);
            System.out.println(StaticInner.staticInnerStaticVar);
            System.out.println("-- 인스턴스 클래스의 메서드 끝--\n");
        }

    }

    static class StaticInner { // 정적 클래스
        // 정적 클래스만 static 멤버를 정의할 수 있음.
        static String staticInnerStaticVar = "4-1. 정적 클래스의 클래스 변수";
        String staticInnerVar = "4-2. 정적 클래스의 인스턴스 변수";
        static void staticInnerStaticMethod() {
            System.out.println("-- 정적 클래스의 클래스 메서드 시작--");
            // System.out.println(outerInstanceVar); // 에러
            // -> 클래스 멤버이므로 인스턴스 멤버에 바로 접근할 수 없음.
            System.out.println(outerStaticVar);
            System.out.println(staticInnerStaticVar);
            System.out.println("-- 정적 클래스의 클래스 메서드 끝--\n");
        }
    }
    static void staticMethod() {
        System.out.println("-- 클래스 메서드 시작--");
        StaticInner.staticInnerStaticMethod();
        // new InstanceInner().instanceInnerMethod(); // 에러
        // -> 인스턴스 클래스에 접근하려면 외부 클래스를 먼저 생성해야만 함.
        System.out.println(new Outer().new InstanceInner().instanceInnerVar);
        System.out.println(StaticInner.staticInnerStaticVar);
        // System.out.println(StaticInner.staticInnerVar); // 에러
        // -> 정적 클래스의 인스턴스 변수이므로 정적 클래스를 생성해야 한다.
        System.out.println(new StaticInner().staticInnerVar);
        System.out.println("-- 클래스 메서드 끝--\n");
    }

    void method() {
        // JDK 1.8부터 final 생략 가능
        String methodLocalVar = "5. 메서드의 지역 변수"; // == final String ...
        class LocalInner { // 지역 클래스
            String localInnerVar = "6-1. 지역 클래스의 인스턴스 변수";
            // static String CONST = "지역 클래스의 상수"; -> 에러
            static final String CONST = "6-2. 지역 클래스의 상수"; // 상수 허용
            void localInnerMethod() {
                System.out.println("-- 지역 클래스의 메서드 시작--");
                System.out.println(outerInstanceVar);
                System.out.println(outerStaticVar);
                System.out.println(new InstanceInner().instanceInnerVar);
                System.out.println(StaticInner.staticInnerStaticVar);
                // System.out.println(StaticInner.staticInnerVar); // 에러
                // -> staticInnerVar은 정적 클래스의 인스턴스 변수이므로 정적 클래스의 인스턴스를 통해 접근
                System.out.println(new StaticInner().staticInnerVar);
                System.out.println(methodLocalVar); // final이 붙은 상수만 접근 가능
                System.out.println(localInnerVar);
                System.out.println("-- 지역 클래스의 메서드 끝--\n");
            }
        }

        LocalInner localInner = new LocalInner();
        localInner.localInnerMethod();
        System.out.println(LocalInner.CONST);
    }

    public static void main(String[] args) {
        System.out.println();
        // 인스턴스 클래스의 인스턴스를 생성하려면
        // 외부 클래스의 인스턴스를 먼저 생성해야 함.
        Outer outer = new Outer();
        outer.new InstanceInner().instanceInnerMethod();
        // outer.new StaticInner().staticInnerMethod();
        // -> 에러 Qualified new of static class
        // : 클래스 멤버이기 때문에 외부 클래스의 인스턴스로 접근하지 않음.

        StaticInner.staticInnerStaticMethod();

        staticMethod();
        outer.method();

        System.out.println(InstanceInner.CONST);
    }
}
