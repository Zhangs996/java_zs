package 面向对象下.非访问修饰符abstract.abstract练习;

/**
 * @author zhangshuo
 * @create 2021-09-28 20:59
 */
public abstract class Employee {
    private String name;
    private int age;
    private double salary;

    public Employee() {
    }

    public Employee(String name, int age) {
        super();
        this.name = name;
        this.age = age;
    }

    public Employee(String name, int age, double salary) {
        super();
        this.name = name;
        this.age = age;
        this.salary = salary;
    }
    public abstract void work();
}
