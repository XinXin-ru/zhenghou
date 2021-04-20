package java0409.bank;

public class Test extends Thread {
    @Override
    public void run() {
        BigBank b = new Atm("1");
        Atm atm = new Atm("柜台取钱");
        b.nn(atm);
        atm.start();
        //通过接口创建的线程
        GuiTai s = new GuiTai("qq");
        s.start();
    }

    public static void main(String[] args) {

    }
}





