package collection_framework;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Objects;

public class Customer {
    String name;
    String phoneNum;

    public Customer(String name, String phoneNum) {
        this.name = name;
        this.phoneNum = phoneNum;
    }

    @Override
    public String toString() {
        return "[" + name + " - " + phoneNum + "]";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return name.equals(customer.name) && phoneNum.equals(customer.phoneNum);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, phoneNum);
    }

    public static void main(String[] args) {
        Customer[] customers = {
                new Customer("David", "1111"),
                new Customer("David", "1111"),
                new Customer("Alice", "2222"),
                new Customer("Kelly", "6777")
        };
        HashSet customerList = new HashSet<>(Arrays.asList(customers));

        System.out.println(customerList);

    }
}
