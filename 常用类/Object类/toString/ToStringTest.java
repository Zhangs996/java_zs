package 常用类.Object类.toString;

import java.util.Date;

/*
 * Object类中toString()的使用
 *
 * 1.当我们输出一个引用对象时，实际上就是调用当前对象的toString()
 * 2.Object类中toString的定义方法
 * 	public String toString() {
 *      return getClass().getName() + "@" + Integer.toHexString(hashCode());
 *  }
 *
 * 3.像String、Date、File、包装类等都重写了Object类中的toString()方法。
 * 	 使得在调用toString()时，返回"实体内容"信息.
 *
 * 4.自定义类如果重写toString()方法，当调用此方法时，返回对象的"实体内容".
 */
public class ToStringTest {
    public static void main(String[] args) {

        Customer cust1 = new Customer("Tom" ,21);
        System.out.println(cust1.toString());	//输出的是Customer [name=Tom, age=21]，没有输出"面向对象中.Object类.toString.Customer@7adf9f5f"，因为重写了toString()
        System.out.println(cust1); 	//Customer [name=Tom, age=21]

        String str = new String("MM");
        System.out.println(str);

        Date date = new Date(45362348664663L);
        System.out.println(date.toString());	//Wed Jun 24 12:24:24 CST 3407

        char[] arr = new char[] { 'a', 'b', 'c' };
        System.out.println(arr);//abc
        System.out.println(arr.toString());//[C@b4c966a
        int[] arr1 = new int[] { 1, 2, 3 };
        System.out.println(arr1);//[I@1d81eb93
        System.out.println(arr1.toString());//[I@1d81eb93
        double[] arr2 = new double[] { 1.1, 2.2, 3.3 };
        System.out.println(arr2);//[D@2f4d3709
        System.out.println(arr2.toString());//[D@2f4d3709
    }
}

