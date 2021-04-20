package java4.baba.java040201;

import java.util.Scanner;

public class Ouou extends Pet {
    @Override
    public void method() {
        Scanner input = new Scanner(System.in);
        Ouou.name="欧欧";
        Ouou.health=100.0;
        Ouou.intimate=0.0;
        super.method();
        System.out.println("请输入宠物的类别：");
        Ouou.kind=input.next();
        System.out.println("我是一只"+Ouou.kind);
    }
}
