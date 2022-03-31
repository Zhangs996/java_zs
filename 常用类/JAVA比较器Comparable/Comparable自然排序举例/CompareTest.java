package 常用类.JAVA比较器Comparable.Comparable自然排序举例;

/**
 * @author zhangshuo
 * @create 2021-10-09 18:53
 */
import org.junit.Test;
import java.util.Arrays;

public class CompareTest {

    /**
     * Comparable接口的使用举例：  自然排序
     * 1.像String、包装类等实现了Comparable接口，重写了compareTo(obj)方法，给出了比较两个对象大小的方式。
     * 2.像String、包装类重写compareTo()方法以后，进行了从小到大的排列
     * 3. 重写compareTo(obj)的规则：
     *    如果当前对象this大于形参对象obj，则返回正整数，
     *    如果当前对象this小于形参对象obj，则返回负整数，
     *    如果当前对象this等于形参对象obj，则返回零。
     *
     */
    @Test
    public void test1(){
        String[] arr = new String[]{"AA","CC","KK","MM","GG","JJ","DD"};

        Arrays.sort(arr);

        System.out.println(Arrays.toString(arr));//[AA, CC, DD, GG, JJ, KK, MM]
    }

}
