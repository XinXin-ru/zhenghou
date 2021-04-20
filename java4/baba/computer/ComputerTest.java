package java4.baba.computer;

public class ComputerTest {
    public static void main(String[] args) {
        Cpu c = new Cpu();
        Ems e = new Ems();
        HardDisk h = new HardDisk();

        c.setBrand("惠普");
        c.setZhupin("8");
        e.setType("爱国者");
        e.setCapacity(40.0);
        h.setCapacity(30.0);
        System.out.println("计算机的信息如下：");
        System.out.println("CPU的品牌是：" + c.getbrand() + ",主频是;" + c.getzhupin() + "GHz");
        System.out.println("内存类型：" + e.gettype() + ",内存容量是：" + e.getcapacity() + "GB");
        System.out.println("硬盘的容量是：" + h.getcapacity() + "GB");

    }
}
