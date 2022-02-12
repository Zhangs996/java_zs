package 面向对象下.抽象类的练习;

public class SalariedEmployee extends Employee {

    private int monthlySalary;

    public SalariedEmployee(int monthlySalary) {
        this.monthlySalary = monthlySalary;
    }

    public SalariedEmployee(String name, int number, MyDate birthday, int monthlySalary) {
        super(name, number, birthday);
        this.monthlySalary = monthlySalary;
    }

    @Override
    public int earnings() {

        return monthlySalary;
    }

    @Override
    public String toString() {
        return "SalariedEmployee["+super.toString()+"]";
    }
}
