package java0409.thread;

public class ThreadTest {
    public static void main(String[] args) {
        ThreadLei un=new ThreadLei("继承类创建的线程1");
        un.start();



        ThreadShix jk=new ThreadShix("接口创建的线程2");
        Thread jk1=new Thread(jk);
        jk1.start();
    }

}
