package 设计模式.代理模式.静态代理模式例子1;

/**
 * @BelongsProject: java_zs
 * @BelongsPackage: 设计模式.代理模式
 * @Author: zhangshuo
 * @CreateTime: 2022-03-31 10:07
 * @Description:
 */ //代理角色：中介
public class Proxy implements Rent {

    private Host host;
    public Proxy() { }
    public Proxy(Host host) {
        this.host = host;
    }

    //租房
    public void rent(){
        seeHouse();
        host.rent();
        fare();
    }
    //看房
    public void seeHouse(){
        System.out.println("带房客看房");
    }
    //收中介费
    public void fare(){
        System.out.println("收中介费");
    }
}
