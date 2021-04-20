package j3yue.Java30;

import java.util.Scanner;

public class Java0330 {
    public static void main(String[] args) {
        /*double[][] score = new double[][]{
                {63, 95, 86, 77, 59},
                {100, 63, 69, 74, 99},
                {82, 91, 67, 52, 100},
        };
        double classScore = 0.0;
        double score1 = 0.0;
        double score2 = 0.0;
        for (int a = 0; a < score.length; a++) {
            classScore = 0.0;
            for (int i = 0; i < score[0].length; i++) {
                classScore += score[a][i];
                score1 += score[a][i];
                score2++;
            }
            System.out.println("第" + (a + 1) + "个班级的总成绩=" + classScore);
        }
        System.out.println("总成绩=" + score1);
        System.out.println("平均分=" + (score1 / score2));*/
        Dog test = new Dog();
        Scanner input = new Scanner(System.in);
        System.out.println("欢迎进入宠物管理系统！");
        System.out.println("请输入新增小狗的姓名：");
        String name = input.next();
        test.setName(name);
        System.out.println("请选择小狗性别：（1.公仔  2.母妹）");
        String sex = input.next();
        test.setSex(sex);
        System.out.println("请选择小狗年龄：（1~20之间）");
        Double age = input.nextDouble();
        test.setAge(age);
        System.out.println("请选择小狗的健康值：（1~100之间）");
        Double health = input.nextDouble();
        test.setHealth(health);
        System.out.println("小狗的基本信息：");
        System.out.println("宠物的名字：" + test.getName() + "   " + "性别是：" + test.getSex() + "   "
                + "年龄是：" + test.getAge() + "   " + "健康值：" + test.getHealth());
    }
}
