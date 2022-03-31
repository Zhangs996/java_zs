package 设计模式.工厂模式_.简单工厂模式;

/**
 * @BelongsProject: java_zs
 * @BelongsPackage: 设计模式.工厂模式_.简单工厂模式
 * @Author: zhangshuo
 * @CreateTime: 2022-03-30 14:44
 * @Description:
 */ // 静态工厂模式
// 开闭原则
public class CarFactory {

    // 方法一： 不满足开闭原则
    public static Car getCar(String car){
        if(car.equals("wuling")){
            return new WuLing();
        }else if(car.equals("tesila")){
            return new Tesla();
        }else {
            return null;
        }
    }

    // 方法二：
    public static Car geyWuling(){
        return new WuLing();
    }
    public static Car geyTesla(){
        return new Tesla();
    }


}
