package IO流.对象流.自定义类实现序列化与反序列化操作;

import org.junit.Test;

import java.io.*;
public class ObjectTest {

    /**
     * 序列化过程：将内存中的java对象保存到磁盘中或通过网络传输出去
     * 使用ObjectOutputStream实现
     *  Person需要满足如下的要求，方可序列化
     *  1.需要实现接口：Serializable
     *  2.当前类提供一个全局常量：serialVersionUID
     *  3.除了当前Person类需要实现Serializable接口之外，还必须保证其内部所有属性
     *     也必须是可序列化的。（默认情况下，基本数据类型可序列化）
     */
    @Test
    public void test(){
        ObjectOutputStream oos = null;
        try {
            //创造流
            oos = new ObjectOutputStream(new FileOutputStream("object.dat"));
            //制造对象
            oos.writeObject(new String("秦始皇陵欢迎你"));
            //刷新操作
            oos.flush();

            oos.writeObject(new Person("李时珍",65));
            oos.flush();


        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(oos != null){
                //3.关闭流
                try {
                    oos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    /**
     * 反序列化：将磁盘文件中的对象还原为内存中的一个java对象
     * 使用ObjectInputStream来实现
     */
    @Test
    public void test2(){
        ObjectInputStream ois = null;
        try {
            ois = new ObjectInputStream(new FileInputStream("object.dat"));

            Object obj = ois.readObject();
            String str = (String) obj;

            Person p = (Person) ois.readObject();

            System.out.println(str);
            System.out.println(p);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            if(ois != null){
                try {
                    ois.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

}
