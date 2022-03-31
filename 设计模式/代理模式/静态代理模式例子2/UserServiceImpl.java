package 设计模式.代理模式.静态代理模式例子2;

/**
 * @BelongsProject: java_zs
 * @BelongsPackage: 设计模式.代理模式.静态代理模式例子2
 * @Author: zhangshuo
 * @CreateTime: 2022-03-31 10:11
 * @Description:
 */ //真实对象，完成增删改查操作的人
public class UserServiceImpl implements UserService {

    public void add() {
        System.out.println("增加了一个用户");
    }

    public void delete() {
        System.out.println("删除了一个用户");
    }

    public void update() {
        System.out.println("更新了一个用户");
    }

    public void query() {
        System.out.println("查询了一个用户");
    }
}
