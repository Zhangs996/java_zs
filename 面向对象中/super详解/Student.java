package 面向对象中.super详解;

public class Student extends Person {
    String major;
    int id;
    public Student(String str){
        System.out.println(str);
    }
    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }
    public void eat(){
        System.out.println("学生吃饭");
    }
    public String info(){
        return "子类的返回";
    }
    public void show(){
        System.out.println(this.id+super.id);
        super.eat();
    }
    
}
