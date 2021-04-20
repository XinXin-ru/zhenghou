package java4.baba.computer;

public class Ems implements EmsUsb {
    String type;
    Double capacity;

    public void setType(String type) {
        this.type = type;
    }

    public void setCapacity(Double capacity) {
        this.capacity = capacity;
    }

    @Override
    public String gettype() {
        return type;
    }

    @Override
    public Double getcapacity() {
        return capacity;
    }
}
