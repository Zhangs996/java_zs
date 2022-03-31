package 面向对象中.super详解;

public class Person {
    String name;
    int age;
    int id;
    public Person(){

    }
    public Person(String name,int age){
        this();
        this.name = name;
        this.age  = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public void eat(){
        System.out.println("人吃饭");
        walk("25");
    }
    public void walk(String distance){
        System.out.println("走了"+distance+"公里");
    }
    public Object info(){
        return null;
    }
}
