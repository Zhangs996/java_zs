package 面向对象下.接口interface;

/*
 * 接口的使用
 * 1.接口使用 interface 来定义。
 * 2.在 Java 中:接口和类是并列的两个结构
 * 3.如何去定义两个接口:定义接口中的成员
 * 	》3.1 JDK7 及以前:只能定义全局常量和抽象方法
 * 		》全局常量:public static final int SPEED 或者 int SPEED（可以省略public static final）
 * 		》抽象方法:public abstract void fly();或者 void fly();(可以省略public abstract)
 *
 *  》3.2 JDK8:除了全局常量和抽象方法之外，还可以定义静态方法、默认方法(略)。
 *
 * 4.接口中不能定义构造器！意味着接口不可以实例化。
 *
 * 5.Java 开发中，接口通过让类去实现(implements)的方式来使用。
 *   如果实现类覆盖了接口中的所有方法，则此实现类就可以实例化
 *   如果实现类没有覆盖接口中所有的抽象方法，则此实现类仍为一个抽象类
 *   所以实现类要重写接口的所有抽象方法
 *
 * 6.Java 类可以实现多个接口 ---》弥补了 Java 单继承性的局限性
 *  格式:class AA extends BB implementd CC,DD,EE
 *
 *  7.接口与接口之间是继承,而且可以多继承
 *
 **********************************
 * 8.接口的具体使用，体现多态性
 * 	   接口的主要用途就是被实现类实现。（面向接口编程）
 * 9.接口，实际可以看作是一种规范
 *
 * 面试题:抽象类与接口有哪些异同？
 *
    接口和抽象类的区别：
（1）抽象类可以有构造方法，接口中不能有构造方法。
（2）抽象类中可以有普通成员变量，接口中没有普通成员变量
（3）抽象类中可以包含静态方法，接口中不能包含静态方法
（4）一个类可以实现多个接口，但只能继承一个抽象类。
（5）接口可以被多重实现，抽象类只能被单一继承
（6）如果抽象类实现接口，则可以把接口中方法映射到抽象类中作为抽象方法而不必实现，而在抽象类的子类中实现接口中方法
    接口和抽象类的相同点：
 (1) 都可以被继承
 (2) 都不能被实例化
 (3) 都可以包含方法声明
 (4) 派生类必须实现未实现的方法
 */
public class InterfaceTest {
    public static void main(String[] args) {
        System.out.println(Flayable.MAX_SPEED);
        System.out.println(Flayable.MIN_SPEED);
        Plane plane = new Plane();
        plane.fly();
        plane.stop();
    }
}
interface Flayable{

    //全局变量
    public static final int MAX_SPEED = 7900;//最高速度
    int MIN_SPEED = 1;//省略了 public static final

    //抽象方法
    public abstract void fly();

    void stop();//省略了 public abstract
    //Interfaces cannot have constructors接口不能有构造器
//	public Flayable(){}
}
interface Attackable{
    void attack();
}

class Plane implements Flayable{

    @Override
    public void fly() {
        System.out.println("飞机通过引擎起飞");

    }

    @Override
    public void stop() {
        System.out.println("驾驶员减速停止");
    }

}
abstract class Kite implements Flayable{

    @Override
    public void fly() {

    }
}

class Bullet extends Object implements Flayable,Attackable,CC{


    @Override
    public void fly() {

    }

    @Override
    public void stop() {

    }

    @Override
    public void attack() {

    }

    @Override
    public void method1() {

    }

    @Override
    public void method2() {

    }
}

//*********************************
interface AA{
    void method1();
}
interface BB{
    void method2();
}
interface CC extends AA,BB{

}

