package 面向对象上;
/* this关键字的使用:*
 * this关键字的使用：
 * 1.可以用来修饰：属性，方法、构造器
 *
 * 2.this修饰属性和方法：
 * 	this理解为：当前对象或当前正在创建的对象
 *
 * 	2.1在类的方法中，我们可以使用"this.方法 "或"this.属性 "的方式，调用当前对象属性或方法。但是，
	 * 	通常情况下，我们都选择省略“this.”。特殊情况下，如果方法的形参和；类的属性同名时，我们必须
 * 	显示的使用“this.变量”的方式，表明此变量是属性，而非形参。
 *
 * 	2.2在类的构造器中，我们可以使用"this.方法 "或"this.属性 "的方式，调用当前正在创建的对象属性或方法。但是，
 * 	通常情况下，我们都选择省略“this.”。特殊情况下，如果方法的形参和；类的属性同名时，我们必须
 * 	显示的使用“this.变量”的方式，表明此变量是属性，而非形参。
 *
 * 3.this调用构造器
 * 	①我们在类的构造器中，可以显示的使用“this（形参列表）”方式，调用本类中指定的其他构造器
 * 	②构造器中不能通过“this（形参列表）”方式调用自己
 * 	③如果一个类中有n个构造器，则最多有n-1构造器中使用了“this（形参列表）”
 * 	④规定：“this（形参列表）”必须声明在当前构造器的首行
 * 	⑤构造器内部：最多只能声明一个“this（形参列表）”，用来调用其他的构造器
————————————————
版权声明：本文为CSDN博主「浅い陌」的原创文章，遵循CC 4.0 BY-SA版权协议，转载请附上原文出处链接及本声明。
原文链接：https://blog.csdn.net/w2019424/article/details/90737421

 */
class Person{ // 定义Person类
    String name;
    Person(String name){
        this.name = name;}

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void getInfo(){
        System.out.println("Person类 --> " + this.name) ; }
    public boolean compare(Person p){
        return this.name==p.name;
    } }
//this可以作为一个类中构造器相互调用的特殊格式
class Person1{ // 定义Person1类
    private String name ;
    private int age ;
    public Person1(){ // 无参构造器
        System.out.println("新对象实例化") ;
    }
    public Person1(String name){
        this(); // 调用本类中的无参构造器
        this.name = name ;
    }
    public Person1(String name,int age){
        this(name) ; // 调用有一个参数的构造器
        this.age = age;
    }
    public Person1(String name,int age,int legs){
        this(name,age) ; // 调用有两个参数的构造器
        this.age = age;

    }
    public String getInfo(){
        return "姓名：" + name + "，年龄：" + age ;
    }
}
public class This{
    public static void main(String args[]){
        Person per1 = new Person("张三") ;
        Person per2 = new Person("李四") ;
        per1.getInfo() ; // 当前调用getInfo()方法的对象是per1
        per2.getInfo() ; // 当前调用getInfo()方法的对象是per2
        boolean b = per1.compare(per2);
        Person1 person1 = new Person1("name");//新对象实例化
    } }