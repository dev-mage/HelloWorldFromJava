public class Child extends Parent{
    int age;
    // 오버라이딩
    void parentMethod() {
        System.out.println("Parent Method Overriding");
    }
    
    // 오버로딩
    void parentMethod(String name) { }
    
    void childMethod() { }
    void childMethod(int age) { } // 오버로딩
//    void childMethod(){ } -> 에러 'childMethod()' is already defined in 'Child'
}
