package java4.baba.computer;

public class Cpu implements CpuUsb {
    String brand;
    String zhupin;

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setZhupin(String zhupin) {
        this.zhupin = zhupin;
    }

    @Override
    public String getbrand() {
        return brand;
    }

    @Override
    public String getzhupin() {
        return zhupin;
    }
}
