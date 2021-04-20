package com.shangguigu.DuoTai;

/*
多态在实际开发中的作用，以下以主人喂养宠物为例说明多态的作用；
    1、分析：主人喂养宠物这个场景要实现进行类型的抽象
        -主人【类】
        -主人可以喂养宠物，所以主人要有喂养的这个动作，即是方法feed
        -宠物【类】
        -宠物可以吃东西，所以宠物有吃东西的这个动作，即是方法eat
    2、面向对象编程的核心：定义好类，然后将实例化为对象，给一个环境提供驱使一下，让各个对象之间协作起来形成一个系统

 */
public class CatMasterTest {
    public static void main(String[] args) {


        //创建主人对象新如
        com.shangguigu.DuoTai.Demo02Master xinru = new Demo02Master();
        //创建企鹅对象，新新
        Demo01Penguin xinxin = new Demo01Penguin();
        //主人喂养新新，在eat方法传入企鹅的对象——也就是新新
        /*
        给eat方法，两种传入对象的方式，此处的方法传入的是对象。看创建对象new的过程就懂了
        选择一种，即可。我这里会出现重复的结果就因为是，写了两遍。
         */
        xinru.feed(xinxin);
        xinru.feed(new Demo01Penguin());

        //创建狗狗对象，如如
        Demo03Dog erHaRuRu = new Demo03Dog();
        //主人喂养如如，在eat方法传入狗狗的对象——也就是二哈如如
        /*
       给eat方法，两种传入对象的方式，此处的方法传入的是对象。看创建对象new的过程就懂了
         */
        xinru.feed(erHaRuRu);
        xinru.feed(new Demo03Dog());
    }
}
