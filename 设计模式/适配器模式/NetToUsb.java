package 设计模式.适配器模式;

/**
 * @BelongsProject: java_zs
 * @BelongsPackage: 设计模式.适配器模式
 * @Author: zhangshuo
 * @CreateTime: 2022-03-31 09:48
 * @Description:
 */ //按1口转换器的抽象实现~
public interface NetToUsb {
    //作1川:处理请求，网线=>usb
    public void handleRequest();
}
