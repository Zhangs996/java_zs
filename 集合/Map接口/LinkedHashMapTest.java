package 集合.Map接口;

/**
 * @author zhangshuo
 * @create 2021-10-12 16:20
 */
/*
 *  四、LinkedHashMap的底层实现原理（了解）
 *      源码中：
 *      static class Entry<K,V> extends HashMap.Node<K,V> {
 *            Entry<K,V> before, after;//能够记录添加的元素的先后顺序
 *            Entry(int hash, K key, V value, Node<K,V> next) {
 *               super(hash, key, value, next);
 *            }
 *        }
 */
import org.junit.Test;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapTest {

    @Test
    public void test2(){
        Map map1 = new HashMap();//无序性
        map1.put(123,"AA");
        map1.put(345,"DD");
        map1.put(12,"CC");
        map1.put(124,"ww");
        LinkedHashMap map = new LinkedHashMap();//按照添加的顺序
        map.put(123,"AA");
        map.put(345,"BB");
        map.put(12,"CC");

        System.out.println(map1);
        System.out.println(map);
    }
}
