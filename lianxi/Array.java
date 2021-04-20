package lianxi;

public class Array {
    public static void main(String[] args) {
       /* int[] arr = new int[]{8, 2, 1, 0, 3};
        int[] index = new int[]{2, 0, 3, 2, 4, 0, 1, 3, 2, 3, 3};
        String tel = "";
        for (int i = 0; i < index.length; i++) {
            tel += arr[index[i]];
        }
        System.out.println("联系方式：" + tel);

    //静态初始化
    int[][] arr1 = new int[][]{{1, 2, 3}, {4, 5, 6, 7}, {7, 8, 9, 0, 2, 3, 4}};
    int[] arr4[] = new int[][]{{2, 3}, {4, 5, 6}};
    int[] arr5[] = {{4, 5, 6}, {5, 6}};
    //动态初始化1
    int[][] arr2 = new int[3][4];
    //动态初始化2
    int[][] arr3 = new int[5][];
    //调用数组指定位置的元素
        System.out.println(arr1[0][2]);
        //遍历数组
        for (int i=0;i<arr1.length;i++){
            for (int j=0;j< arr1[i].length;j++){
                System.out.print(arr1[i][j]+"\t");
            }
            System.out.println();
        }*/
        /*Scanner input=new Scanner(System.in);
        int num=0;
        int he=0;
        System.out.println("请选择输入几个数字：");
        num=input.nextInt();
        int[] score=new int[num];
        for (int i=0;i<score.length;i++){
            System.out.println("请输入第"+(i+1)+"个数");
            int num1=input.nextInt();
            he+=num1;
        }
        System.out.println(he);
        double pjz=(double) he/ score.length;
        System.out.println("平均值为"+pjz);*/
     /*   int[] arr = new int[10];
        //创建随机10-99之间的两位数
        for (int i = 0; i < arr.length; i++) {
            //10-99两位数公式
            arr[i] = (int) ((Math.random()) * (99 - 10 + 1) + 10);
        }
        //遍历，输出i
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        //最大值
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        System.out.println("最大值为" + max);
        //最小值
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        System.out.println("最小值为" + min);
        //和
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println("和为" + sum);
        //平均数
        double ave = 0;
        ave = (double) sum / arr.length;
        System.out.println("平均数为" + ave);*/
        //声明变量
        int[] array1;
        int[] array2;
        //初始化array1
        array1 = new int[]{2, 3, 5, 7, 11, 13, 17, 19};
        //遍历，输出array1
        for (int a1 : array1
        ) {
            System.out.print(a1 + "\t");
        }
        System.out.println();
        //赋值array2变量=array1
        array2 = array1;
        //修改array2中的偶元素，赋值给array1
        for (int i = 0; i < array2.length; i++) {
            if (i % 2 == 0) {
                array2[i] = i;
            }
        }
        //输出array1
        for (int a1 : array1) {
            System.out.print(a1 + "\t");
        }
        System.out.println();
        //数组复制：array2对array1的复制
        array2 = array1;
        for (int a2 : array2
        ) {
            System.out.print(a2 + "\t");
        }
        System.out.println();

        //数组的反转：方法一
//        for (int i=0,j=array1.length-1;i<j;i++,j--){
//            int st=array1[i];
//            array1[i]=array2[j];
//            array2[j]=st;
//        }
        //方法二
        for (int i = 0; i < array1.length / 2; i++) {
            int p = array1[i];
            array1[i] = array2[array2.length - i - 1];
            array2[array2.length - i - 1] = p;
        }
        //遍历
        for (int a1 : array1
        ) {
            System.out.print(a1 + "\t");
        }
    }
}
