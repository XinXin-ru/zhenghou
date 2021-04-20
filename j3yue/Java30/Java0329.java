package j3yue.Java30;

import java.util.Scanner;

public class Java0329 {
    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
       /* System.out.println("请输入数字:");
        double max= 0.00;
        double[] num = new double[2];
        for (int i = 0; i <num.length; i++) {
            System.out.println("请输入第" + (i + 1) + "个数");
            double num1 = input.nextDouble();
            num[i]=num1;
            if (num[i]>max){
                max=num[i];
            }
        }
        System.out.println("最大值为"+max);*/
       /* System.out.println("请输入一个数：");
        int[] arr = {99, 97, 80, 78, 68};
        int[] arr1 = new int[6];
        Scanner input = new Scanner(System.in);
        int in = input.nextInt();
        int i = 0;
        for (; i < arr.length; i++) {
            if (arr[i] > in) {
                arr1[i] = arr[i];
            } else {
                break;
            }
        }
        arr1[i] = in;
        for (; i < arr.length; i++) {
            arr1[i + 1] = arr[i];
        }
        for (int j = 0; j < arr1.length; j++) {
            System.out.println(arr1[j]);
        }*/
 /*       int[] arr = {82, 63, 99, 85, 60};
        int[] arr1 = new int[5];
        for (int i = 0; i < arr.length; i++) {
            for (int t = 0; t < arr.length -1-i; t++) {
                if (arr[t] > arr[t + 1]) {
                    int a = arr[t + 1];
                    arr[t + 1] = arr[t];
                    arr[t] = a;
                }
            }
        }
        System.out.println(arr[0]+","+arr[1]+","+arr[2]+","+arr[3]+","+arr[4]);*/
        Scanner input2=new Scanner(System.in);
        System.out.println("请输入四家店的价格");
        double min=0.0;
        double[] num=new double[4];
        for (int i=0;i<num.length;i++){
            System.out.println("请输入第"+(i+1)+"家店的价格：");
            double num1=input2.nextDouble();
            num[i]=num1;
            min =num[0];
            if (num[i]<min){
                min=num[i];
            }
        }
        System.out.println("最底价格是："+min);
       /* System.out.println("请输入十个数字：");
        double num = 0.0;
        double[] sum = new double[10];
        Scanner input3 = new Scanner(System.in);
        for (int i = 0; i < sum.length; i++) {
            System.out.println("请输入第" + (i + 1) + "个数字：");
            sum[i] = input3.nextDouble();
        }
        for (int i = 0; i < sum.length; i++) {
            for (int t = 0; t < sum.length - 1 - i; t++) {
                if (sum[t] < sum[t + 1]) {
                    double temp = 0;
                    temp = sum[t + 1];
                    sum[t + 1] = sum[t];
                    sum[t] = temp;
                }
            }
        }
        for (int i = 0; i < sum.length; i++) {
            System.out.println(sum[i] + "\t");
        }*/
    }
}
