package java4.baba.java040202;

public class Student {
    int id;
    String name;
    int age;

    public Student(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }
    public  void xiangdeng(Student s){
        if ((this.id == s.id) && (this.name.equals(s.name))) {
        System.out.println("同一对象");
    } else {
        System.out.println("不是同一对象");
    }

    }
}

