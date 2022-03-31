package 设计模式.单例模式饿汉式;

/**
 * @BelongsProject: java_zs
 * @BelongsPackage: 设计模式.单例模式饿汉式
 * @Author: zhangshuo
 * @CreateTime: 2022-03-30 11:35
 * @Description:
 */
class EagerSingleton {
    private static final EagerSingleton instance = new EagerSingleton();
    private EagerSingleton() { }

    public static EagerSingleton getInstance() {
        return instance;
    }
}
