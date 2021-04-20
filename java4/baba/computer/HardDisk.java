package java4.baba.computer;

public class HardDisk implements HardDiskUsb{
    Double capacity;

    public void setCapacity(Double capacity) {
        this.capacity = capacity;
    }

    @Override
    public Double getcapacity() {
        return capacity;
    }
}
