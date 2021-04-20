package java0409.bank;

public class GuiTai extends BigBank{

    public GuiTai(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i=0;i<=1000;i++){
            if (money>0){
                System.out.println("柜台取款100，还剩"+(money-=100));
            }else {
                System.out.println("暂无余额");
                break;
            }
        }
    }
}
