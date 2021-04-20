package java4.baba;

import java.util.Scanner;

public class Text {


    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        Shushu u=new Shushu();
        Me m=new Me();
        Sister s=new Sister();

        System.out.println("请输入姓名：");
        m.name = input.next();
        System.out.println("请输入爱好：");
        Me.hobby = input.next();
//        Me.setHobby(input.next());

        System.out.println("请输入姓名：");
        s.name = input.next();
        System.out.println("请输入爱好：");
        Sister.hobby = input.next();
//        Sister.setHobby( input.next());


        System.out.println("请输入姓名：");
        u.name = input.next();
        System.out.println("请输入爱好：");
//        Shushu.hobby = input.next();
        Shushu.setHobby( input.next());

//        System.out.println(m.name);
//        System.out.println(s.name);
//        System.out.println(u.name);
//
//        System.out.println(Me.hobby);
//        System.out.println(Sister.hobby);
//        System.out.println(Shushu.hobby);

        if ((Me.hobby.equals(Sister.hobby)) && (Me.hobby.equals(Shushu.getHobby()))) {
            System.out.println(m.name + "\t" + Me.hobby);
            System.out.println(s.name + "\t" + Sister.hobby);
            System.out.println(u.name + "\t" + Shushu.getHobby());
        } else if (Me.hobby.equals(Sister.hobby)) {
            System.out.println(m.name + "\t" + Me.hobby);
            System.out.println(s.name + "\t" + Sister.hobby);
        } else if (Me.hobby.equals(Shushu.getHobby())) {
            System.out.println(u.name + "\t" + Shushu.getHobby());
            System.out.println(m.name + "\t" + Me.hobby);
        } else if (Sister.hobby.equals(Shushu.getHobby())) {
            System.out.println(s.name + "\t" + Sister.hobby);
            System.out.println(u.name + "\t" + Shushu.getHobby());
        } else {
            System.out.println("无相同");
        }











        /*Scanner input = new Scanner(System.in);
        Me m = new Me();
        Sister s = new Sister();
        Uncle u = new Uncle();

        System.out.println("请输入姓名：");
        m.name = input.next();
        System.out.println("请输入爱好：");
        Me.hobby = input.next();

        System.out.println("请输入姓名：");
        s.name = input.next();
        System.out.println("请输入爱好：");
        Sister.hobby = input.next();


        System.out.println("请输入姓名：");
        u.name = input.next();
        System.out.println("请输入爱好：");
        u.hobby = input.next();

        if ((Me.hobby.equals(Sister.hobby)) && (Me.hobby.equals(u.hobby))) {
            System.out.println(m.getName() + "\t" + Me.hobby);
            System.out.println(s.getName() + "\t" + Sister.getHobby());
            System.out.println(u.getName() + "\t" + u.hobby);
        } else if (Me.hobby.equals(Sister.hobby)) {
            System.out.println(m.getName() + "\t" + Me.hobby);
            System.out.println(u.getName() + "\t" + u.hobby);
        } else if (Me.hobby.equals(u.hobby)) {
            System.out.println(m.getName() + "\t" + Me.hobby);
            System.out.println(u.getName() + "\t" + u.hobby);
        } else if (Sister.hobby.equals(u.hobby)) {
            System.out.println(s.getName() + "\t" + u.hobby);
            System.out.println(s.getName() + "\t" + u.hobby);
        } else {
            System.out.println("无相同");
        }*/


    }
}
