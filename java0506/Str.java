package java0506;

import java.util.Scanner;

public class Str {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("请输入字符串：");
        String s= input.next();
        for (int i=0;i<s.length();i++){
//            s.charAt(i)  字符串数组;
            System.out.print(s.charAt(i)+"\t");
        }
    }
}
