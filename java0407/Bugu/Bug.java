package java0407.Bugu;

public class Bug {
    public static void main(String[] args) {
        Buguuu bug=new Buguuu(){
            @Override
            public void cry() {

            }

            @Override
            public void sing() {
                System.out.println("拉拉");
            }

            @Override
            public void fly() {

            }
        };
        bug.sing();
    }
}
