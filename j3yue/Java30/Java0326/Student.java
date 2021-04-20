package j3yue.Java30.Java0326;

import java.util.Scanner;

public class Student {
    String name;
    Double score;
    Scanner input = new Scanner(System.in);
    public String name1() {
        System.out.println("请输入姓名：");
        name = input.next();
        return name;
    }
    public String score1() {
        System.out.println("请输入成绩：");
        score = input.nextDouble();
        if (score < 60) {
            score += 2;
            System.out.println("学员" + name + "成绩" + score);
        } else {
            System.out.println("学员" + name + "成绩" + score);
        }
        return score1();
    }
}
