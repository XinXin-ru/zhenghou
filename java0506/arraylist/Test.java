package java0506.arraylist;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("名著名称以及人物名称：");
 /*       Books a ;
        for (int i=0;i<Books.a.size();i++){
            a=Books.a.get(i);
            String t=Books.a.get(i).getTitle();
            String n=Books.a.get(i).getName();
            System.out.println(a.getTitle()+a.getName());
        }*/
        for (Books books : Books.a
        ) {
            System.out.println("名著名称：" + books.getTitle() + "\n" + "人物名字：" + books.getName() + "\n");
        }
        System.out.println("请输入想要查找的名著：");
        String mingzhu = input.next();
        boolean flag = true;
        for (Books books : Books.a
        ) {
            if (books.getTitle().equals(mingzhu)) {
                System.out.println("名著名称：" + books.getTitle() + "\n" + "人物名字：" + books.getName() + "\n");
                flag = false;
            }
        }
        if (flag) {
            System.out.println("未查找到此书籍！");
        }
    }
}
