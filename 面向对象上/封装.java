package 面向对象上;

import java.lang.reflect.Array;
import java.util.Arrays;

/*
Java中通过将数据声明为私有的(private)，再提供公共的（public）
方法:getXxx()和setXxx()实现对该属性的操作，以实现下述目的：
隐藏一个类中不需要对外提供的实现细节；
使用者只能通过事先定制好的方法来访问数据，可以方便地加入控制逻辑，
限制对属性的不合理操作；
便于修改，增强代码的可维护性；

面向对象思想编程内容的三条主线分别是什么？
    类及类的成员:属性、方法。构造器：代码块、内部类。
    面向对象的三大特征:封装、继承、多态
    其它关键字:this,super,abstract,interface,static,final,package,import

栈、堆、方法区
    栈(Stack），是指虚拟机栈。虚拟机栈时于存储局部变量等。局部变量表存放了编译期可知长度的各种基本数据类型( boolean、byte、char、short、int、float、long、double）和
                对象引用( reference类型，它不等同于对象本身，是对象在堆内存的首地址）。方法执行完，自动释放。
    堆(Heap)、此内存区域的唯一目的就是存放对象实例，几乎所有的对象实例都在这里分配内存。这一点在Java虚拟机规范中的描述是:所有的对象实例，对象的属性，以及数组都要在堆上分配。
    方法区(Method Area），用于存储已被虚拟机加载的类信息、常量、静态变量、即时编译器编译后的代码等数据。

修饰符
                private default protected public
当前类             √        √        √        √
同一包                      √        √        √
其他包的子类                          √        √
其他包的非子类（同一个工程）                     √

类中应该有属性和方法，属性不应该是static的，因为static修饰的属性所有对象都只有一个值
封装性的体现，需要权限修饰符来配合。

具体的，4种权限都可以用来修饰类的内部结构:属性、方法、构造器、内部类
修饰类的话，只能使用:default，public

 */
public class 封装 {
    public static void main(String args[]) {
        Animal xb = new Animal();
        xb.eat();
        xb.move();
    }
}
class Animal {
    private int legs;//private+get+set是封装性的一个体现，private只能在本类使用
    public void setLegs(int legs){
        if(legs<=0) {
            this.legs = 0;
        }else{
            this.legs = legs;
        }
    }
    public int getLegs(){
        return legs;
    }

    public void eat() {
        System.out.println(legs);//4
    }

    public void move() {
        System.out.println("Moving.");
    }
}
