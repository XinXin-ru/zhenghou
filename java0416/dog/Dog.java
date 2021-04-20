package java0416.dog;

import java.util.LinkedList;

public class Dog {
    String name;
    String type;
    static LinkedList<Dog> dogLists=new LinkedList<Dog>();
    static {
//        Dog g1=new Dog();
//        g1.name="菲菲";
//        g1.type="拉布拉多";

        Dog g2=new Dog();
        g2.name="欧欧";
        g2.type="雪纳瑞";

        Dog g3=new Dog();
        g3.name="亚亚";
        g3.type="拉布拉多";

        Dog g4=new Dog();
        g4.name="美美";
        g4.type="雪纳瑞";

//        dogLists.add(g1);
        dogLists.add(g2);
        dogLists.add(g3);
        dogLists.add(g4);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
