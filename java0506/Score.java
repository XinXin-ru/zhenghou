package java0506;

import java.util.Scanner;

public class Score {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double ywscore;
        double sxscore;
        double yyscore;
        double zywscore = 0;
        double zsxscore = 0;
        double zyyscore = 0;
        int arr[] = new int[3];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("请输入学生姓名：");
            String name = input.next();
            System.out.println("请输入语文成绩：");
            ywscore = input.nextDouble();
            System.out.println("请输入数学成绩：");
            sxscore = input.nextDouble();
            System.out.println("请输入英语成绩：");
            yyscore = input.nextDouble();
            double ave = (ywscore + sxscore + yyscore) / arr.length;
            System.out.println(name + "平均成绩为" + ave + "\n");
            zywscore += ywscore / arr.length;
            zsxscore += sxscore / arr.length;
            zyyscore += yyscore / arr.length;
        }
        System.out.println("三人语文的总平均成绩为" + zywscore + "\n");
        System.out.println("三人数学的总平均成绩为" + zsxscore + "\n");
        System.out.println("三人英语的总平均成绩为" + zyyscore + "\n");
    }
}
