package 面向对象中.继承;
import java.util.Date;
public class 继承 {
}
class Person {
    public String name;
    public int age;
    public Date birthDate;

    public String getInfo() {
        return "0";
    }
}
//Student类继承了父类Person的所有属性和方法，并增加了一个属性school。Person中的属性和方法,Student都可以使用。
class Student extends Person {
    public String school;

    }
