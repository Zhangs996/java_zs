package IO流.IO流原理及流的分类._16bit字符流Reader_Writter.FileReader读入数据;

import org.junit.Test;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * 一、流的分类：
 * 1.操作数据单位：字节流、字符流
 * 2.数据的流向：输入流、输出流
 * 3.流的角色：节点流、处理流
 *
 * 二、流的体系结构
 * 抽象基类         节点流（或文件流）                               缓冲流（处理流的一种）
 * InputStream     FileInputStream   (read(byte[] buffer))        BufferedInputStream (read(byte[] buffer))
 * OutputStream    FileOutputStream  (write(byte[] buffer,0,len)  BufferedOutputStream (write(byte[] buffer,0,len) / flush()
 * Reader          FileReader (read(char[] cbuf))                 BufferedReader (read(char[] cbuf) / readLine())
 * Writer          FileWriter (write(char[] cbuf,0,len)           BufferedWriter (write(char[] cbuf,0,len) / flush()
 */
public class FileReaderWriterTest {
    public static void main(String[] args) {
        File file = new File("hello.txt");//相较于当前工程
        System.out.println(file.getAbsolutePath());

        File file1 = new File("day09\\hello.txt");
        System.out.println(file1.getAbsolutePath());
    }

    /**
     * 将day09下的hello.txt文件内容读入程序中，并输出到控制台
     *
     * 说明点：
     *     1. read()的理解：返回读入的一个字符。如果达到文件末尾，返回-1
     *     2. 异常的处理：为了保证流资源一定可以执行关闭操作。需要使用try-catch-finally处理
     *     3. 读入的文件一定要存在，否则就会报FileNotFoundException。
     *
     */
    @Test
    public void test(){
        FileReader fr = null;
        try {
            //实例化File对象，指明要操作的文件
            File file = new File("dest.txt");//相较于当前的Module，这个文件要存在，不存在的话new FileReader会报异常
            //2.提供具体的流
            fr = new FileReader(file);

//            3.数据的读入过程
//            read():返回读入的一个字符。如果达到文件末尾，返回-1.
//            方式一：
            int data = fr.read();
            int coun = 0;
            while(data != -1) {
                System.out.print((char) data);
                data = fr.read();
                coun++;
            }

            //方式二：语法上针对于方式一的修改
            int data2;
            while((data2 = fr.read()) != -1){
                System.out.print((char) data2);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            //4.流的关闭操作
            if(fr != null){
                try {
                    fr.close();//File没实例化就close，会报空指针
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
    @Test
    //FileReader中使用read(char[] cbuf)读入数据
    public void test1() {
        FileReader fr = null;
        try {
            //1.File类的实例化
            File file = new File("dest.txt");

            //2.FileReader流的实例化
            fr = new FileReader(file);

            //3.读入的操作
            //read(char[] cbuf):返回每次读入cbuf数组中的字符的个数。如果达到文件末尾，返回-1
            char[] cbuf = new char[5];
            int len;
            while ((len = fr.read(cbuf)) != -1) {
                //方式一：
                //错误的写法
//                for(int i = 0;i < cbuf.length;i++){
//                    System.out.print(cbuf[i]);
//                }
                //正确的写法
                for(int i = 0;i < len;i++){
                    System.out.print(cbuf[i]);
                }

                //方式二：
                //错误的写法,对应着方式一的错误的写法
//                String str = new String(cbuf);
//                System.out.print(str);
                //正确的写法
//                String str = new String(cbuf, 0, len);
//                System.out.print(str);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fr != null) {
                //4.资源的关闭
                try {
                    fr.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }

            }
        }
    }
}

