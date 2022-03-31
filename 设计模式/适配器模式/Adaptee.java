package 设计模式.适配器模式;

/**
 * @BelongsProject: java_zs
 * @BelongsPackage: 设计模式.适配器模式
 * @Author: zhangshuo
 * @CreateTime: 2022-03-31 09:47
 * @Description:
 */
//要被适配的类:网线
public class Adaptee {
    public void request() {
        System.out.println("连接网线上网");
    }
}


