package 异常.手动抛出异常throw;

/**
 * @author zhangshuo
 * @create 2021-10-02 13:46
 */
/*
throw：就是自己进行异常处理，
处理的时候有两种方式，要么自己捕获异常（也就是try catch进行捕捉），要么声明抛出一个异常（就是throws）。
注意：
throw一旦进入被执行，程序立即会转入异常处理阶段，后面的语句就不再执行，而且所在的方法不再返回有意义的值！
 */
public class StudentTest {
    public static void main(String[] args) {

        Student s = new Student();
        try {
            s.regist(-1001);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
//
    }
}
class Student{
    private int id;

    public void regist(int id) throws Exception {
        if(id > 0){
            this.id = id;
        }else{
//			System.out.println("您输入的数据非法！");
            //手动抛出异常
//			throw new RuntimeException("您输入的数据非法！");
            throw new Exception("您输入的数据非法！");//生成一个异常对象是在方法内

        }
    }

    @Override
    public String toString() {
        return "Student [id=" + id + "]";
    }

}
