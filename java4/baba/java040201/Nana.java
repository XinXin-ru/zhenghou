package java4.baba.java040201;

import java.util.Scanner;

public class Nana extends Pet {
    @Override
    public void method() {
        Scanner input = new Scanner(System.in);
        Nana.name="娜娜";
        Nana.health=100.0;
        Nana.intimate=0.0;
        super.method();
        System.out.println("请输入宠物的类别：");
        Ouou.kind=input.next();
        System.out.println("我是一只"+Nana.kind);
    }
}
