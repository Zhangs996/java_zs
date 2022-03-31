package IO流.File实例化;

import org.junit.Test;
import java.io.File;
import java.util.Date;

/**
 * File类的使用
 *
 * 1. File类的一个对象，代表一个文件或一个文件目录(俗称：文件夹)
 * 2. File类声明在java.io包下
 *
 */
public class FileTest {
    /**
     * 1.如何创建file类的实例
     *      File(String filePath):以filePath为路径创建File对象，可以是绝对路径或者相对路径
     *      File(String parentPath,String childPath):以parentPath为父路径，childPath为子路径创建File对象。
     *      File(File parentFile,String childPath):根据一个父File对象和子文件路径创建File对象
     * 2.
     *   相对路径：相较于某个路径下，指明的路径。
     *   绝对路径：包含盘符在内的文件或文件目录的路径
     *
     * 3.路径分隔符
     *      windows:\\
     *      unix:/
     * 4.Java程序支持跨平台运行，因此路径分隔符要慎用。
     *
     * 5.为了解决这个隐患，File类提供了一个常量：
     *   public  static final String separator。
     *   根据操作系统，动态的提供分隔符。
     *
     * File file1= new File("d:\\Work\\info.txt");
     * File file2= new File("d:"+ File.separator+ "Work"+ File.separator+ "info.txt");
     * File file3= new File("d:/Work");
     *
     *
     * public String getAbsolutePath()：获取绝对路径
     * public String getPath() ：获取路径
     * public String getName() ：获取名称
     * public String getParent()：获取上层文件目录路径。若无，返回null
     * public long length() ：获取文件长度（即：字节数）。不能获取目录的长度。
     * public long lastModified() ：获取最后一次的修改时间，毫秒值
     *
     * 如下的两个方法适用于文件目录：
     * public String[] list() ：获取指定目录下的所有文件或者文件目录的名称数组
     * public File[] listFiles() ：获取指定目录下的所有文件或者文件目录的File数组
     *
     * public boolean renameTo(File dest):把文件重命名为指定的文件路径
     *          比如：file1.renameTo(file2)为例：
     *          要想保证返回true,需要file1在硬盘中是存在的，且file2不能在硬盘中存在



     */
    @Test
    public void test(){
        //构造器1：
        File file = new File("");
        System.out.println(file.getAbsolutePath());

        File file1 = new File("hello.txt");//C:\Users\zs\IdeaProjects\shuzu相对于当前module
        File file2 = new File("C:\\Users\\zs\\IdeaProjects\\shuzu\\hello.txt");

        System.out.println(file1);//hello.txt
        System.out.println(file2);//C:\Users\zs\IdeaProjects\shuzu\hello.txt

        //构造器2：
        File file3 = new File("D:\\workspace_idea1","JavaSenior");
        System.out.println(file3);//D:\workspace_idea1\JavaSenior

        //构造器3：
        File file4 = new File(file3,"he.txt");//D:\workspace_idea1\JavaSenior\he.txt，其实不存在he.txt，只是打印出而已
        System.out.println(file4);

        System.out.println("*******************");
        System.out.println(file1.getAbsolutePath());
        System.out.println(file1.getPath());//hello.txt
        System.out.println(file1.getName());//hello.txt
        System.out.println(file3.getParent());//D:\workspace_idea1
        System.out.println(file1.length());//18
        System.out.println(new Date(file1.lastModified()));//Wed Oct 13 14:33:20 CST 2021
        System.out.println();

    }
    //list和listFiles
    @Test
    public void test1(){
        File file = new File("D:\\");
        String[] list = file.list();
        for (String str:list) {
            System.out.println(str);
        }

        File[] files = file.listFiles();
        for (File f:files) {
            System.out.println(f.getName());
        }
    }
    @Test
    public void test2(){
        File file = new File("C:\\Users\\zs\\IdeaProjects\\shuzu\\hello.txt");
        File dest = new File("dest.txt");
        boolean b = file.renameTo(dest);
        System.out.println(b);//true
    }

}

