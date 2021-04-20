package java4.baba.java0401;

public class Dog extends Animal{
    String eat;

    public Dog() {
        this.name="王子";
        this.sex="男";
        this.eat="骨头，狗粮";
    }

    public String getEat() {
        return eat;
    }

    public void setEat(String eat) {
        this.eat = eat;
    }


}
