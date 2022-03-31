package 集合.Map接口.Hashtable和用Properties处理属性文件;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesTest {
    //Properties:常用来处理配置文件。key和value都是String类型
    public static void main(String[] args){
        //打印路径
        File directory = new File("");//参数为空
        try{
            String courseFile = directory.getCanonicalPath() ;
            System.out.println(courseFile);
        }catch (IOException e){
            e.printStackTrace();
        }finally {

        }

        FileInputStream fis = null;
        try {
            Properties pros = new Properties();
            fis = new FileInputStream("JDBC.properties");
            pros.load(fis); //加载流对应文件

            String name = pros.getProperty("name");
            String age = pros.getProperty("age");

            System.out.println("name = " + name + ",age = " + age);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(fis != null){
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
