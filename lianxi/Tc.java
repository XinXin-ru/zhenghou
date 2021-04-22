package lianxi;

public class Tc {
    public static void main(String[] args) {
        /*//定义数组
        int[] arr=new int[]{23,5,78,9,1,99,3,467,-9,-21};
        //控制比较轮数
        for (int i=0;i<arr.length-1;i++){
            //每轮比较多少
            for (int j=0;j<arr.length-1-i;j++){
                //定义变量
                int temp;
                if (arr[j]>arr[j+1]){
                    temp=arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+"\t");
        }*/
        //冒泡排序
        int[] arr1 = new int[]{34, 5, 22, -98, 6, -76, 0, -3};
        for (int i = 0; i < arr1.length - 1; i++) {
            for (int j = 0; j < arr1.length - 1 - i; j++) {
                if (arr1[j] > arr1[j + 1]) {
                    int temp1 = arr1[j + 1];
                    arr1[j + 1] = arr1[j];
                    arr1[j] = temp1;
                }
            }
        }
        for (Object obj : arr1
        ) {
            System.out.print(obj + "\t");
        }
        System.out.println();
        //反转
        for (int start=0,end=arr1.length-1;start<end;start++,end--){
            int tenp2=arr1[start];
            arr1[start]=arr1[end];
            arr1[end]=tenp2;
        }
        for (Object obj:arr1
             ) {
            System.out.print(obj+"\t");
        }
        System.out.println();
        //复制
        int[] arry;
        arry=arr1;
        for (Object obj:arry
             ) {
            System.out.print(obj+"\t");
        }
    }
}
