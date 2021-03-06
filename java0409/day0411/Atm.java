package java0409.day0411;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Atm extends BigBank {
    Lock lock;

    public Atm(String name, Lock lock) {
        super(name);
        this.lock = lock;
    }

    public void run() {

        while (true) {
            lock.lock();
            if (!methodQu()) {
                System.out.println("eeeeee");
                lock.unlock();
                break;
            }
            System.out.println("ppppp");
            lock.unlock();
        }
    }

    public boolean methodQu() {
        try {
//            synchronized (this) {
            if (money > 0) {
                //可以继续取
                Thread.sleep(200);
                //获取当前线程对象的名字
                String name = Thread.currentThread().getName();
                System.out.println(name + "取出100，还剩金额为:" + (money -= 100.00));
                return true;
            } else {
                System.out.println("钱已经取光，请充钱！");
                return false;
            }
//            }
        } catch (InterruptedException e) {
            e.printStackTrace();
            return false;
        }
    }
}
