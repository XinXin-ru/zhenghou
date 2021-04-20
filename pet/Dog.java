package pet;

public class Dog extends Pet {
    public void eat(){
        System.out.println("狗正在吃骨头.");
        for (; health <= 100; health += 5) {
            if (health < 100) {
                System.out.println("健康值为" + health + "可继续投喂");
            } else {
                System.out.println("健康值100已满，不可投喂");
                break;
            }
        }
    }
}
