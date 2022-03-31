package 设计模式.工厂模式_.抽象工厂模式;

/**
 * @BelongsProject: java_zs
 * @BelongsPackage: 设计模式.工厂模式_.抽象工厂模式
 * @Author: zhangshuo
 * @CreateTime: 2022-03-30 15:02
 * @Description:
 */
public class XiaomiFactory implements IProductFactory{
    @Override
    public IphoneProduct iphoneProduct() {
        return new XiaomiPhone();
    }

    @Override
    public IRouterProduct irouterProduct() {
        return new XiaomiRouter();
    }
}
