package 线程.线程的通信两个线程交替打印100;

/**
 * @author zhangshuo
 * @create 2021-10-08 13:12
 */

/**
 * 线程通信的例子：使用两个线程打印1-100。线程1, 线程2 交替打印
 *
 * 涉及到的三个方法：
 * wait():一旦执行此方法，当前线程就进入阻塞状态，并释放同步监视器。
 * notify():一旦执行此方法，就会唤醒被wait的一个线程。如果有多个线程被wait，就唤醒优先级高的那个。
 * notifyAll():一旦执行此方法，就会唤醒所有被wait的线程。
 *
 * 说明：
 *      1.wait()，notify()，notifyAll()三个方法必须使用在同步代码块或同步方法中。
 *      2.wait()，notify()，notifyAll()，synchronized()四个方法的调用者必须是同步代码块或同步方法中的同步监视器。
 *         否则，会出现IllegalMonitorStateException异常
 *      3.wait()，notify()，notifyAll()三个方法是定义在java.lang.Object类中。
 */

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
