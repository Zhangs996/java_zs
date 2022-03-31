package 设计模式.代理模式.使用动态代理实现代理我们后面写的UserService;

import 设计模式.代理模式.静态代理模式例子2.UserService;
import 设计模式.代理模式.静态代理模式例子2.UserServiceImpl;

/**
 * @BelongsProject: java_zs
 * @BelongsPackage: 设计模式.代理模式.使用动态代理实现代理我们后面写的UserService
 * @Author: zhangshuo
 * @CreateTime: 2022-03-31 11:27
 * @Description:
 */
public class Test {
    public static void main(String[] args) {
        //真实对象
        UserServiceImpl userService = new UserServiceImpl();
        //代理对象的调用处理程序
        ProxyInvocationHandler pih = new ProxyInvocationHandler();
        pih.setTarget(userService); //设置要代理的对象
        UserService proxy = (UserService)pih.getProxy(); //动态生成代理类！
        proxy.delete();
    }
}
