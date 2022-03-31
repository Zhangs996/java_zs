package 异常.常见异常;

/**
 * @author zhangshuo
 * @create 2021-09-30 20:34
 */

import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;
import java.util.Scanner;

/*
 * 一、java异常体系结构
 *
 * java.lang.Throwable
 * 		|----java.lang.Error:一般不编写针对性的代码进行处理
 * 		|----java.lang.Exception:可以进行异常处理
 * 			|----编译时异常(checked)
 * 				|----IOEXception
 * 					|----FileNotFoundException
 * 				|----ClassNotFoundException
 * 			|----运行时异常(unchecked)
 * 				|----NullPointerException
 * 				|----ArrayIndexOutOfBoundsException
 * 				|----ClassCaseException
 * 				|----NumberFormatException
 * 				|----InputMismatchException
 * 				|----ArithmaticException
 *
 * 面试题:常见的异常有哪些？举例说明
 *
 */
public class ExceptionTest {

    // ******************以下是编译时异常***************************
    @Test
    //java.io.FileNotFoundException: hello.txt (系统找不到指定的文件。)
    public void test7() throws IOException {
		File file = new File("hello.txt");
		FileInputStream fis = new FileInputStream(file);

		int data = fis.read();
		while(data != -1){
			System.out.print((char)data);
			data = fis.read();
		}

		fis.close();
    }

    // ******************以下是运行时异常，编译是不报错的，左边没有X***************************
    // ArithmeticException算数异常
    @Test
    public void test6() {
        int a = 10;
        int b = 0;
        System.out.println(a / b);
    }

    // InputMismatchException输入不匹配
    @Test
    public void test5() {
        Scanner scanner = new Scanner(System.in);
        int score = scanner.nextInt();//如果控制输入不是int的，是别的，报输入不匹配异常
        System.out.println(score);

        scanner.close();
    }

    // NumberFormatException数字格式异常
    @Test
    public void test4() {
        String str = "123";
        str = "abc";
        int num = Integer.parseInt(str);
    }

    // ClassCaseException类型转换异常
    @Test
    public void test3() {
        Object obj = new Date();
        String str = (String)obj;
    }

    // ArrayIndexOutOfBoundsException
    @Test
    public void test2() {
        //java.lang.ArrayIndexOutOfBoundsException:
         int[] arr = new int[10];
         System.out.println(arr[10]);

        //java.lang.StringIndexOutOfBoundsException:
         String str = "abc";
         System.out.println(str.charAt(3));
    }

    // NullPointerException;java.lang.NullPointerException:
    @Test
    public void test1() {

         int[] arr = null;
         System.out.println(arr[3]);

         String str = "abc";
         str = null;
         System.out.println(str.charAt(0));
    }
}
