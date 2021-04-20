package java4.baba.java040202;

public class Students {
    public static void main(String[] args) {
        Student s1 = new Student(56899, "旺旺", 18);
        Student s2 = new Student(56677, "拉拉", 19);
//        /if ((s1.id == s2.id) && (s1.name.equals(s2.name))) {
//            System.out.println("同一对象");
//        } else {
//            System.out.println("不是同一对象");
//        }
        s1.xiangdeng(s2);
    }
}
