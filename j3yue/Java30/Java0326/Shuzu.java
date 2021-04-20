package j3yue.Java30.Java0326;

import java.util.Scanner;

public class Shuzu {
    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
        /*double[] score = {80, 78, 90, 67, 89};
        double pys;
        pys = (score[0] + score[1] + score[2] + score[3] + score[4]) / 5;
        System.out.println("平均值是：" + pys);*/
        /*Scanner input =new Scanner(System.in);
        int sh=0;
        System.out.println("请选择输入几个数字：");
        sh=input.nextInt();
        int [] score =new int[sh];
        double zh=0;
        for (int i=0;i<score.length;i++){
            System.out.println("请输入第"+(i+1)+"个数");
            double ds=input.nextDouble();
            zh +=ds;
        }
        double pjz=zh/score.length;
        System.out.println("平均值是："+pjz);*/
      /*  Scanner input1 = new Scanner(System.in);
        System.out.println("请输入本月消费记录：");
        double num = 0.0;
        num = input1.nextDouble();
        double[] mon = new double[(int) num];
        double he = 0.0;
        for (int i = 0; i < mon.length; i++) {
            System.out.println("请输入第" + (i + 1) + "笔金额:");
            double ij = input1.nextDouble();
            he += ij;
            mon[i] = ij;
        }
        System.out.println("汇总：");
        for (int i = 0; i < mon.length; i++) {
            System.out.println("第" + (i + 1) + "笔金额" + "     " + mon[i] + "元");
        }
        System.out.println("总金额：" + he);*/

        Scanner input = new Scanner(System.in);
       int[] score = {8, 4, 2, 1, 23, 344, 12};
        for (int i = 0; i < score.length; i++) {
            int a = score[i];
            System.out.println("数列的第" +(i+1)+"个值为："+ a);
        }
        int he;
        he = (score[0] + score[1] + score[2] + score[3] + score[4] + score[5] + score[6]);
        System.out.println("数列总和为：" + he);
        System.out.println("请输入任意数字：");
        int dz = input.nextInt();
        int[] score1 = {8, 4, 2, 1, 23, 344, 12};
        for (int q = 0; q< score1.length; q++) {

            if (dz == score1[q]) {
                System.out.println("该数值在此数列中的序号为："+(q+1));
                break;
            } else{
                System.out.println("不存在！");
                break;
            }
        }
    }
}


