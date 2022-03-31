package 设计模式.适配器模式;

/**
 * @BelongsProject: java_zs
 * @BelongsPackage: 设计模式.适配器模式
 * @Author: zhangshuo
 * @CreateTime: 2022-03-31 09:48
 * @Description:
 */ //真正的适配器，需要连接USB,连接网线~
public class Adapter extends Adaptee implements NetToUsb {
    @Override
    public void handleRequest() {
        //上网的具体实现，找一个转接头
        super.request();
    }
}
