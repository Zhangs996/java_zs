package 设计模式.工厂模式_.简单工厂模式;

/**
 * @BelongsProject: java_zs
 * @BelongsPackage: 设计模式.工厂模式_.简单工厂模式
 * @Author: zhangshuo
 * @CreateTime: 2022-03-30 14:44
 * @Description:
 */
public class Consumer {
    public static void main(String[] args) {
        // 接口，所有的实现类
        // Car car = new WuLing();
        // Car car1 = new Tesla();

        // 2、使用工厂创建
        Car car = CarFactory.getCar("wuling");
        Car car1 = CarFactory.getCar("tesila");

        car.name();
        car1.name();
    }
}
