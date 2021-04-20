package java0407;

import java.util.Scanner;

public class T {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int beichus;
        int chushu=0;
        int shang;
        try {
            System.out.println("请输入被除数：");
            beichus = input.nextInt();
            System.out.println("请输入除数：");
            chushu = input.nextInt();
            shang = beichus / chushu;
            System.out.println("商是" + shang);
        }catch(Exception e){
            System.out.println("输入的数据不符合规范");
            beichus=1;
            chushu=1;
            shang=beichus/chushu;
            System.out.println("商变为固定值" + shang);
        }
    }
}
