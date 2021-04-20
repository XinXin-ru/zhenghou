package java4.baba.java0401;

public class Cat extends Animal{
    String eat;

    public Cat() {
        this.name="公主";
        this.sex="女";
        this.eat="鱼，猫粮，鸡胸肉";
    }

    public String getEat() {
        return eat;
    }

    public void setEat(String eat) {
        this.eat = eat;
    }
}
