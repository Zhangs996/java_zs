package 面向对象中.多态性.向下转型;

public class Man extends Person {

    boolean isSmoking;
    int id = 1002;

    public void earnMoney(){
        System.out.println("男人负责工作养家");
    }

    public void eat() {
        System.out.println("男人多吃肉，长肌肉");
    }

    public void walk() {
        System.out.println("男人霸气的走路");
    }
}

