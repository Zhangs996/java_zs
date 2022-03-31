package 设计模式.适配器模式;

/**
 * @BelongsProject: java_zs
 * @BelongsPackage: 设计模式.适配器模式
 * @Author: zhangshuo
 * @CreateTime: 2022-03-31 09:48
 * @Description:
 */ //真正的适配器，需 要连接USB,连接网线~
public class Adapter2 implements NetToUsb {
    //组合模式
    private Adaptee adaptee;

    public Adapter2(Adaptee adaptee) {
        this.adaptee = adaptee;
    }
    @Override
    public void handleRequest() {
        //上网的具体实现，找一个转接头
        adaptee.request();//可以上网
    }
}
