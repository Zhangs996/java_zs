package 常用类.日期时间.Calendar日历类;

/**
 * @author zhangshuo
 * @create 2021-10-09 14:39
 */
/*
Calendar是一个抽象基类，主用用于完成日期字段之间相互操作的功能。
获取Calendar实例的方法
使用Calendar.getInstance()方法
调用它的子类GregorianCalendar的构造器。
一个Calendar的实例是系统时间的抽象表示，通过get(intfield)方法来取得想要的时间信息。比如YEAR、MONTH、DAY_OF_WEEK、HOUR_OF_DAY 、MINUTE、SECOND
public void set(intfield,intvalue)
public void add(intfield,intamount)
public final Date getTime()
public final void setTime(Date date)
注意:
获取月份时：一月是0，二月是1，以此类推，12月是11
获取星期时：周日是1，周二是2，。。。。周六是7
 */
import org.junit.Test;

import java.util.Calendar;
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
     * Calendar日历类的使用
     */
    @Test
    public void testCalendar(){
        //1.实例化
        //方式一：创建其子类（GregorianCalendar）的对象
        //方式二：调用其静态方法getInstance()
        Calendar calendar = Calendar.getInstance();

//        System.out.println(calendar.getClass());    //class java.util.GregorianCalendar

        //2.常用方法
        //get()
        int days = calendar.get(Calendar.DAY_OF_MONTH);
        System.out.println(days);   //9
        System.out.println(calendar.get(Calendar.DAY_OF_YEAR)); //282,今天是这一年的282天

        //set()
        //calendar可变性
        calendar.set(Calendar.DAY_OF_MONTH,22);
        days = calendar.get(Calendar.DAY_OF_MONTH);
        System.out.println(days);   //22

        //add()
        calendar.add(Calendar.DAY_OF_MONTH,-3);
        days = calendar.get(Calendar.DAY_OF_MONTH);
        System.out.println(days);   //22-3 = 19

        //getTime():日历类---> Date
        Date date = calendar.getTime();
        System.out.println(date);   //Tue Oct 19 14:42:20 CST 2021

        //setTime():Date ---> 日历类
        Date date1 = new Date();
        calendar.setTime(date1);
        days = calendar.get(Calendar.DAY_OF_MONTH);
        System.out.println(days);   //9
    }
}
