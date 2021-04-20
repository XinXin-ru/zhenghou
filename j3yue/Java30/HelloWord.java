package j3yue.Java30;

import com.sun.org.apache.bcel.internal.generic.SWITCH;

import java.lang.invoke.SwitchPoint;
import java.util.Scanner;

public class HelloWord {
    public static void main(String[] args) {
        /* System.out.println("早上好");*/
     /*   String s1 = "小明";
        String s2 = "Java";
        String s3 = "篮球";
        int old = 25;
        int j = 3;
        int x = 5;

        System.out.println("这个同学的姓名是："+s1);
        System.out.println("年龄是" + old);
        System.out.println("工作年限"+ j);
        System.out.println("做过的项目"+ x);
        System.out.println("技术方向"+s2);
        System.out.println("兴趣爱好是："+ s3);*/
        /*Scanner input = new Scanner(System.in);
        System.out.println("请输入四位会员卡号");
        int h = input.nextInt();
        System.out.println("输入的会员卡号是："+h);*/
       /*Scanner input = new Scanner(System.in);
       System.out.println("五位会员卡号");
       int a1 = input.nextInt();
       int wanwei = a1/10000;
       int qianwei = a1/1000%10;
       int baiwei = a1/100%10;
       int shiwei = a1/10%10;
       int gewei = a1%10000%10;
       System.out.println("万位数是"+wanwei);
       System.out.println("千位数是"+qianwei);
       System.out.println("百位数是"+baiwei);
       System.out.println("十位数是"+shiwei);
       System.out.println("个位数是"+gewei);
       int a2=wanwei+qianwei+baiwei+shiwei+gewei;
       System.out.println("和是"+a2);*/
       /*Scanner input = new Scanner(System.in);
       System.out.println("四位会员号");
       int a2 = input.nextInt();
       int qw = a2/1000;
       int bw = a2/100%10;
       int sw = a2/10%10;
       int gw = a2%10%10;
       System.out.println("千位数是"+qw);
       System.out.println("百位数是"+bw);
       System.out.println("十位数是"+sw);
       System.out.println("个位数是"+gw);
       int he =qw+bw+sw+gw;
       System.out.println("和是"+he);
       String n = he>20?"卡号8349的会员，您中奖了，奖品是MP3":"很遗憾！";
       System.out.println(n);
*/
     /*  Scanner input1 = new Scanner(System.in);
       System.out.println("输入scoreJ成绩");
       int scoreJ =input1.nextInt();
       System.out.println("输入scoreM成绩");
       int scoreM =input1.nextInt();
       if((scoreJ>90 && scoreM>80)||(scoreJ==100 && scoreM>70)
       ){
          System.out.println("奖励手机");
       }
       else {
          System.out.println("未达到标准");
       }*/
       /*Scanner input2 = new Scanner(System.in);
       System.out.println("输入姓名");
       String xm = input2.next();
       System.out.println("输入性别");
       String xb = input2.next();
       System.out.println("输入赛跑成绩");
       double pbcj = input2.nextDouble();
        if (xb.equals("男") && pbcj<10){
            System.out.println("进入男子组");
        }
        else if (xb.equals("女") && pbcj<10){
            System.out.println("进入女子组");
        }
        else {
            System.out.println("淘汰");
        }*/
        /*Scanner input3 = new Scanner(System.in);
        System.out.println("请输入会员号");
        int hyh = input3.nextInt();
        int randoum = (int) (Math.random() * 10);
        int q1 = hyh / 1000;
        int b1 = hyh / 100 % 10;
        int s1 = hyh / 10 % 10;
        int g1 = hyh % 10 % 10;
        if (b1 == randoum) {
            System.out.println("恭喜中奖");
        } else {
            System.out.println("很遗憾，未中奖");
        }*/
  /*      int i = 1;
        while (i <= 50) {
            System.out.println("打印第" + i + " 张试卷");
            i++;
        }*/
     /*   System.out.println("请选择购买的商品：");
        System.out.println("*********************");
        System.out.println("1.T恤 2.网球鞋 3.网球拍");
        System.out.println("*********************");
        for (int q = 1; q <= 100; q++) {
            System.out.println("请输入商品编号1-3或者按n退出");
            Scanner i = new Scanner(System.in);
            String input4 = i.next();
            if ("n".equals(input4)) {
                System.out.println("退出");
                break;
            }
            boolean b = false;
            switch (input4) {
                case "1": {
                    System.out.println("T恤 ￥：220.00");
                    System.out.println("是否继续，继续请按y,关闭请按n");
                    break;
                }
                case "2": {
                    System.out.println("网球鞋 ￥：450.00");
                    System.out.println("是否继续，继续请按y,关闭请按n");
                    break;
                }
                case "3": {
                    System.out.println("网球拍 ￥：300.00");
                    System.out.println("是否继续，继续请按y,关闭请按n");
                    break;
                }
                case "y": {
                    System.out.println("重新输入");
                    continue;
                }
                default: {
                    System.out.println("输入有误！");
                    b = true;
                    continue;
                }
            }*/
        }
        /*加油*/
      /*  int q = 1;
        do {
            System.out.println("第"+q+"次加油！");
            q++;
        }while (q <=100);*/
        /*int w = 1;
        while (w <=100){
            System.out.println("第"+w+"次加油！");
            w++;
        }*/
        /*for (int e = 1; e<=100; e++){
            System.out.println("第"+e+"次加油！");
        }*/

    }


