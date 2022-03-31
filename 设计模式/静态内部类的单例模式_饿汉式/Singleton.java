package 设计模式.静态内部类的单例模式_饿汉式;


// 静态内部类的单例模式_饿汉式是不安全的，因为存在反射

import java.lang.reflect.Constructor;

public class Singleton {
    private Singleton(){}
    private static class SingletonHolder{
        private static final Singleton singleton = new Singleton();
    }
    public static Singleton getInstance(){
        return SingletonHolder.singleton;
    }

    public static void main(String[] args) throws Exception {
        Singleton instance1 = Singleton.getInstance();


        Constructor<Singleton> declaredConstructor = Singleton.class.getDeclaredConstructor(null);
        declaredConstructor.setAccessible(true);
        Singleton instance2 = declaredConstructor.newInstance();

        System.out.println(instance1 == instance2);//false
    }


}
