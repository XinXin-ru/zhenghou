package java0408;

import java.util.Scanner;

public class Course {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入1-3任意数字 1：数学  2：语文  3：英语");
        try {
            int num = input.nextInt();
            String[] arr = new String[]{"数学", "语文", "英语"};
            for (int i = 0; i < arr.length; i++) {
                if (num > 3) {
                    System.err.println("输入错误");
                    break;
                }
                if (i == (num - 1)) {
                        System.out.println("该科目为" + arr[i]);
                        break;
                }
            }
        } catch (Exception e) {
            System.err.println("错误提示：请输入1-3任意数字");
            e.printStackTrace();
            System.out.println("e.getMessage()=" + e.getMessage());
            e.printStackTrace();

        } finally {
            System.out.println("欢迎提出建议");
        }
    }
}
