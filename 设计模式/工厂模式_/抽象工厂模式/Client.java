package 设计模式.工厂模式_.抽象工厂模式;

/**
 * @BelongsProject: java_zs
 * @BelongsPackage: 设计模式.工厂模式_.抽象工厂模式
 * @Author: zhangshuo
 * @CreateTime: 2022-03-30 15:02
 * @Description:
 */
public class Client {
    public static void main(String[] args) {
        System.out.println("小米系列产品--------------------");
        // 小米工厂
        XiaomiFactory xiaomiFactory = new XiaomiFactory();

        IphoneProduct iphoneProduct = xiaomiFactory.iphoneProduct();
        iphoneProduct.callup();
        iphoneProduct.sendSMS();

        IRouterProduct iRouterProduct = xiaomiFactory.irouterProduct();
        iRouterProduct.openWifi();

        System.out.println("华为系列产品--------------------");
        // 小米工厂
        HuaweiFactory huaweiFactory = new HuaweiFactory();

        iphoneProduct = huaweiFactory.iphoneProduct();
        iphoneProduct.callup();
        iphoneProduct.sendSMS();

        iRouterProduct = huaweiFactory.irouterProduct();
        iRouterProduct.openWifi();
    }
}
