package java0409.thread;

public class ThreadShix implements Runnable{
    public ThreadShix(String name) {

    }

    @Override
    public void run() {
        for (int i = 50; i < 100; i++) {
            System.out.println("我是接口线程"+i);
        }
    }
}
