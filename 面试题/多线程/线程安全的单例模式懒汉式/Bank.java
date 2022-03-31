package 面试题.多线程.线程安全的单例模式懒汉式;

public class Bank{
    private Bank(){}
    private volatile static Bank instance = null;
    public static Bank getInstance(){
        if(instance == null) {
            synchronized (Bank.class) {
                if (instance == null) {
                    instance = new Bank();
                }
            }
        }
        return instance;
    }
}
