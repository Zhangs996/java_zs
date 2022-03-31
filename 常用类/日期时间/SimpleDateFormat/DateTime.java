package 常用类.日期时间.SimpleDateFormat;

/**
 * @author zhangshuo
 * @create 2021-10-09 14:06
 */
import org.junit.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * jdk 8 之前的日期时间的API测试
 * 1.System类中currentTimeMillis();
 * 2.java.util.Date和字类java.sql.Date
 * 3.SimpleDateFormat
 * 4.Calendar
 */
public class DateTime {
    /**
     * SimpleDateFormat的使用：SimpleDateFormat对日期Date类的格式化和解析
     * 1.两个操作
     * 1.1格式化：日期---》字符串 String format1 = sdf1.format(date);
     * 1.2解析：格式化的逆过程，字符串---》日期 Date date2 = sdf1.parse("2021-10-09 02:32:22");
     *
     * 2.SimpleDateFormat的实例化
     */
    @Test
    public void testSimpleDateFormat() throws ParseException {
        //实例化SimpleDateFormat
        SimpleDateFormat sdf = new SimpleDateFormat();
        //格式化：日期---》字符串
        Date date = new Date();
        System.out.println(date);   //Sat Oct 09 14:32:22 CST 2021

        String format = sdf.format(date);
        System.out.println(format); //2021/10/9 下午2:32

        //解析：格式化的逆过程，字符串---》日期
        String str = "2021/10/9 下午2:31";
        Date date1 = sdf.parse(str);
        System.out.println(date1);  //Sat Oct 09 14:31:00 CST 2021

        //*************按照指定的方式格式化和解析：调用带参的构造器*****************
        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        //格式化
        String format1 = sdf1.format(date);
        System.out.println(format1);    //2021-10-09 02:32:22
        //解析:要求字符串必须是符合SimpleDateFormat识别的格式(通过构造器参数体现),
        //否则，抛异常
        Date date2 = sdf1.parse("2021-10-09 02:32:22");
        System.out.println(date2);  //Sat Oct 09 02:32:22 CST 2021
    }
}
