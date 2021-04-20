package java0414;

public class People1 {
    String name;
    String sex;
    long mobile;

    public static void fff(People1[] arr) {
        People1 p1 = new People1();
        p1.name = "强强";
        p1.mobile = 11111111;
        p1.sex = "男";
        People1 p2 = new People1();
        p2.name = "旺旺";
        p2.mobile = 22222222;
        p2.sex = "男";
        People1 p3 = new People1();
        p3.name = "二二";
        p3.mobile = 33333333;
        p3.sex = "男";
        People1 p4 = new People1();
        p4.name = "荣荣";
        p4.mobile = 44444444;
        p4.sex = "男";
        arr[0] = p1;
        arr[1] = p2;
        arr[2] = p3;
        arr[3] = p4;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public long getMobile() {
        return mobile;
    }

    public void setMobile(long mobile) {
        this.mobile = mobile;
    }
}
