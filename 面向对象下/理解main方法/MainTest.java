package 面向对象下.理解main方法;

/*
 * main()方法的使用说明
 * 1.main()方法作为程序的入口;
 * 2.main()方法也是一个普通的静态方法
 * 3.main()方法也可以作为我们与控制台交互的方式。(之前，使用 Scanner)
 * 实例方法只能通过实例去调
 *
 */
public class MainTest {
    public static void main(String[] args) {	//入口

        Main.main(new String[100]);

        MainTest test = new MainTest();
        test.show();
        show2();
    }

    public void show(){

    }
    public static void show2(){

    }
}

class Main{
    public static void main(String[] args) {
        args = new String[100];
        for(int i = 0;i < args.length;i++){
            args[i] = "args_" + i;
            System.out.println(args[i]);
        }
    }
}
