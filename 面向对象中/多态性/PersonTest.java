package 多态性;

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
 *
 *  5.对象的多态性:只适用于方法，不适用于属性(属性编译和运行都看左边)
 */
public class PersonTest {
    public static void main(String[] args) {

        Person p1 = new Person();
        p1.eat();

        Man man = new Man();
        man.eat();
        man.age = 25;
        man.earnMoney();

        //************************************
        //对象的多态性，父类的引用指向子类的对象
        Person p2 = new Man();
        Person p3 = new Woman();
        //多态的使用:当调用子父类同名同参数方法时，实际调用的是子类重写父类的方法---虚拟方法调用
        System.out.println(p2.id);//1001,输出的是父类的id。对象的多态性:只适用于方法，不适用于属性(属性编译和运行都看左边)
        System.out.println(man.id);//1002
        p2.eat();
        p2.walk();

//	p2.earnMoney();

    }
}

