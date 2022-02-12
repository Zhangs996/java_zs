package 面向对象下.非访问修饰符abstract.abstract练习;

/**
 * @author zhangshuo
 * @create 2021-09-28 21:10
 */
public class Test {
    public static void main(String[] args) {
        Employee manager = new Manager("zhangshuo",1001,100.0,3.02);
        manager.work();
    }
}
