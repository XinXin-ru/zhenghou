package java0419.hashmap;

import java.util.Scanner;

public class HashMapTest {
    public static void main(String[] args) {
        System.out.println("请输入英文名：");
        Scanner input = new Scanner(System.in);
        String yName = input.next();
        System.out.println(HashMap.hachMap.get(yName).sex);
    }
}
