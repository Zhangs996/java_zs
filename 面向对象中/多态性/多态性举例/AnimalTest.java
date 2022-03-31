package 多态性.多态性举例;

public class AnimalTest {
    public static void main(String[] args) {
        AnimalTest test = new AnimalTest();
        test.func(new Dog());//虽然声明的是animal，但是new的是dog。
                            // 所以func函数参数是anmal，只能调用animal的方法，但是实参是dog，所以执行的是dog重写的animal的方法

    }
    public void func(Animal animal){
        animal.eat();
        animal.shout();

    }
    //如果没有多态性，就会写很多如下的方法，去调用
    public void func(Dog dog){
        dog.eat();
        dog.shout();
    }

    public void func(Cat cat){
        cat.eat();
        cat.shout();
    }
}
class Animal{

    public void eat(){
        System.out.println("动物进食");
    }
    public void shout(){
        System.out.println("动物叫");
    }
}
class Dog extends Animal{
    public void eat(){
        System.out.println("狗进食");
    }
    public void shout(){
        System.out.println("狗叫");
    }
}

class Cat extends Animal{
    public void eat(){
        System.out.println("猫吃鱼");
    }

    public void shout() {
        System.out.println("喵！喵！喵！");
    }
}
