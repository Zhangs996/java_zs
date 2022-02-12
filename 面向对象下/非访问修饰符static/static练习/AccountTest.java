package 面向对象下.非访问修饰符static.static练习;

public class AccountTest {
    public static void main(String[] args) {
        Account acc1 = new Account();
        Account acc2 = new Account("ZHANG",2000);
        System.out.println(acc1);
        System.out.println(acc2);
        //Account [id=1001, pwd=null, balance=0.0]
        //Account [id=1002, pwd=ZHANG, balance=2000.0]
    }
}
