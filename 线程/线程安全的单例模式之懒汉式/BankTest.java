package 线程.线程安全的单例模式之懒汉式;
/**
 * 使用同步机制将单例模式中的懒汉式改写为线程安全的
 */
public class BankTest { }
class Bank{
    private Bank(){}
    private static Bank instance = null;
    public static Bank getInstance(){
        //快捷键:Alt+Shift+Z
        //方式二：效率较高
        if(instance == null) {
            synchronized (Bank.class) {
                if (instance == null) {
                    instance = new Bank();
                }
            }
        }
        return instance;
    }
//    public static synchronized Bank getInstance(){
//        if(instance == null){
//            instance = new Bank();
//        }
//        return instance;
//    }
}
