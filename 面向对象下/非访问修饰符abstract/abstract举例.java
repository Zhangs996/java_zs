package 面向对象下.非访问修饰符abstract;

/* Java 允许类设计者指定：超类声明一个方法但不提供实现，该方法的实现由子类提  供。这样的方法称为抽象方法。有一个或更多抽象方法的类称为抽象类。
 * Vehicle 是一个抽象类，有两个抽象方法。
 * 注意：抽象类不能实例化 new Vihicle()是非法的
 */
abstract class abstract样例{
    public abstract double calcFuelEfficiency();//计算燃料效率的抽象方法
    public abstract double calcTripDistance();//计算行驶距离的抽象方法
}

class Truck extends abstract样例{
    public double calcFuelEfficiency(){
        //写出计算卡车的燃料效率的具体方法
        return 0.0;
    }
    public double calcTripDistance(){
        //写出计算卡车行驶距离的具体方法
        return 0.0;
    }
}

class RiverBarge extends abstract样例 {
    public double calcFuelEfficiency() {
        //写出计算驳船的燃料效率的具体方法
        return 0.0;
    }

    public double calcTripDistance() {
        //写出计算驳船行驶距离的具体方法
        return 0.0;
    }
}