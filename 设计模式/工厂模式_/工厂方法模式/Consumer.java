package 设计模式.工厂模式_.工厂方法模式;

/**
 * @BelongsProject: java_zs
 * @BelongsPackage: 设计模式.工厂模式_.工厂方法模式
 * @Author: zhangshuo
 * @CreateTime: 2022-03-30 14:51
 * @Description:
 */
public class Consumer {
    public static void main(String[] args) {
        Car car = new WulingFactory().getCar();
        Car car1 = new TeslaFactory().getCar();

        car.name();
        car1.name();

        Car car2 = new MoBaiFactory().getCar();
        car2.name();
    }
}
