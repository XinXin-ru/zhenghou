package java0416;

public class PrintNews {
    public static void main(String[] args) {
        System.out.println("总共有："+News.newsLists.size()+"条新闻");
        News news;
        for (int i=0;i<News.newsLists.size();i++){
            news=News.newsLists.get(i);
            System.out.println("第"+news.getId()+"条新闻    "+news.getTitle());
        }
        News h1Bro=new News();
        h1Bro.id=1;
        h1Bro.title="美国已经1";
        h1Bro.author="徐徐许1";
        h1Bro.name="孟子为1";
        System.out.println("和h1一样的对象存在吗"+News.newsLists.contains(h1Bro));
//         和h1一样的对象存在吗 false
        News.newsLists.add(h1Bro);
        System.out.println("和h1一样的对象存在吗"+News.newsLists.contains(h1Bro));
        //添加后，和h1一样的对象存在吗  true
    }
}
