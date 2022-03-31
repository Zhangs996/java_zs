package 集合.集合框架涉及到的API.Collection接口方法;

/*
添加
add(Objec tobj)
addAll(Collection coll)

获取有效元素的个数
int size()

清空集合
void clear()

是否是空集合
boolean isEmpty()

是否包含某个元素
boolean contains(Object obj)：是通过元素的equals方法来判断是否是同一个对象
boolean containsAll(Collection c)：也是调用元素的equals方法来比较的。拿两个集合的元素挨个比较。

删除
boolean remove(Object obj) ：通过元素的equals方法判断是否是要删除的那个元素。只会删除找到的第一个元素
boolean removeAll(Collection coll)：取当前集合的差集

取两个集合的交集
boolean retainAll(Collection c)：把交集的结果存在当前集合中，不影响c

集合是否相等
boolean equals(Object obj)

转成对象数组
Object[] toArray()

获取集合对象的哈希值
hashCode()

遍历
iterator()：返回迭代器对象，用于集合遍历
 */
import org.junit.Test;

import java.util.*;

/**
 *
 * 三、Collection接口中的方法的使用
 * 结论:
 * 向Collection接口的实现类的对象中添加数据obj时，要求obj所在类要重写equals().equals()比较的是内容
 *
 * Arraylist转Array
 * Object[] array = coll.toArray(); = arraylist.toArray()
 * *提取集合的某个对象元素
 *  *         Object p = array[2];
 *  *         Person p1 = (Person)p;
 * Array转List
 * List list = Arrays.asList(array)
 *
 * List转ArrayList
 *         ArrayList arrayList = new ArrayList();
 *         for (int i = 0; i < list.size(); i++) {
 *             arrayList.add(list.get(i));
 *         }

 *
 */
public class CollectionTest {

    @Test
    public void test1(){
        Collection coll = new ArrayList();

        //add(Object e):将元素e添加到集合coll中
        coll.add("AA");
        coll.add("BB");
        coll.add(123);  //自动装箱
        coll.add(new Date());

        //size():获取添加的元素的个数
        System.out.println(coll.size());    //4

        //addAll(Collection coll1):将coll1集合中的元素添加到当前的集合中
        Collection coll1 = new ArrayList();
        coll1.add(456);
        coll1.add("CC");
        coll.addAll(coll1);

        System.out.println(coll.size());    //6
        System.out.println(coll);//[AA, BB, 123, Mon Oct 11 11:39:04 CST 2021, 456, CC]

        //clear():清空集合元素
        coll.clear();

        //isEmpty():判断当前集合是否为空
        System.out.println(coll.isEmpty());//true

        /**
         * Collection接口中声明的方法的测试
         *
         * 结论：
         * 向Collection接口的实现类的对象中添加数据obj时，要求obj所在类要重写equals().
         */

        Collection coll2 = new ArrayList();
        coll2.add(123);
        coll2.add(456);

//        Person p = new Person("Jerry",20);
//        coll.add(p);
        coll2.add(new Person("Jerry",20));

        coll2.add(new String("Tom"));
        coll2.add(false);

        //1.contains(Object obj):判断当前集合中是否包含obj
        //我们在判断时会调用obj对象所在类的equals()。
        boolean contains = coll2.contains(123);
        System.out.println(contains);//true
        System.out.println(coll2.contains(new String("Tom")));//true
//        System.out.println(coll.contains(p));//true
        System.out.println(coll2.contains(new Person("Jerry",20)));//true

        //2.containsAll(Collection coll1):判断形参coll1中的所有元素是否都存在于当前集合中。
        Collection coll3 = Arrays.asList(123,4567);
        System.out.println(coll3.containsAll(coll1));//false
    }
    @Test
    public void test2(){
        Collection coll = new ArrayList();
        coll.add(123);
        coll.add(456);
        coll.add(new Person("Jerry",20));
        coll.add(new String("Tom"));
        coll.add(false);

        //7.hashCode():返回当前对象的哈希值
        System.out.println(coll.hashCode());//-1200490100

        //8.集合 --->数组：toArray()
        Object[] arr = coll.toArray();
        for(int i = 0;i < arr.length;i++){
            System.out.print(arr[i]+"\t");
        }
        System.out.println("\n");
        //拓展：数组 --->集合:调用Arrays类的静态方法asList()
        List<String> list = Arrays.asList(new String[]{"AA", "BB", "CC"});
        System.out.println(list);//[AA, BB, CC]

        List arr1 = Arrays.asList(123, 456);
        System.out.println(arr1);//[123, 456]

        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            arrayList.add(list.get(i));
        }
        System.out.println(arrayList);//[AA, BB, CC]

        List arr2 = Arrays.asList(new int[]{123, 456});
        System.out.println(arr2.size());//1

        List arr3 = Arrays.asList(new Integer[]{123, 456});
        System.out.println(arr3.size());//2

        //9.iterator():返回Iterator接口的实例，用于遍历集合元素。放在IteratorTest.java中测试
    }
    @Test
    public void test3(){
        Collection coll = new ArrayList();
        coll.add(123);
        coll.add(456);
        coll.add(new Person("Jerry",20));
        coll.add(new String("Tom"));
        coll.add(false);

        //5.retainAll(Collection coll1):交集：获取当前集合和coll1集合的交集，并返回给当前集合
//        Collection coll1 = Arrays.asList(123,456,789);
//        coll.retainAll(coll1);
//        System.out.println(coll);//[123, 456]

        //6.equals(Object obj):要想返回true，需要当前集合和形参集合的各个位置的元素都相同。
        Collection coll2 = new ArrayList();
        coll2.add(456);
        coll2.add(123);
        coll2.add(new Person("Jerry",20));
        coll2.add(new String("Tom"));
        coll2.add(false);

        System.out.println(coll.equals(coll2));//false
    }
    @Test
    public void test4(){
        Collection coll = new ArrayList();
        coll.add(123);
        coll.add(456);
        coll.add(new Person("Jerry",20));
        coll.add(new String("Tom"));
        coll.add(false);

        //7.hashCode():返回当前对象的哈希值
        System.out.println(coll.hashCode());//-1200490100

        //8.集合 --->数组：toArray()
        Object[] arr = coll.toArray();
        for(int i = 0;i < arr.length;i++){
            System.out.print(arr[i]+"\t");
        }
        System.out.println("\n");
        Object p = arr[2];
        Person p1 = (Person)p;
        System.out.println(p1.getName());
        System.out.println("\n");
        //拓展：数组 --->集合:调用Arrays类的静态方法asList()
        List<String> list = Arrays.asList(new String[]{"AA", "BB", "CC"});
        System.out.println(list);

        List arr1 = Arrays.asList(123, 456);
        System.out.println(arr1);//[123, 456]

        List arr2 = Arrays.asList(new int[]{123, 456});
        System.out.println(arr2.size());//1

        List arr3 = Arrays.asList(new Integer[]{123, 456});
        System.out.println(arr3.size());//2

        //9.iterator():返回Iterator接口的实例，用于遍历集合元素。放在IteratorTest.java中测试
    }

}

