package java0407.Bugu;

public class BuguTest {
    public static void main(String[] args) {
        Bird bg=new Bugu(){
            @Override
            void sing() {
                System.out.println("lala");
            }
        };
        bg.sing();
    }
}
