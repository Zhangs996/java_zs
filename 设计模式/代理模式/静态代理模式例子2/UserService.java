package 设计模式.代理模式.静态代理模式例子2;

/**
 * @BelongsProject: java_zs
 * @BelongsPackage: 设计模式.代理模式.静态代理例子2
 * @Author: zhangshuo
 * @CreateTime: 2022-03-31 10:11
 * @Description:
 */
//抽象角色：增删改查业务
public interface UserService {
    void add();
    void delete();
    void update();
    void query();
}

