package java0409.bank;

public class BigBank extends Thread {
    Double money = 3000.0;

    public BigBank(String name) {
    }

    @Override
    public void run() {
    }
    public void nn(BigBank bigBank) {
        if (bigBank instanceof Atm) {
            for (int i = 0; i <= 3000; i++) {
                if (money > 0) {
                    System.out.println("ATM取款200，还剩" + (money -= 200));
                } else {
                    System.out.println("暂无余额");
                    break;
                }
            }
        }
        if (bigBank instanceof GuiTai) {
            for (int i = 0; i <= 3000; i++) {
                if (money > 0) {
                    System.out.println("柜台取款100，还剩" + (money -= 100));
                } else {
                    System.out.println("暂无余额");
                    break;
                }
            }
        }
    }
}
