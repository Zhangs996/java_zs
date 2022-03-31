package 集合.Collection子接口Set.Set的无序性与不可重复性的理解;

import org.junit.Test;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 *
 * 1.Set接口中没有定义额外的方法，使用的都是Collection中声明过的方法。
 *
 */
public class SetTest {

    /**
     * 一、Set:存储无序的、不可重复的数据
     *      1.无序性：不等于随机性。存储的数据在底层数组中并非按照数组索引的顺序添加，而是根据数据的哈希值决定的。
     *
     *      2.不可重复性：保证添加的元素按照equals()判断时，不能返回true.即：相同的元素只能添加一个。
     *
     * 二、添加元素的过程：以HashSet为例：
     *      添加1000个元素的时候，要跟前面的999个比较，太慢
     *      所以添加元素的时候要考虑hash值（类的hashcode）
     *
     *
     *
     *  1.Set接口都是使用Collection的方法
     *  2.要求：向Set(主要指：HashSet、LinkedHashSet)中添加的数据，其所在的类一定要重写hashCode()和equals()
     *     要求：重写的hashCode()和equals()尽可能保持一致性：相等的对象必须具有相等的散列码
     *     重写两个方法的小技巧：对象中用作 equals() 方法比较的 Field，都应该用来计算 hashCode 值。
     */

    @Test
    public void test(){
        Set set = new HashSet();
        set.add(123);
        set.add(456);
        set.add("fgd");
        set.add("book");
        set.add(new User("Tom",12));
        set.add(new User("Tom",12));
        set.add(129);
        set.add("fgd");//虽然没报错，但是也添加不进去

        Iterator iterator = set.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
        /*
        无序性
        129
        fgd
        book
        456
        123
        User{name='Tom', age=12}
         */
    }
}
