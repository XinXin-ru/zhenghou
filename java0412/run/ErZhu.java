package java0412.run;

public class ErZhu extends Thread {
    String[] xingm = new String[]{"小张2", "小王2", "小李2", "小徐2"};

    public ErZhu(String name) {
        super(name);
    }

    public void run() {
        for (int i = 0; i <= 3; i++) {
            System.out.println("组名：" + getName() + "  " + "姓名:" + xingm[i] + "  " + "250米");
        }
    }
}
