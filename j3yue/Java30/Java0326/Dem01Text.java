package j3yue.Java30.Java0326;

import java.util.Scanner;

public class Dem01Text {
    public static void main(String[] args) {
        Demo01Bank qian=new Demo01Bank();
        Scanner input=new Scanner(System.in);
        System.out.println("请输入日期：");
        int b=input.nextInt();
        qian.setDay(b);
    }
}
