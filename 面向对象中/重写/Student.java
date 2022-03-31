package 面向对象中.重写;

public class Student extends Person {
    String major;

    public Student(){

    }
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
    
}
