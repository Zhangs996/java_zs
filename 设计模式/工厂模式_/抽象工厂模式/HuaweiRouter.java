package 设计模式.工厂模式_.抽象工厂模式;

/**
 * @BelongsProject: java_zs
 * @BelongsPackage: 设计模式.工厂模式_.抽象工厂模式
 * @Author: zhangshuo
 * @CreateTime: 2022-03-30 15:02
 * @Description:
 */ // 华为路由器
public class HuaweiRouter implements IRouterProduct{
    @Override
    public void start() {
        System.out.println("启动华为路由器");
    }

    @Override
    public void shutdown() {
        System.out.println("关闭华为路由器");
    }

    @Override
    public void openWifi() {
        System.out.println("打开华为Wi-Fi");
    }

    @Override
    public void setting() {
        System.out.println("华为设置");
    }
}
