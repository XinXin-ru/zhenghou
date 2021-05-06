package java0506.arraylist;

import java.util.List;
import java.util.Scanner;

public class Books {
    private String title;
    private String name;
    static List<Books> a=new java.util.ArrayList<>();
    static {
        Books b1=new Books();
        b1.title="三国演义";
        b1.name="刘备 曹操";
        Books b2=new Books();
        b2.title="射雕英雄传";
        b2.name="郭靖 黄蓉";
        Books b3=new Books();
        b3.title="倚天屠龙记";
        b3.name="张无忌 赵敏";
        a.add(b1);
        a.add(b2);
        a.add(b3);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
