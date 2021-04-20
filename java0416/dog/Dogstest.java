package java0416.dog;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class Dogstest {
    public static void main(String[] args) {
        System.out.println("共计有" + Dogs.dogsLists.size() + "条狗狗。");
        System.out.println("分别是：");
//        Dogs dogs;
        //遍历数组（for reach---增强for循环）
        for (Dogs d : Dogs.dogsLists) {
            System.out.println(d.getName() + "   " + d.getType());
        }
        System.out.println("******************************");

        System.out.println("有叫美美的狗狗吗");
        //立flag，
        boolean flag = true;
        for (Dogs d : Dogs.dogsLists) {
            if (d.getName().equals("美美") && d.getType().equals("雪纳瑞")) {
                System.out.println("有");
                flag = false;
                continue;
            }
        }
        if (flag) {
            System.out.println("无");
        }
        System.out.println("******************************");

        System.out.println("删除指定位置欧欧");
        Dogs.dogsLists.remove(0);
        for (Dogs d : Dogs.dogsLists) {
            System.out.println(d.getName() + "   " + d.getType());
        }
        System.out.println("删除指定狗狗-菲菲");
        for (Dogs d : Dogs.dogsLists) {
            if (d.getName().equals("菲菲") && d.getType().equals("拉布拉多")) {
                Dogs.dogsLists.remove(d);
//               continue;
            }
//            System.out.println(d.getName() +"   "+ d.getType());
        }
        for (Dogs d : Dogs.dogsLists) {
            System.out.println(d.getName() + "   " + d.getType());
//        }
        }
    }
}
