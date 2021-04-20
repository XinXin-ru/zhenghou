package j3yue.Java30.Java0331;

import java.util.Scanner;

public class Static01 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        for ( Static02.vote=0;Static02.vote<10;Static02.vote++){
            System.out.println("欢迎投票，请输入姓名：");
            String name=input.next();
            System.out.println(name+"投票成功！");
        }
        System.out.println("投票结束！");
    }
}
