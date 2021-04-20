package java0408.zdyyc;

import java.util.Scanner;

public class User {
    public static void main(String[] args) {}
    public static void method() throws Zdyyc{
//        已有用户名
        String[]username={"ll","ee","ww"};
//       判断输入的用户名是否已存在数组中，如果存在，抛出异常信息
//       接收新的用户名
        Scanner scanner=new Scanner(System.in);
        String newName=scanner.next();
        for (int i=0;i<username.length;i++){
            if (newName.equals(username[i])){
                throw new Zdyyc();
            }
        }
        System.out.println("");
    }
}
