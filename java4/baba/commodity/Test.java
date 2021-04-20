package java4.baba.commodity;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入食品类价格");
        Foods.price = input.nextDouble();
        Goods newFoods = new Foods();
//        newFoods.price();
        GoodsProcess.gg(newFoods);

        System.out.println("请输入电视类价格");
        Tvs.price = input.nextDouble();
        Goods newTvs = new Tvs();
        GoodsProcess.gg(newTvs);
//        newTvs.price();
    }
}
