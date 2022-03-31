package 常用类.日期时间.终极版LocalDate和LocalTime和LocalDateTime的使用;

/**
 * @author zhangshuo
 * @create 2021-10-09 14:52
 */
/*
LocalDate、LocalTime、LocalDateTime类是其中较重要的几个类，它们的实例是不可变的对象，
分别表示使用ISO-8601日历系统的日期、时间、日期和时间。它们提供了简单的本地日期或时间，并不包含当前的时间信息，也不包含与时区相关的信息。
LocalDate代表IOS格式（yyyy-MM-dd）的日期,可以存储生日、纪念日等日期。
LocalTime表示一个时间，而不是日期。
LocalDateTime是用来表示日期和时间的，这是一个最常用的类之一。
注：ISO-8601日历系统是国际标准化组织制定的现代公民的日期和时间的表示法，也就是公历。

方法 描述
now() / * now(ZoneId zone)        静态方法，根据当前时间创建对象/指定时区的对象
of()                              静态方法，根据指定日期/时间创建对象
getDayOfMonth()/getDayOfYear()    获得月份天数(1-31) /获得年份天数(1-366)
getDayOfWeek()                    获得星期几(返回一个 DayOfWeek 枚举值)
getMonth()                        获得月份, 返回一个 Month 枚举值
getMonthValue() / getYear()       获得月份(1-12) /获得年份
getHour()/getMinute()/getSecond() 获得当前对象对应的小时、分钟、秒
withDayOfMonth()/withDayOfYear()/
withMonth()/withYear()                将月份天数、年份天数、月份、年份修改为指定的值并返回新的对象
plusDays(), plusWeeks(),
plusMonths(), plusYears(),plusHours() 向当前对象添加几天、几周、几个月、几年、几小时
minusMonths() / minusWeeks()/
minusDays()/minusYears()/minusHours() 从当前对象减去几月、几周、几天、几年、几小时
 */

import org.junit.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

/**
 * jdk 8中日期时间API的测试
 */
public class JDK8DateTimeTest {

    /**
     * LocalDate、LocalTime、LocalDateTime的使用
     *
     */
    @Test
    public void test1(){
        //now():获取当前的日期、时间、日期+时间
        LocalDate localDate = LocalDate.now();
        LocalTime localTime = LocalTime.now();
        LocalDateTime localDateTime = LocalDateTime.now();

        System.out.println(localDate);//2021-10-09
        System.out.println(localTime);//17:35:14.008236300
        System.out.println(localDateTime);//2021-10-09T17:35:14.008236300

        //of():设置指定的年、月、日、时、分、秒。没有偏移量
        LocalDateTime localDateTime1 = LocalDateTime.of(2020, 10, 6, 13, 23, 43);
        System.out.println(localDateTime1);//2020-10-06T13:23:43

        //getXxx()：获取相关的属性
        System.out.println(localDateTime.getDayOfMonth());//9
        System.out.println(localDateTime.getDayOfWeek());//SATURDAY
        System.out.println(localDateTime.getMonth());//OCTOBER
        System.out.println(localDateTime.getMonthValue());//10
        System.out.println(localDateTime.getMinute());//35

        //体现不可变性
        //withXxx():设置相关的属性
        LocalDate localDate1 = localDate.withDayOfMonth(22);
        System.out.println(localDate);
        System.out.println(localDate1);

        LocalDateTime localDateTime2 = localDateTime.withHour(4);
        System.out.println(localDateTime);
        System.out.println(localDateTime2);

        //不可变性
        LocalDateTime localDateTime3 = localDateTime.plusMonths(3);
        System.out.println(localDateTime);
        System.out.println(localDateTime3);

        LocalDateTime localDateTime4 = localDateTime.minusDays(6);
        System.out.println(localDateTime);
        System.out.println(localDateTime4);
    }
}
