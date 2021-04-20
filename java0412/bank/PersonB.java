package java0412.bank;


public class PersonB implements Runnable {

    public Bank bank;
    final int ONE100 = 100;
    public static Object locker =new Object();

    public PersonB(Bank inBnak, Object inLocker) {
        this.bank = inBnak;
        locker = inLocker;
    }

    public void run() {
        //判断银行里面的钱是不是够扣
        while (true) {
            synchronized (locker) {
                if (!bank.takeMoney(ONE100, "ATM")){
                    break;
                }

            }
        }
    }
}
