package 常用类.日期时间.Instant类的使用;

/**
 * @author zhangshuo
 * @create 2021-10-09 17:58
 */
import org.junit.Test;

import java.time.*;

/**
 * jdk 8中日期时间API的测试
 *  Instant：时间线上的一个瞬时点。 这可能被用来记录应用程序中的事件时间戳。
 *  在处理时间和日期的时候，我们通常会想到年,月,日,时,分,秒。然而，这只是
 * 时间的一个模型，是面向人类的。第二种通用模型是面向机器的，或者说是连
 * 续的。在此模型中，时间线中的一个点表示为一个很大的数，这有利于计算机
 * 处理。在UNIX中，这个数从1970年开始，以秒为的单位；同样的，在Java中，
 * 也是从1970年开始，但以毫秒为单位。
 *  java.time包通过值类型Instant提供机器视图，不提供处理人类意义上的时间
 * 单位。Instant表示时间线上的一点，而不需要任何上下文信息，例如，时区。
 * 概念上讲，它只是简单的表示自1970年1月1日0时0分0秒（UTC）开始的秒
 * 数。因为java.time包是基于纳秒计算的，所以Instant的精度可以达到纳秒级。
 *  (1 ns = 10-9 s) 1秒 = 1000毫秒 =10^6微秒=10^9纳秒
 */
public class JDK8DateTimeTest {

    /**
     * Instant的使用
     */
    @Test
    public void test2(){
        //now():获取本初子午线对应的标准时间
        Instant instant = Instant.now();
        System.out.println(instant);    //2020-05-10T09:55:55.561Z,比中国早8个小时

        //添加时间的偏移量
        OffsetDateTime offsetDateTime = instant.atOffset(ZoneOffset.ofHours(8));//东八区
        System.out.println(offsetDateTime); //2020-05-10T18:00:00.641+08:00

        //toEpochMilli():获取自1970年1月1日0时0分0秒（UTC）开始的毫秒数  ---> Date类的getTime()
        long milli = instant.toEpochMilli();
        System.out.println(milli);  //1589104867591

        //ofEpochMilli():通过给定的毫秒数，获取Instant实例  -->Date(long millis)
        Instant instant1 = Instant.ofEpochMilli(1550475314878L);
        System.out.println(instant1);   //2019-02-18T07:35:14.878Z
    }
}

