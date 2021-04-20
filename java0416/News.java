package java0416;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class News {
    int id;
    String name;
    String title;
    String author;

    static LinkedList<News> newsLists= new LinkedList<>();
    static {
        News h1 = new News();
        h1.id = 1;
        h1.title = "美国已经1";
        h1.author = "徐徐许1";
        h1.name = "孟子为1";

        News h2 = new News();
        h2.id = 2;
        h2.title = "美国已经2";
        h2.author = "徐徐许2";
        h2.name = "孟子为2";

        News h3 = new News();
        h3.id = 3;
        h3.title = "美国已经3";
        h3.author = "徐徐许3";
        h3.name = "孟子为3";

        newsLists.add(h1);
        newsLists.add(h2);
        newsLists.add(h3);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
