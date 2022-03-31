package 面试题.多线程.静态内部类的单例模式;

public class Singleton {
    private Singleton(){}
    private static class SingletonHolder{
        private static final Singleton singleton = new Singleton();
    }
    public static Singleton getInstance(){
        return SingletonHolder.singleton;
    }
}
