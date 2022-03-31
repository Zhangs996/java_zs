package 设计模式.代理模式.静态代理模式例子1;

/**
 * @BelongsProject: java_zs
 * @BelongsPackage: 设计模式.代理模式
 * @Author: zhangshuo
 * @CreateTime: 2022-03-31 10:07
 * @Description:
 */ //客户类，一般客户都会去找代理！
public class Client {
    public static void main(String[] args) {
        //房东要租房
        Host host = new Host();
        //中介帮助房东
        Proxy proxy = new Proxy(host);

        //你去找中介！
        proxy.rent();
    }
}
