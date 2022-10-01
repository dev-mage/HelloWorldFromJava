package cafe.employee;

public abstract class Employee {
    protected String nickname;

    public Employee() {}
    public Employee(String nickname) {
        this.nickname = nickname;
    }

    public abstract void clean(); // 각자 구역 청소
}
