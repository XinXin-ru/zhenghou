package java0408;

import java.util.Scanner;

public class AgeTest {
    public static void main(String[] args) {
        System.out.println("请输入年龄：");
        Scanner input = new Scanner(System.in);
        try {
        int num = input.nextInt();
        Age t = new Age();
            t.setAge(num);
            System.out.println("年龄是"+t.getAge());
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("输入错误，年龄必须在1到100之间");
        }
    }
}
