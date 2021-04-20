package java0409;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class SellTrainTicketLocker {
    public static void main(String[] args) {
        Runnable runnable = new Runnable() {
            Lock locker = new ReentrantLock();
//            Object o = new Object();
            int ticket = 20;

            @Override
            public void run() {

                //窗口 永远开启
                while (true) {
                    locker.lock();
                    //                    synchronized (o) {
                        if (ticket > 0) {//有票 可以卖
                            //出票操作
                            //使用sleep模拟一下出票时间
                            try {
                                Thread.sleep(300);
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                            //获取当前线程对象的名字
                            String name = Thread.currentThread().getName();
                            System.out.println(name + "正在卖:" + ticket--);
                        } else {
                            System.out.println("票已售罄，请等待下一个开放时间窗！");
                            break;
                        }
                        locker.unlock();
                    }

                }
//            }
        };
        Thread sellWin1 = new Thread(runnable,"窗口1");
        sellWin1.start();
        Thread sellWin2 = new Thread(runnable,"窗口2");
        sellWin2.start();
        Thread sellWin3 = new Thread(runnable,"窗口3");
        sellWin3.start();

        System.out.println("售票完毕！");

    }
}
