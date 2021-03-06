package 常用类.String和StringBuffer.String;

/**
 * @author zhangshuo
 * @create 2021-10-08 16:26
 */
import org.junit.Test;

/**
 * String的使用
 */
public class StringTest {

    /**
     * String:字符串，使用一对“”引起来表示。
     * 1.String声明为final的，不可被继承
     * 2.String实现了Serializable接口：表示字符串是支持序列化的。
     *         实现了Comparable接口：表示String可以比较大小
     * 3.String内部定义了final char[] value用于存储字符串数据
     * 4.String:代表不可变的字符序列。简称：不可变性。
     *      体现：1.当对字符串重新赋值时，需要重写指定内存区域赋值，不能使用原有的value进行赋值。
     *           2.当对现有的字符串进行连接操作时，也需要重新指定内存区域赋值，不能使用原有的value进行赋值。
     *           3.当调用String的replace()方法修改指定字符或字符串时，也需要重新指定内存区域赋值，不能使用原有的value进行赋值。
     * 5.通过字面量的方式（区别于new）给一个字符串赋值，此时的字符串值声明在字符串常量池中。
     * 6.字符串常量池中是不会存储相同内容的字符串的。
     *
     */
    @Test
    public void Test1(){
        String s1 = "abc";  //字面量的定义方式,s1在栈中，abc在方法区，方法区不会存两个相同的字符串
        String s2 = "abc";
        s1 = "hello";

        System.out.println(s1 == s2);//比较s1和s2的地址值

        System.out.println(s1);//hello
        System.out.println(s2);//abc

        System.out.println("*********************");

        String s3 = "abc";//此时s2和s3共用一个方法区
        s3 += "def";//新造的
        System.out.println(s3);//abcdef
        System.out.println(s2);//abc

        System.out.println("**********************");

        String s4 = "abc";
        String s5 = s4.replace('a', 'm');//当调用String的replace()方法修改指定字符或字符串时，也需要重新指定内存区域赋值，不能使用原有的value进行赋值。
        System.out.println(s4);//abc
        System.out.println(s5);//mbc

        String str = "hello";

        String  k1 = new String();

        String  k2 = new String("hello");

        char[] a = new char[]{'a','c','d'};
        String  k3 = new String(a);
        System.out.println(k3);//acd
        //String  k4 = new String(char[] a,int startIndex,int count);

    }
}

