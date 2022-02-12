package 面向对象下.非访问修饰符abstract.抽象类的匿名子类使用;

import 面向对象中.重写.Student;

/**
 * @author zhangshuo
 * @create 2021-09-28 21:26
 */
public class PersonTest {
    public static void main(String[] args) {
        new Student();//匿名对象
        Student student = new Student();
        method(student);//非匿名的类非匿名的对象

        //创建一个匿名子类的对象
        Person p1 = new Person(){
            @Override
            public void eat(){
                System.out.println("p1 eat");
            }
        };
        method1(p1);//p1 eat
        System.out.println("**********************");
        //创建匿名子类的匿名对象
        method1(new Person(){
            @Override
            public void eat() {
                System.out.println("吃零食");
            }

        });

    }
    public static void method(Student student){
    }

    public static void method1(Person p){
        p.eat();
    }
}
abstract class Person{
    public abstract void eat();
}
