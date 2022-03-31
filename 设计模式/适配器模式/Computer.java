package 设计模式.适配器模式;

/**
 * @BelongsProject: java_zs
 * @BelongsPackage: 设计模式.适配器模式
 * @Author: zhangshuo
 * @CreateTime: 2022-03-31 09:48
 * @Description:
 */ //客户端关: 想上:网，插不L:网线~
public class Computer {
    //我们的电脑需要连接1:转按器才可以1:网
    public void net(NetToUsb adapter) {
        //.上网的具体实现， 找“个转接义
        adapter.handleRequest();
    }

    public static void main(String[] args) {
/*        //电脑，适配器，网线~
        Computer computer = new Computer(); //电脑
        Adaptee adaptee = new Adaptee(); //网线
        Adapter adapter = new Adapter(); //转按器
        computer.net(adapter);*/

        System.out.println("++++++++++++++++++++++++++++++");

        //电脑，适配器，网线~
        Computer computer = new Computer(); //电脑
        Adaptee adaptee = new Adaptee(); //网线
        Adapter2 adapter = new Adapter2(adaptee); //转换器

        computer.net(adapter);
    }
}
