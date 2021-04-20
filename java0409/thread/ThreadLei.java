package java0409.thread;

import java0407.T;

public class ThreadLei extends Thread {
    public ThreadLei(String name) {
        super(name);
    }

    public void run() {
        for (int i = 0; i < 50; i++) {
    System.out.println("循环执行第"+i+"次name:"+getName()+"id"+getId());
        }
    }
}
