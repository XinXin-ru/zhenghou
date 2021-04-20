package java0416.oerson;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Person {
    String name;
    int age;
    String sex;
    String interest;
    static List<Person> listPerson=new ArrayList<Person>();
     static {
         Person p1=new Person();
         p1.name="lala";
         p1.age=10;
         p1.sex="nan";
         p1.interest="kandianshi";

         Person p2=new Person();
         p2.name="haha";
         p2.age=12;
         p2.sex="nv";
         p2.interest="cjifan";

         Person p3=new Person();
         p3.name="dada";
         p3.age=16;
         p3.sex="nv";
         p3.interest="huaxue";

         Person p4=new Person();
         p4.name="fafa";
         p4.age=9;
         p4.sex="nan";
         p4.interest="ku";

         listPerson.add(p1);
         listPerson.add(p2);
         listPerson.add(p3);
         listPerson.add(p4);
     }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getInterest() {
        return interest;
    }

    public void setInterest(String interest) {
        this.interest = interest;
    }
}
