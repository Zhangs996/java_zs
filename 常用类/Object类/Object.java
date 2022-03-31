package 常用类.Object类;
/*
 Object类是所有Java类的根父类
 如果在类的声明中未使用extends关键字指明其父类，则默认父类 为java.lang.Object类
public class Person {
...
}
等价于：
public class Person extends Object {
...
}
NO. 方法名称                           类型            描述
1 public Object()                     构造            构造器
2 public boolean equals(Object obj)   普通            对象比较
3 public int hashCode()               普通            取得Hash码
4 public String toString()            普通            对象打印时调用
1	protected Object clone()
创建并返回一个对象的拷贝
2	boolean equals(Object obj)
比较两个对象是否相等
3	protected void finalize()
当 GC (垃圾回收器)确定不存在对该对象的有更多引用时，由对象的垃圾回收器调用此方法。
4	Class<?> getClass()
获取对象的运行时对象的类
5	int hashCode()
获取对象的 hash 值
6	void notify()
唤醒在该对象上等待的某个线程
7	void notifyAll()
唤醒在该对象上等待的所有线程
8	String toString()
返回对象的字符串表示形式
9	void wait()
让当前线程进入等待状态。直到其他线程调用此对象的 notify() 方法或 notifyAll() 方法。
10	void wait(long timeout)
让当前线程处于等待(阻塞)状态，直到其他线程调用此对象的 notify() 方法或 notifyAll() 方法，或者超过参数设置的timeout超时时间。
11	void wait(long timeout, int nanos)
与 wait(long timeout) 方法类似，多了一个 nanos 参数，这个参数表示额外时间（以纳秒为单位，范围是 0-999999）。 所以超时的时间还需要加上 nanos 纳秒。。
 */
public class Object {
}
