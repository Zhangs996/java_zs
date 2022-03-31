package 设计模式.工厂模式_.抽象工厂模式;

/**
 * @BelongsProject: java_zs
 * @BelongsPackage: 设计模式.工厂模式_.抽象工厂模式
 * @Author: zhangshuo
 * @CreateTime: 2022-03-30 15:02
 * @Description:
 */ // 小米手机
public class XiaomiPhone implements IphoneProduct{
    @Override
    public void start() {
        System.out.println("开启小米手机");
    }

    @Override
    public void shutdown() {
        System.out.println("关闭小米手机");
    }

    @Override
    public void callup() {
        System.out.println("小米手机打电话");
    }

    @Override
    public void sendSMS() {
        System.out.println("小米手机发短信");
    }
}
