package java0408;

public class Age {
    int age;
    public void setAge(int age) throws Exception {
        if (age >= 1 && age <= 100) {
            this.age = age;
//            System.out.println("age=" + age);
        } else {
//            System.out.println("输入错误");
            throw new Exception();
        }
    }

    public int getAge() {
        return age;
    }
}
