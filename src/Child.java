public class Child extends Parent{
    public Child() { System.out.println("Child"); }

    public static void main(String[] args) {
        Child c = new Child();
        c.name = "김철수";
    }
}
