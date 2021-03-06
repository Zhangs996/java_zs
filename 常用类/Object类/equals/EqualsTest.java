package 常用类.Object类.equals;

import java.sql.Date;

/*
 * 面试题: ==和equals的区别
 *
 * 一、回顾==的使用
 * == : 运算符
 * 1.可以使用在基本数据类型变量和引用数据类型变量中
 * 2.如果比较的是基本数据类型变量：比较两个变量保存的数据是否相等。(不一定类型要相同,比如10.0===10，char类型的先转化ascii码再比较，boolean和其他不能用==)
 * 	 如果比较的是引用数据类型变量：比较两个对象的地址值是否相同,即两个引用是否指向同一个对象实体
 *  补充: == 符号使用时，必须保证符号左右两边的变量类型一致。
 *
 * 二、equals()方法的使用
 * 1.是一个方法，而非运算符
 * 2.只能适用于引用数据类型。
 * 3.Object类中equals()的定义：
 * 		public boolean equals(Object obj){
 * 			return (this == obj);
 * 		}
 * 说明：Object类中定义的equals()和==的作用是相同的，比较两个对象的地址值是否相同，即两个引用是否指向同一个对象实体。
 *
 * 4.像String、Date、File、包装类等都重写了Object类中的equals()方法.
 * 	 两个引用的地址是否相同，而是比较两个对象的“实体内容”是否相同。
 *
 * 5.通常情况下，我们自定义的类如果使用equals()的话，也通常是比较两个对象的"实体内容"是否相同。那么，我们
 * 	   就需要对Object类中的equals()进行重写。
 *
 * 重写的原则:比较两个对象的实体内容是否相同。
 *
    重写equals()方法的原则
     对称性：如果x.equals(y)返回是“true”，那么y.equals(x)也应该返回是“true”。
     自反性：x.equals(x)必须返回是“true”。
     传递性：如果x.equals(y)返回是“true”，而且y.equals(z)返回是“true”，那么z.equals(x)也应该返回是“true”。
     一致性：如果x.equals(y)返回是“true”，只要x和y内容一直不变，不管你重复x.equals(y)多少次，返回都是“true”。
     任何情况下，x.equals(null)，永远返回是“false”； x.equals(和x不同类型的对象)永远返回是“false”。
 */
public class EqualsTest {
    public static void main(String[] args) {

        //基本数据类型
        int i = 10;
        int j = 10;
        double d = 10.0;
        System.out.println(i == j);	//true
        System.out.println(i == d); //true

//		boolean b =true;
//		System.out.println(i == b);

        char c = 10;
        System.out.println(i == c); //true

        char c1 = 'A';
        char c2 = 65;
        System.out.println(c1 == c2); //true

        //引用数据类型
        Customer cust1 = new Customer("Tom" ,21);
        Customer cust2 = new Customer("Tom" ,21);
        System.out.println(cust1 == cust2); //false
        System.out.println(cust1.equals(cust2));	//false，这个没重写过
        System.out.println("*************************");

        String str1 = new String("BAT");
        String str2 = new String("BAT");
        System.out.println(str1 == str2); //false
        System.out.println(str1.equals(str2));	//true，这个重写过
        System.out.println("*************************");

        Date date1 = new Date(23432525324L);
        Date date2 = new Date(23432525324L);
        System.out.println(date1.equals(date2));	//true
    }
}
