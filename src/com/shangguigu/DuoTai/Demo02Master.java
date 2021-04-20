package com.shangguigu.DuoTai;
/**
主人
 */

/*
public class Demo02Master {
   //主人
    /**
     * 喂养宠物
     此方式并没有用JAVA语言中的多态机制，存在的缺点就是当前Master类的扩展行很差，因为只要加一个宠物，MASTER类就得加方法

    public void feed(Demo01Penguin c){//C是引用
        c.eat();
        }
    public void feed(Demo03Penguin d){//D是引用
        d.eat();
    }
 //Master和Cat和Dog这两个类型的关联程度耦合性太高了，扩展能力差
 */

//降低程序的耦合度【解耦合】，提高程序的扩展立【一直都是软件开发的一个很重要的目标】

public class Demo02Master{
    //主人喂养宠物
    public void feed(Demo04Pet pet){
//       / Demo04Pet pet = new Demo03Dog（）

        //Demo04Pet pet = mew Demo01Penguin,取决与主人当时喂养什么宠物
        //就是父类型引用指向子类型对象
        //编译阶段，程序调用的的eat方法是Demo04Pet的eat方法,静态绑定
        //但是运行阶段，程序使用的却是，子类通过继承的eat方法，动态绑定
        pet.eat();
    }
}