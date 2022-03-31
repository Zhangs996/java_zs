package 单元测试test;

import org.junit.Test;

/*
 * java中的JUnit单元测试
 *
 * eclipse步骤:
 * 1.选中当前项目工程 --》 右键:build path --》 add libraries --》 JUnit 4 --》 下一步
 * 2.创建一个Java类进行单元测试。
 * 	 此时的Java类要求:①此类是公共的 ②此类提供一个公共的无参构造器
 * 3.此类中声明单元测试方法。
 *   此时的单元测试方法:方法的权限是public,没有返回值，没有形参。
 *
 * 4.此单元测试方法上需要声明注解:@Test并在单元测试类中调用:import org.junit.Test;
 * 5.声明好单元测试方法以后，就可以在方法体内测试代码。
 * 6.写好代码后，左键双击单元测试方法名：右键 --》 run as --》 JUnit Test
 *
 * 说明:如果执行结果无错误，则显示是一个绿色进度条，反之，错误即为红色进度条。
 * idea步骤
 * 1.导入两个包junit-4.12.jar，hamcrest-core-1.3.jar
 * 2. 创建一个和src同级别的文件夹叫test(逻辑代码放src里，测试代码放test里是个好习惯)。
      接着在IntelliJ IDEA里还要把这个test文件夹要设置成测试文件的根目录，右键选中
      Mark Directory As - Test Sources Root
   3.
 */
public class JUnit {

    int num = 10;

    //第一个单元测试方法
    @Test
    public void testEquals(){
        String s1 = "MM";
        String s2 = "MM";
        System.out.println(s1.equals(s2));

        //ClassCastException的异常
//		Object obj = new String("GG");
//		Date date = (Date)obj;

        System.out.println(num);
        show();
    }

    @Test
    public void show(){
        num = 20;
        System.out.println("show()...");
    }

    //第二个单元测试方法
    @Test
    public void testToString(){
        String s2 = "MM";
        System.out.println(s2.toString());
    }
}

