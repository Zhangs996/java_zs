package 面向对象中.包装类的使用;

import org.junit.Test;
/*
 * 包装类的使用
 * 1.java提供了8种基本数据类型对应的包装类，使得基本数据类型的变量具有类的特征
 * 		基本数据类型		包装类
 * 		byte			Byte
 * 		short			Short
 * 		int 			Integer//特别
 * 		long			Long
 * 		float			Float
 * 		double			Double
 * 		boolean			Boolean
 * 		char			Character//特别
 * 注意:其中Byte、Short、Integer、Long、Float、Double的父类是:Number
 * 基本数据类型->包装类Integer in1 = new Integer(10)或Integer in1 = 10(自动装箱)
 * 包装类->基本数据类型int a = in1.xxxValue()或者int a = in1(自动拆箱)
 * String->包装类Integer in1 = new Integer("10"),Float f1 = new Float("31.12F")
 * 包装类->String String str = in1.toStirng(),调用包装类的toString方法，调用包装类的toString(形参)方法
 * 基本数据类型->String String.valueOf(3.4f)或者3.4+""
 * String->基本数据类型 调用相应的包装类的parsexxx(String)静态方法。或者通过包装类构造器: boolean b=new Boolean("true");
 */
public class WrapperTest {

    //String类型---> 基本数据类型、包装类,调用包装类的parseXxx()
    @Test
    public void test5(){
        String str1 = "123";
//		String str1 = "123a";

        //错误的情况，可能会报错
//		int num1 = (int)str1;
//		Integer in1 = (Integer)str1;

        int num2 = Integer.parseInt(str1);
        System.out.println(num2 + 1);	//124

        String str2 = "true";
        Boolean b1 = Boolean.parseBoolean(str2);
        System.out.println(b1);	//true

    }

    //基本数据类型、包装类---》String类型，调用String重载的valueOf(Xxx xxx)
    @Test
    public void test4(){
        int num1 = 10;
        //方式1:连接运算
        String str1 = num1 + "";
        //方式2:调用String的valueOf(Xxx xxx)
        float f1 = 12.3f;
        String str2 = String.valueOf(f1); //"12.3"

        Double d1 = new Double(12.4);
        String str3 = String.valueOf(d1);
        System.out.println(str2);
        System.out.println(str3);	//"12.4"

    }

    /*
     * JDK 5.0 新特性:自动装箱与自动拆箱
     */
    @Test
    public void test3(){
//		int num1 = 10;
//		//基本数据类型 --》 包装类的对象
//		method(num1);	//会报错，因为Object obj 不是 int

        //自动装箱:基本数据类型 --》 包装类
        int num2 = 10;
        Integer in1 = num2;//一般来说int不能直接赋值给Integer对象，这是自动装箱，不用使用Integer in1 = new Integer(10)

        boolean b1 = true;
        Boolean b2 = b1;//自动装箱

        //自动拆箱：包装类 --》 基本数据类型，不再调用包装类的xxxValue()
        System.out.println(in1.toString());

        int num3 = in1;

    }

    public void method(Object obj){
        System.out.println(obj);
    }

    //包装类 --》 基本数据类型:调用包装类的xxxValue()
    @Test
    public void test2() {
        Integer in1 = new Integer(12);
        int i1 = in1.intValue();
        System.out.println(i1 + 1);

        Float f1 = new Float(12.3f);
        float f2 = f1.floatValue();
        System.out.println(f2 + 1);
    }

    //基本数据类型--》包装类,调用包装类的构造器
    @Test
    public void test1() {
        int num1 = 10;
//		System.out.println(num1.toString());//会报错，因为 num1不是对象

        Integer in1 = new Integer(num1);
        System.out.println(in1.toString());

        Integer in2 = new Integer("123");
        System.out.println(in2.toString());//转成String类型的

        //报异常
//		Integer in3 = new Integer("123abc");
//		System.out.println(in3.toString());

        Float f1 = new Float(12.3f);
        Float f2 = new Float("12.3");
        System.out.println(f1);//12.3
        System.out.println(f2);//12.3

        Boolean b1 = new Boolean(true);
        Boolean b2 = new Boolean("true");

        Boolean b3 = new Boolean("true123");
        System.out.println(b3); //false

        Order order = new Order();
        System.out.println(order.isMale); //false
        System.out.println(order.isFemale); //null

    }
}

class Order{
    boolean isMale;
    Boolean isFemale;
}

