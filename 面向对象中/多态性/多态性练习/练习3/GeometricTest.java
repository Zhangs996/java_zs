package 多态性.多态性练习.练习3;

/*
 * 定义一个测试类GeometricTest，编写equalsArea方法测试两个对象的面积是否相等（注意方法的参数类型，利用动态绑定技术），
 * 编写displayGeometricObject方法显示对象的面积（注意方法的参数类型，利用动态绑定技术）。
 *
 */
public class GeometricTest {

    public static void main(String[] args) {
        GeometricTest test = new GeometricTest();

        Circle c1 = new Circle("white",2.3,1.0);
        test.displayGeometricObject(c1);

        Circle c2 = new Circle("white",2.3,1.0);
        test.displayGeometricObject(c2);

        boolean isEqual = test.equalsArea(c1, c2);
        System.out.println("面积是否相等: " + isEqual);

        MyRectangle rect = new MyRectangle(2.1, 3.4,"red",1.0);
        test.displayGeometricObject(rect);
        boolean isEqual2 = test.equalsArea(c1,rect);
        System.out.println("面积是否相等: " + isEqual2);
    }

    public void displayGeometricObject(GeometricObject o){
        System.out.println("面积为: " + o.findArea());
    }

    //测试两个对象的面积是否相等
    public boolean equalsArea(GeometricObject o1,GeometricObject o2){
        return o1.findArea() == o2.findArea();
    }
}

