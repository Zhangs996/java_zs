package 设计模式.工厂模式_.抽象工厂模式;

/**
 * @BelongsProject: java_zs
 * @BelongsPackage: 设计模式.工厂模式_.抽象工厂模式
 * @Author: zhangshuo
 * @CreateTime: 2022-03-30 15:02
 * @Description:
 */ // 抽象产品工厂
public interface IProductFactory {

    // 生产手机
    IphoneProduct iphoneProduct();

    // 生产路由器
    IRouterProduct irouterProduct();

}
