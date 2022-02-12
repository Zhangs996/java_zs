package 面向对象下.接口interface.接口笔试题;

interface Playable {
    void play();
}
interface Bounceable {
    void play();
}
interface Rollable extends Playable, Bounceable {
    Ball ball= new Ball("PingPang");//一个属性//省略了 public static final
}
public class Ball implements Rollable {
    private String name;
    public String getName() {
        return name;
    }
    public Ball(String name) {
        this.name= name;
    }
    public void play() {//不知道重写哪个play(),其实都重写了
        //ball = new Ball("Football"); //常量不能new
        System.out.println(ball.getName());
    }
}

