package 面向对象下.非访问修饰符static;

/*
栈结构放局部变量
堆放new出来的结构（对象和数组）
方法区放常量池，静态域，类的加载信息
 * 4.使用 static 修饰方法:静态方法
 * 		① 随着类的加载而加载，可以通过"类.静态方法"的方式调用
 * 		② 			静态方法		非静态方法
 * 			类名.	    yes		    no
 * 			对象.		yes			yes
 * 		③ 静态方法中，只能调用静态的方法或属性.在静态的方法内，不能使用 this 关键字、super 关键字
 * 		  非静态的方法中，可以调用所有的方法或属性
 *
 * 5.static 注意点:
 * 	 5.1 在静态的方法内，不能使用 this 关键字、super 关键字
 *   5.2 关于静态属性和静态方法的使用，大家从生命周期的角度去理解。
 *
 * 6.开发中，如何确定一个属性是否需要声明 static 的？
 * 	 》 属性是可以被多个对象所共享的，不会随着对象的不同而不同的。
 * 	 》 类中的常量也常常声明为 static
 *
 *   开发中，如何确定一个方法是否要声明为 static 的？
 *   》 操作静态属性的方法，通常设置为 static 的
 *   》 工具类中的方法，习惯上声明为 static 的。比如：Math、Arrays、Collections
 *
 */
public class StaticTest2 {
    String name;
    static String kuu;
    public static void main(String[] args) {

        Chinese1.nation = "中国";

        Chinese1 c1 = new Chinese1();

        //编译不通过
//		Chinese.name = "张继科";

        c1.eat();
        eat1();
        StaticTest2.eat1();
        //eat2();//出错
        //StaticTest2.eat2();//出错

        StaticTest2 t1 = new StaticTest2();
        t1.eat2();//可以
        t1.eat1();//可以


        Chinese1.show();
        //编译不通过
//		chinese1.eat();
//		Chinese1.info();
    }
    public static void eat1(){
        System.out.println("eat1");

    }
    public void eat2(){
        System.out.println("eat2");
    }
}
//中国人
class Chinese1{

    String name;
    int age;
    static String nation;

    public void eat(){
        System.out.println("中国人吃中餐");
        //调用非静态结构
        this.info();
        info();
        System.out.println("name : " + name);
        //调用静态结构
        walk();
        System.out.println("nation : " + Chinese1.nation);
    }

    public static void show(){
        System.out.println("我是一个中国人！");
//		eat();
//		name = "Tom";
        //可以调用静态的结构
        System.out.println(Chinese1.nation);
        walk();
    }

    public void info(){
        System.out.println("name : " + name + ",age : " + age);
    }

    public static void walk(){
        System.out.println("walk");
    }
}

