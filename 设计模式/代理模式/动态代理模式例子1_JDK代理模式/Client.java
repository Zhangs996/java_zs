package 设计模式.代理模式.动态代理模式例子1_JDK代理模式;

/**
 * @BelongsProject: java_zs
 * @BelongsPackage: 设计模式.代理模式.动态代理模式例子1
 * @Author: zhangshuo
 * @CreateTime: 2022-03-31 10:38
 * @Description:
 */ //租客
public class Client {

    public static void main(String[] args) {
        //真实角色
        Host host = new Host();
        //代理实例的调用处理程序
        ProxyInvocationHandler pih = new ProxyInvocationHandler();
        pih.setRent(host); //将真实角色放置进去！
        Rent proxy = (Rent)pih.getProxy(); //动态生成对应的代理类！
        proxy.rent();
    }

}
