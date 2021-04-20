package java0416.oerson;

import java.util.Scanner;

public class ListPerson {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("共有" + Person.listPerson.size() + "个同学");
        System.out.println("分别是：");
        for (Person p : Person.listPerson) {
            System.out.println("姓名：" + p.getName() + "   " + "年龄：" + p.getAge() + "   " + "性别：" + p.getSex() + "   " + "兴趣：" + p.getInterest());
        }
        System.out.println("请输入想要查找的同学姓名");
        String stu = input.next();
        boolean flag = true;
        for (Person p : Person.listPerson) {
            if (p.getName().equals(stu)) {
                System.out.println("该同学的信息为：" + "\n" +
                        "姓名：" + p.getName() + "   " + "年龄：" + p.getAge() + "   " + "性别：" + p.getSex() + "   " + "兴趣：" + p.getInterest());
                flag = false;
//                continue;
            }
        }
        if (flag) {
            System.out.println("查无此人！");
        }
        System.out.println("请输入想要删除人员的姓名：");
        String x = input.next();

        for (Person p : Person.listPerson) {
            System.out.println("姓名：" + p.getName() + "   " + "年龄：" + p.getAge() + "   " + "性别：" + p.getSex() + "   " + "兴趣：" + p.getInterest());
            if (x.equals(p.getName())) {
                Person.listPerson.remove(p);
            }
            System.out.println("姓名：" + p.getName() + "   " + "年龄：" + p.getAge() + "   " + "性别：" + p.getSex() + "   " + "兴趣：" + p.getInterest());
        }
    }
}
