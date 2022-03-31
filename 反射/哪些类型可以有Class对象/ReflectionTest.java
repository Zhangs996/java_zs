package 反射.哪些类型可以有Class对象;

/**
 * @author zhangshuo
 * @create 2021-10-18 13:26
 * （1）class：外部类，成员(成员内部类，静态内部类)，局部内部类，匿名内部类
 * （2）interface：接口
 * （3）[]：数组
 * （4）enum：枚举
 * （5）annotation：注解@interface
 * （6）primitivetype：基本数据类型
 * （7）void
 */
import org.junit.Test;

import java.lang.annotation.ElementType;

public class ReflectionTest {

    //万事万物皆对象？对象.xxx,File,URL,反射,前端、数据库操作

    /**
     * Class实例可以是哪些结构的说明：
     */
    @Test
    public void test4() {
        Class s1 = Object.class;
        Class s2 = Comparable.class;
        Class s3 = String[].class;
        Class s4 = int[][].class;
        Class s5 = ElementType.class;
        Class s6 = Override.class;
        Class s7 = int.class;
        Class s8 = void.class;
        Class s9 = Class.class;

        int[] a = new int[10];
        int[] b = new int[100];
        Class s10 = a.getClass();
        Class s11 = b.getClass();
        // 只要数组的元素类型与维度一样，就是同一个Class
        System.out.println(s10 == s11);
    }

}

