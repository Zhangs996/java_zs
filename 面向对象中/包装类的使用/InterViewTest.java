package 面向对象中.包装类的使用;

import org.junit.Test;
/*
 * 如下两个题目输出结果相同吗？各是什么：
 * 		Object o1= true? new Integer(1) : new Double(2.0);
 * 		System.out.println(o1);//
 *
 * 		Object o2;
 * 		if(true)
 * 			o2 = new Integer(1);
 *		else
 *			o2 = new Double(2.0);
 *		System.out.println(o2);//
 *
 */
public class InterViewTest {

    @Test
    public void test(){
        //Java直接输出一个类的对象的时候，会自动调用这个类的toString方法,所以所有的类都有toString方法是getClass().getName()+'@'+Integer.toHexString(hashCode())
        //编译的时候三元运算符会比较：两边的类型，自动提升
        Object o1= true? new Integer(1) : new Double(2.0);
        System.out.println(o1);// 1.0
    }

    @Test
    public void test2(){
        Object o2;
        if(true)
            o2 = new Integer(1);
        else
            o2 = new Double(2.0);
        System.out.println(o2);// 1
    }

    @Test
    public void method1() {
        Integer i = new Integer(1);
        Integer j = new Integer(1);
        System.out.println(i == j); //false

        //Integer内部定义了一个IntegerCache结构，IntegerCache中定义Integer[]
        //保存了从-128-127范围的整数。如果我们使用自动装箱的方式，给Integer赋值的范围在其中时，
        //可以直接使用数组中的元素的地址，所以地址是一样的，不用再去new了。目的，提高效率。

        Integer m = 1;
        Integer n = 1;
        System.out.println(m == n);//true，地址值一样

        Integer x = 128;//相当于new了一个Integer对象
        Integer y = 128;//相当于new了一个Integer对象
        System.out.println(x == y);//false

    }
}
