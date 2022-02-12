package 面向对象上;
/*
构造方法：
它具有与类相同的名称
它不声明返回值类型。（与声明为void不同）
不能被static、final、synchronized、abstract、native修饰，不能有return语句返回值
构造器的作用：创建对象；给对象进行初始化

修饰符 类名 (参数列表) {
初始化语句；
}
根据参数不同，构造器可以分为如下两类：
自己没有显示定义构造器时，系统自动构造隐式无参构造器（系统默认提供）
显式定义一个或多个构造器（无参、有参）
如果定义了显示构造器，那系统就走显示构造器，不再提供空参构造器
一个类一定会有构造器
注 意：
Java语言中，每个类都至少有一个构造器
默认构造器的修饰符与所属类的修饰符一致
一旦显式定义了构造器，则系统不再提供默认构造器
一个类可以创建多个重载的构造器
父类的构造器不可被子类继承

构造器的作用：
创建对象，和给对象初始化
 */
public class 构造器 {
    private int legs;
    private String name;
    //构造器
    //一个类可以创建多个重载的构造器
    public 构造器() {
        legs = 4;
    }

    public 构造器(int n,String M){
        legs = n;
        name = M;
    }
    public 构造器(int n){
        legs = n;
    }
    public void setLegs(int i) {
        legs = i; }
    public int getLegs() {
        return legs; }
}
class animal{
    public static void main(String[] args) {
        构造器 n = new 构造器(6);
        System.out.println(n.getLegs());//6
    }
}


