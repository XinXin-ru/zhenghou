package java0416.dog;

public class LinkedLIstDog {
    public static void main(String[] args) {
        Dog g1=new Dog();
        g1.name="菲菲";
        g1.type="拉布拉多";
        Dog.dogLists.addFirst(g1);

        System.out.println("第一条狗狗的名字是：" + Dog.dogLists.getFirst().getName()
                + "    " + "品种是：" + Dog.dogLists.getFirst().getType());
        System.out.println("最后一条狗狗的名字是：" + Dog.dogLists.getLast().getName()
                + "    " + "品种是：" + Dog.dogLists.getLast().getType());

        System.out.println("***************************************");
        System.out.println("删除两条狗狗后");
        Dog.dogLists.removeFirst();
        Dog.dogLists.removeLast();
        System.out.println("删除后第一条狗狗的名字是：" + Dog.dogLists.getFirst().getName()
                + "    " + "品种是：" + Dog.dogLists.getFirst().getType());
        System.out.println("删除后最后一条狗狗的名字是：" + Dog.dogLists.getLast().getName()
                + "    " + "品种是：" + Dog.dogLists.getLast().getType());
    }
}
