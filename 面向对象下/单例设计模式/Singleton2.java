package 面向对象下.单例设计模式;
//懒汉式
/*
 * 单例设计模式:
 * 1.所谓类的单例设计模式，就是采取一定的方法保证在整个的软件系统中，对某个类只能存在一个对象实例
 *
 * 2.如何实现？
 *   饿汉式	VS	懒汉式
 *
 * 3.区分饿汉式和懒汉式。
 * 	   饿汉式：坏处:对象加载时间过长。
 * 	 	       好处:饿汉式是线程安全的。
 *
 *   懒汉式：好处:延迟对象的创建。
 * 		       坏处:目前的写法，会线程不安全。---》到多线程内容时，再修改
 */
public class Singleton2 {
    public static void main(String[] args) {
        Order order1 = Order.getInstance();
        Order order2 = Order.getInstance();

        System.out.println(order1 == order2);
    }
}
class Order{
    //1.私有化类的构造器
    private Order(){

    }

    //2.声明当前类对象，没有初始化。
    //此对象也必须声明为 static 的
    private static Order instance = null;

    //3.声明 public、static 的返回当前类对象的方法
    public static Order getInstance(){
        if(instance == null){
            instance = new Order();
        }
        return instance;
    }
}

