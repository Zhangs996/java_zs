package 设计模式.代理模式.静态代理模式例子2;

/**
 * @BelongsProject: java_zs
 * @BelongsPackage: 设计模式.代理模式.静态代理模式例子2
 * @Author: zhangshuo
 * @CreateTime: 2022-03-31 10:11
 * @Description:
 */ //代理角色，在这里面增加日志的实现
public class UserServiceProxy implements UserService {
    private UserServiceImpl userService;

    public void setUserService(UserServiceImpl userService) {
        this.userService = userService;
    }

    public void add() {
        log("add");
        userService.add();
    }

    public void delete() {
        log("delete");
        userService.delete();
    }

    public void update() {
        log("update");
        userService.update();
    }

    public void query() {
        log("query");
        userService.query();
    }

    public void log(String msg){
        System.out.println("执行了"+msg+"方法");
    }

}
