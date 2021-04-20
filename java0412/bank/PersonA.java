package java0412.bank;

public class PersonA implements Runnable{

    public Bank bank;
    final int two200=200;
    public static Object locker =new Object();

    public PersonA(Bank inBnak, Object inLocker){
        this.bank=inBnak;
        locker=inLocker;
    }
    public void run(){
        while (true) {
            synchronized (locker) {
                if (!bank.takeMoney("柜台",two200)){
                    break;
                }
                locker.notify();
            }
        }
    }
}
