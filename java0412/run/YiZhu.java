package java0412.run;

public class YiZhu extends Thread {
    String[] xingm = new String[]{"小张", "小王", "小李", "小徐"};

    public YiZhu(String name) {
        super(name);
    }

    public void run() {
        for (int i = 0; i <= 3; i++) {
            System.out.println("组名：" + getName() + "  " + "姓名:" + xingm[i] + "  " + "250米");
        }
    }
}
