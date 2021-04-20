import java.util.Scanner;

public class School {
    public static void main(String[] args) {
  /*      Person xueyuan = new Person();
        xueyuan.name="张浩";
        xueyuan.age =10;
        xueyuan.attend="s1班";
        xueyuan.interest="篮球";
        xueyuan.study();
        Person laoshi = new Person();
        laoshi.name="王老师";
        laoshi.magor="计算机";
        laoshi.course="使用Java语言理解小程序逻辑";
        laoshi.tage=5;
        laoshi.teach();*/
//        1.接受用户输入的信息:年龄，姓名
//        2.创建School的对象
//        3.判断游客的年龄，输入门票价格
     /*   Scanner scanner=new Scanner(System.in);
        for (int i = 0; i <11; i++) {
        System.out.println("请输入姓名：");
        String name=scanner.next();
        if (name=="n"){
            System.out.println("退出程序");
            break;
        }
        System.out.println("请输入年龄：");
        int age=scanner.nextInt();
        String prinInfo="";
        if (age<=12){
            prinInfo = "免费";
        }else if (age>12 && age<=20){
            prinInfo = "40元";
        }else if (age>20&& age<=50){
            prinInfo="80元";
        }else {
            prinInfo=" 35元";
        }
        System.out.println(name+"的年龄为:"+age+","+"门票价格为:"+prinInfo);
        }*/
   /*     String name1 = "拉拉";
        String code1 = "12345";
        Scanner input = new Scanner(System.in);
        System.out.println("请输入用户名：");
        String name = input.next();
        System.out.println("请输入密码：");
        String code = input.next();
        if (name1.equals(name) && code1.equals((code))) {
            System.out.println("请输入新密码：");
            String newcode = input.next();
            System.out.println("修改密码成功，你的新密码为：" + newcode);
        } else {
            System.out.println("输入错误");
        }*/
        Person gouqi=new Person();
        gouqi.name="枸杞";
        gouqi.colour="红色";
        gouqi.region="宁夏";
        gouqi.gq();
        Person xys=new Person();
        xys.name="西洋参";
        xys.colour="白色";
        xys.region="主产美国";
        xys.xy();
        Person roseTea=new Person();
        roseTea.name="玫瑰花茶";
        roseTea.colour="红色";
        roseTea.region="中国";
        roseTea.mg();
    }
}