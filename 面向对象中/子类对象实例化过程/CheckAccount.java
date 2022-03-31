package 子类对象实例化过程;

import javax.net.ssl.HostnameVerifier;

/*
 * 创建Account类的一个子类CheckAccount代表可透支的账户，该账户中定义一个属性overdraft代表可透支限额。
 * 在CheckAccount类中重写withdraw方法，其算法如下：
 * 如果（取款金额<账户余额），
 * 可直接取款
 * 如果（取款金额>账户余额），
 * 计算需要透支的额度
 * 判断可透支额overdraft是否足够支付本次透支需要，如果可以
 * 		将账户余额修改为0，冲减可透支金额
 * 如果不可以
 * 		提示用户超过可透支额的限额
 *
 */
/*
为什么子类构造器会先调用父类无参构造器?

子类的构造器的第一行默认有 一个super ()调用父类的无参数构造器，写不写都存在，是默认的；

子类继承父类，子类就得到了父类的属性和行为。
当我们调用子类构造器初始化子类对象数据的时候，必须先调用父类构造器初始化继承自父类的属性和行为。

可以在子类构造器中通过super(…)添加参数，
根据参数选择调用父类的构造器，以便调用父类构造器初始化继承自父类的数据。
如果一个类写了有参构造器，则覆盖了无参构造器
 */
public class CheckAccount extends Account{
    private double overdraft;//可透支余额
    //子类构造器
    public CheckAccount(int id, double balance, double annualInterestRate,double overdraft){
        super(id,balance,annualInterestRate);
        this.overdraft = overdraft;
    }

    public double getOverdraft() {
        return overdraft;
    }

    public void setOverdraft(double overdraft) {
        this.overdraft = overdraft;
    }

    @Override
    public void withdraw(double amount) {
        if(getBalance()>=amount){//余额足够消费
            //方式一
            // setBalance(getBalance()-amount);
            //方式二
            super.withdraw(amount);
        }else if(overdraft>=amount-getBalance()){
            super.withdraw(overdraft-(amount-getBalance()));
            setBalance(0);
        }else {
            System.out.println("超过可透支余额");
        }
    }
}
