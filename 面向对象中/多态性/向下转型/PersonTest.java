package 面向对象中.多态性.向下转型;

import java.util.Date;

/*
x instanceof A：检验x是否为类A的对象，返回值为boolean型。
 要求x所属的类与类A必须是子类和父类的关系，否则编译错误。
 如果x属于类A的子类B，x instanceof A值也为true。
 */
/*
 * 面向对象之三:多态性
 *
 * 1.理解多态性:可以理解为一个事物的多种态性。
 * 2.何为多态性:
 * 	 对象的多态性:父类的引用指向子类的对象(或子类的对象赋值给父类的引用)
 *
 * 3.多态的使用：虚拟方法调用
 * 	有了对象多态性以后，我们在编译期，只能调用父类声明的方法，但在执行期实际执行的是子类重写父类的方法
 * 			简称：编译时，看左边；运行时，看右边。
 *
 *  若编译时类型和运行时类型不一致，就出现了对象的多态性(Polymorphism)
 *  多态情况下，
 *  	“看左边”：看的是父类的引用（父类中不具备子类特有的方法）
 *  	“看右边”：看的是子类的对象（实际运行的是子类重写父类的方法）
 *
 *  4.多态性的使用前提：
 *  	① 类的继承关系
 *  	② 方法的重写
 *  5.对象的多态性:只适用于方法，不适用于属性(编译和运行都看左边)
 */
public class PersonTest {
    public static void main(String[] args) {

        Person p1 = new Person();
        p1.eat();

        Man man = new Man();
        man.eat();
        man.age = 25;
        man.earnMoney();

        // ************************************
        System.out.println("************************");
        // 对象的多态性，父类的引用指向子类的对象
        Person p2 = new Man();//此时new Man()指向的堆空间具有person和man的所有方法和属性，但是由于对象是person，
                              // 所以只能调person中的方法和属性，当调用子父类同名同参数方法时，实际调用的是子类重写父类的方法---虚拟方法调用
                              // 有了对象的多态性以后，内存中实际上是加载了子类特有的属性和方法，但是由于变量声明为父类类型，导致
                              // 编译时，只能调用父类中声明的属性和方法。子类的属性和方法不能调用。
        // Person p3 = new Woman();
        // 多态的使用:当调用子父类同名同参数方法时，实际调用的是子类重写父类的方法---虚拟方法调用
        p2.eat();
        p2.walk();
        // 不能调用子类所特有的方法、属性。编译时，p2是Person类型，
        // p2.earnMoney();//报错

        System.out.println("**************************");

        p2.name = "Tom";
        // p2.isSmoking = true;//报错
        // 有了对象的多态性以后，内存中实际上是加载了子类特有的属性和方法，但是由于变量声明为父类类型，导致
        // 编译时，只能调用父类中声明的属性和方法。子类的属性和方法不能调用。

        // 如何才能调用子类所特有的属性和方法？
        // 使用强制类型转换符，也可称为:向下转型
        Man m1 = (Man) p2;//把person强转为man，然后调用man所特有的方法和属性，这就是向下转型
        m1.earnMoney();
        m1.isSmoking = true;

        //使用强转时，以下两行会出现ClassCastException异常,为了避免这个问题，引入instanceof关键字
        //Woman woman1 = (Woman)p2;
        //woman1.goShopping();

        /*
         * instanceof关键字的使用
         *
         * a instanceof A:判断对象a是否是类A的实例。如果，返回true，如果不是，返回false;
         *
         * 使用情境:为了避免在向下转型时出现ClassCastException异常，我们在进行向下转型之前，先进行
         * instanceof的判断,一旦返回true,就进行向下转型。如果返回false，不进行向下转型。
         *
         * 如果a instanceof A返回true,则a instanceof B也返回true。 其中类B是类A的父类。
         *
         */

        if (p2 instanceof Woman) {
            Woman w1 = (Woman) p2;
            w1.goShopping();
            System.out.println("**********Woman*********");
        }

        if (p2 instanceof Man) {
            Man m2 = (Man) p2;
            m2.earnMoney();
            System.out.println("*********Man************");
        }

        if (p2 instanceof Person) {
            System.out.println("***********Person************");
        }

        if (p2 instanceof Object) {
            System.out.println("***********object************");
        }

        //向下转型的常见问题
        //练习
        //问题1:编译时通过，运行时不通过
        //举例一编译时通过，运行时不通过
		Person p3 = new Woman();
		Man m3 = (Man)p3;

        //举例二编译时通过，运行时不通过
        Person p4 = new Person();
        Man m4 = (Man)p4;

        //问题二:编译通过，运行时也通过
        Object obj = new Woman();
        Person p = (Person)obj;

        //问题三:编译不通过
//		Man m5 = new woman();//因为woman和man没有子父类关系
//
//		String str = new Date();//因为str和Date没有子父类关系
        //不相关的两个类是不能强转的
//		Object o = new Date();
//		String str1 = (String)o;
    }
}
