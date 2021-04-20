package j3yue.Java30;

import java.util.Scanner;

public class ForDemo {
    public static void main(String[] args) {
//        循环输入某同学S1结业考试的五门成绩
   /*     Scanner scanner = new Scanner(System.in);
        Double totalScore = 0.0;
        for (int i = 1; i <= 5; i++) {
//            提示
            System.out.println("请输入第" + i + "次的成绩");
//            接接收输入成绩
            Double score = scanner.nextDouble();
//            变量保存5门的总成绩
            totalScore += score;
        }
//        计算平均分
        Double avgScore = totalScore / 5;
//        输出平均分
        System.out.println("五门课的平均分是：" + avgScore);*/
//        Scanner scanner = new Scanner(System.in);
        /*System.out.println("请输入一个值：");
        int kcsl = scanner.nextInt();
        for (int i =0; i<=kcsl; i++){
            System.out.println(i+"+"+(kcsl-i)+"="+kcsl);
        }*/
/*        int a = 0;
        for (int i =0; i <=100; i++){
            if (i%2 == 0){
                a=a+i;
            }
        }
        System.out.println(+a);*/
//        int h(行)=1；int l(列)=1;
//        行
    /*    for (int h=1; h <=5; h++) {
//        列
            for (int l=1; l <=5; l++){
                System.out.print("*");
//                打完一行之后要换行
                if (l==5){
                    System.out.println();
                }
            }
        }
        for (int h = 1; h <= 5; h++) {
            for (int l = 0; l <= 5 - h; l++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 5; k++) {
                System.out.print("*");
            }
            for (int y = 1; y <= h - 1; y++) {
                System.out.print(" ");
            }
            System.out.println();
        }*/
/*        for (int h = 1; h <= 5; h++) {
            for (int l = 0; l <= 5 - h; l++) {
                System.out.print(" ");
            }
            for (int q = 1; q <= 2 * h - 1; q++) {
                System.out.print("*");
            }
            for (int w = 1; w <= 5 - h; w++) {
                System.out.print(" ");
            }
            System.out.println();
        }
        for (int h1 = 1; h1 <= 9; h1++) {
            for (int l1 = 1; l1 <= h1; l1++) {
                System.out.print(h1 + "*" + l1 + "=" + (h1 * l1));
                System.out.print(" ");
            }
            System.out.println();
        }*/
/*        Scanner scanner = new Scanner(System.in);
        Double hh = 0.0;
        Double p = 0.0;
        for (int c = 1; c <= 5; c++) {
            System.out.println("请输入第" + c + "次成绩");
            Double cj = scanner.nextDouble();
            if (cj <= 0) {
                System.out.println("抱歉，输入错误，程序退出！");
                break;
            }
            hh += cj;
            p = hh / 5;
        }
        System.out.println("五门课的平均数是" + p);*/
        int s = 0;
        for (int q = 1; q <= 10; q++) {
            s += q;
            if (s >= 20) {
                break;
            }
        }
        System.out.println("得到一个"+s+"数值");
       /* int sum = 0;
        for (int w=1;w<=10;w++){
            if (w%2==0){
                sum+=w;
            }else {
                continue;
            }
        }
        System.out.println("1-10之间的偶数和为"+sum);*/
    }
}
