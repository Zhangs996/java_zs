package 设计模式.代理模式.静态代理模式例子2;

/**
 * @BelongsProject: java_zs
 * @BelongsPackage: 设计模式.代理模式.静态代理模式例子2
 * @Author: zhangshuo
 * @CreateTime: 2022-03-31 10:11
 * @Description:
 */
public class Client {
    public static void main(String[] args) {
        //真实业务
        UserServiceImpl userService = new UserServiceImpl();
        //代理类
        UserServiceProxy proxy = new UserServiceProxy();
        //使用代理类实现日志功能！
        proxy.setUserService(userService);

        proxy.add();
    }
}
