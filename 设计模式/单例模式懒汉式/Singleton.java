package 设计模式.单例模式懒汉式;

import java.lang.reflect.Constructor;

/**
 * @BelongsProject: java_zs
 * @BelongsPackage: 设计模式.单例模式懒汉式
 * @Author: zhangshuo
 * @CreateTime: 2022-03-30 11:19
 * @Description:
 */

//想要彻底解决反射，那么就需要用到枚举类，enum本质是什么，本质是class，反射不能破坏枚举的单例模式
public class Singleton{
    private Singleton(){}
    private volatile static Singleton instance = null;
    public static Singleton getInstance(){
        if(instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();//如果是 private static Singleton instance = null;那么new Singleton()不是原子性操作
                    /** new Singleton()有三步
                     * 1. 分配内存空间
                     * 2. 执行构造方法， 初始化方法
                     * 3. 把这个对象指向这个空间
                     *
                     * 123(期望)
                     * 132(实际)，比如线程A走的是13还没走到2，这时候线程B来了，认为Singleton不为空，直接return instance，但是此时Singleton还没完成构造
                     * private volatile static Singleton instance = null; 所以这一行必须加volatile，这样就保证不会指令重拍
                     */
                }
            }
        }
        return instance;
    }

    public static void main(String[] args) throws Exception {
        Singleton instance1 = Singleton.getInstance();


        Constructor<Singleton> declaredConstructor = Singleton.class.getDeclaredConstructor(null);
        declaredConstructor.setAccessible(true);
        Singleton instance2 = declaredConstructor.newInstance();

        System.out.println(instance1 == instance2);//false

        Singleton instance3 = Singleton.getInstance();
        Singleton instance4 = Singleton.getInstance();
        System.out.println(instance3 == instance4);//true

    }
}