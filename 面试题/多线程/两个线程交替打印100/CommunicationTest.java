package 面试题.多线程.两个线程交替打印100;

class Number implements Runnable{

    private int number = 1;
    @Override
    public void run() {
        while (true){
            synchronized (this) {
                notify();
                if(number<=100){
                    try {
                        Thread.sleep(1);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName()+"-"+number);
                    number++;
                    //使当前线程进入阻塞状态。阻塞会释放锁
                    try {
                        wait();//只当前线程阻塞，其他线程才能进来
                        System.out.println("gg");
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }else {
                    break;
                }
            }
        }

    }
}
public class CommunicationTest {
    public static void main(String[] args) {
        Number n1 = new Number();
        Thread t1 = new Thread(n1);
        Thread t2 = new Thread(n1);
        t1.setName("线程1");
        t2.setName("线程2");
        t1.start();
        t2.start();
    }

}

