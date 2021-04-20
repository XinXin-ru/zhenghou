package java0416;

import java.awt.*;

public class LinkedListTest {
    public static void main(String[] args) {
        News h1=new News();
        h1.id=0;
        h1.title="韩国日本";
        h1.author="央视财经";
        h1.name="六六";

        //插入到第一个位置
        News.newsLists.addFirst(h1);

        System.out.println("获取到最新的新闻，序号是："
                        +News.newsLists.getFirst().getId()
                +"标题是："
                        +News.newsLists.getFirst().getTitle());
        System.out.println("获取到最后的新闻，序号是："
                        +News.newsLists.getLast().getId()
                +"标题是："
                        +News.newsLists.getLast().getTitle());
        News.newsLists.removeLast();
        System.out.println("删除之后新闻的总条数是"+News.newsLists.size());
        System.out.println("删除后最后一条新闻，序号是："
                +News.newsLists.getLast().getId()
                +"标题是："
                +News.newsLists.getLast().getTitle());
//        News.newsLists.getFirst();




    }
}
