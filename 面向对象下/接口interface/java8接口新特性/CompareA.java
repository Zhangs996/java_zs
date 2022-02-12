package 面向对象下.接口interface.java8接口新特性;

/*
 * JDK8:除了全局常量和抽象方法之外，还可以定义静态方法、默认方法(略),有方法体。
 *
 *
 */
public interface CompareA {

    //静态方法
    public static void method1() {
        System.out.println("CompareA:metohd1");
    }

    //默认方法
    public default void method2(){
        System.out.println("CompareA:metohd2");
    }

    default void method3(){
        System.out.println("CompareA:metohd3");
    }
}
