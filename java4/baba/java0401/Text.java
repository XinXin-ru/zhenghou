package java4.baba.java0401;

import java.util.Scanner;

public class Text {
    public static void main(String[] args) {
        System.out.println("欢迎来到宠物管理系统！");
        Scanner input=new Scanner(System.in);
        Dog g=new Dog();
        Cat c=new Cat();

        System.out.println("请选择宠物 1.狗   2.猫");
        int q=input.nextInt();
        if (q==1){
            System.out.println(g.name);
            System.out.println(g.sex);
            System.out.println(g.getEat());
        }else if(q==2){
            System.out.println(c.name);
            System.out.println(c.sex);
            System.out.println(c.getEat());
        }else {
            System.out.println("输入错误！");
        }

    }
}

