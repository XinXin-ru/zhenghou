package java4.baba.commodity;

public class Foods extends Goods {
    public void price() {
        System.out.println("食物类的折扣价为" + (price * 0.8));
    }
}

