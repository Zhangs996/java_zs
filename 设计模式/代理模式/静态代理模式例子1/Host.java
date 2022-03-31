package 设计模式.代理模式.静态代理模式例子1;

/**
 * @BelongsProject: java_zs
 * @BelongsPackage: 设计模式.代理模式
 * @Author: zhangshuo
 * @CreateTime: 2022-03-31 10:07
 * @Description:
 */ //真实角色: 房东，房东要出租房子
public class Host implements Rent{

    @Override
    public void rent() {
        System.out.println("房屋出租");
    }
}
