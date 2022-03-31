package 常用类.日期时间.DateTimeFormatter的使用;

/**
 * @author zhangshuo
 * @create 2021-10-09 18:06
 */
import org.junit.Test;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAccessor;

/**
 * jdk 8中日期时间API的测试
 */
public class JDK8DateTimeTest {

    /**
     * DateTimeFormatter:格式化或解析日期、时间
     *     类似于SimpleDateFormat
     *     方 法 描 述
     * ofPattern(String pattern) 静态方法 ， 返 回 一 个 指 定 字 符 串 格 式 的
     * DateTimeFormatter
     * format(TemporalAccessor t) 格式化一个日期、时间，返回字符串
     * parse(CharSequence text) 将指定格式的字符序列解析为一个日期、时间
     */
    @Test
    public void test3(){

        //重点： 方式三：自定义的格式。如：ofPattern(“yyyy-MM-dd hh:mm:ss”)
        DateTimeFormatter formatter3 = DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm:ss");
        //格式化
        String str4 = formatter3.format(LocalDateTime.now());
        System.out.println(str4);//2020-05-10 06:26:40

        //解析
        TemporalAccessor accessor = formatter3.parse("2020-05-10 06:26:40");
        System.out.println(accessor);

    }
}
