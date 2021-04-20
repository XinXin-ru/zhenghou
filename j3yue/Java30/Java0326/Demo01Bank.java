package j3yue.Java30.Java0326;

public class Demo01Bank {
   private int day;
   private int money;
    public int getDay() {
        return day;
    }
    public void setDay(int day) {
        for (; day < 31; day++) {
            this.day=day;
            if (this.day%5==0){
                setMoney(0);
                System.out.println("3."+this.day+"号存款"+this.money+"元");
            }
        }
        this.day = day;
    }
    public int getMoney() {
        return money;
    }
    public void setMoney(int money) {
        this.money = this.day*200;
    }
}
