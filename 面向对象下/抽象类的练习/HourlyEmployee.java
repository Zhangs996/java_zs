package 面向对象下.抽象类的练习;

public class HourlyEmployee extends Employee {
    private int wage;//每小时工资
    private int hour;

    public HourlyEmployee(){

    }
    public HourlyEmployee(String name, int number, MyDate birthday) {
        super(name, number, birthday);
    }

    @Override
    public int earnings() {
        return wage*hour;
    }

    public String toString(){
        return super.toString();
    }
}
