package 常用类.String和StringBuffer.String实例化的区别;

/**
 * @author zhangshuo
 * @create 2021-10-08 17:09
 */
import org.junit.Test;

/**
 * String的使用
 */
public class StringTest {

    /**
     * String的实例化方式
     * 方式一：通过字面量定义的方式
     * 方式二：通过new + 构造器的方式
     *
     * 面试题：String s = new String("abc");方式创建对象，在内存中创建了几个对象？
     *      两个:一个是堆空间中new结构，另一个是char[]对应的常量池中的数据："abc"
     *
     */
    @Test
    public void test2(){
        //通过字面量定义的方式：此时的s1和s2的数据javaEE声明在方法区中的字符串常量池中。
        String s1 = "javaEE";
        String s2 = "javaEE";

        //通过new + 构造器的方式:此时的s3和s4保存的地址值，是数据在堆空间中开辟空间以后对应的地址值。
        String s3 = new String("javaEE");
        String s4 = new String("javaEE");
        String s5 = s3;
        s5 = "niusq";
        System.out.println(s3);//good
        System.out.println(s5);//best

        System.out.println(s1 == s2);//true
        System.out.println(s1 == s3);//false堆的地址和常量池的地址肯定不一样
        System.out.println(s1 == s4);//false
        System.out.println(s3 == s4);//false

        System.out.println("***********************");
        Person p1 = new Person("Tom",12);
        Person p2 = new Person("Tom",12);

        System.out.println(p1.name.equals(p2.name));//true
        System.out.println(p1.name == p2.name);//true，“tom”在常量池

        p1.name = "Jerry";
        System.out.println(p1.name);//Jerry
        System.out.println(p2.name);//Tom
    }
}

