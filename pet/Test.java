package pet;

public class Test {
    public static void main(String[] args) {
        pet.Master Master1 =new Master();
        Penguin penguinMaster=new Penguin();
        Master1.feed(penguinMaster);
//        Master1.feed(new Penguin());
        Dog dogMaster=new Dog();
        Master1.feed(dogMaster);
//        Master1.feed(new Dog());
    }
}
