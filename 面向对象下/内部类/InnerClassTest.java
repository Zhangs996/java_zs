package 面向对象下.内部类;

/*
 * 类的内部成员之五:内部类
 *
 * 1.Java中允许将一个类A声明在另一个类B中,则类A就是内部类,类B就是外部类.
 *
 * 2.内部类的分类:成员内部类	VS	局部内部类(方法内、代码块内、构造器内)
 *
 * 3.成员内部类
 * 	》作为外部类的成员,
 * 		- 调用外部类的结构
 * 		- 可以被static修饰
 * 		- 可以被4种不同的权限修饰
 *
 *  》作为一个类，
 *  	- 类内可以定义属性、方法、构造器等
 *  	- 可以被final修饰，表示此类不能被继承。言外之意，不使用final，就可以被继承
 *  	- 可以abstract修饰
 *
 * 4.关注如下的3个问题
 *   》 如何实例化成员内部类的对象
 *   》 如何在成员内部类中区分调用外部类的结构
 *   》 开发中局部内部类的使用  见《InnerClassTest1.java》
 */
public class InnerClassTest {
    public static void main(String[] args) {

        //创建Dog实例(静态的成员内部类)
        Person.Dog dog = new Person.Dog();
        dog.show();

        //创建Bird实例(非静态的成员内部类)
//		Person.Bird bird = new Person.Bird();//会报错，因为要调用非静态只能先new一个实例
        Person p = new Person();
        Person.Bird bird = p.new Bird();
        bird.sing();

        System.out.println();

        bird.display("喜鹊");
    }
}
 class Person{
    String name = "李雷";
    int age;

    public void eat(){
        System.out.println("人，吃饭");
    }
    public static void walk(){

    }

    //静态成员内部类
    static class Dog{
        String name;
        int age;

        public void show(){
            System.out.println("卡拉是条狗");
//			eat();
        }

    }

    //非静态成员内部类
    class Bird{
        String name = "杜鹃";
        public Bird(){

        }

        public void sing(){
            //成员内部类调用外部类的方法
            System.out.println("我是一只猫头鹰");
            Person.this.eat();//调用外部类的非静态方法
            Person.walk();//调用外部类的静态方法
            eat();
            System.out.println(age);
        }

        public void display(String name){
            //成员内部类调用外部类的属性
            System.out.println(name);	//方法的形参
            System.out.println(this.name);	//内部类的属性
            System.out.println(Person.this.name);	//外部类的属性
        }
    }
    public void method(){
        //局部内部类
        class AA{

        }
    }

    //声明在代码块中
    {
        //局部内部类
        class BB{

        }
    }

    //声明在构造器
    public Person(){
        //局部内部类
        class CC{

        }
    }
}
