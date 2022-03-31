package 面向对象中.继承;

/*
继承的作用
继承提高了代码的复用性
继承让类于类之间产生了关系，提供了多态的前提
使用注意事项

不要仅为了获取其他类中某个 功能而去继承
子类继承了父类的方法和属性(两者都包括priavte的，只是不能直接调用)。
在子类中，可以使用父类中定义的方法和属性，也可以创建新的属性和方法
java中，继承的关键字是"extends"，子类不是父类的子集，而是父类的扩展

继承的规则
子类不能直接访问父类中私有的(private修饰)的属性和方法
java继承只支持单继承（即一次只能继承一个父类），不允许多重继承，但允许多层继承
    一个子类只能有一个父类
    一个父类可以派生出多个子类
类的构造器不能被继承，因为构造器名要与类名相同
当父类定义了public构造器时，必须在子类中重新定义构造器，不再提供默认的构造器了。
当父类的构造器为缺省的权限修饰符或没写，则子类中依然有默认的构造器
 */
public class 子类 extends 父类 {
    private String subName;
    public 子类(){
        System.out.println("子类构造方法");
    }
//    父类 父类1 = new 父类();
    public void printName(){
        System.out.println("子类");
    }
}
