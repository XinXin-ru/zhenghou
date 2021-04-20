package j3yue.Java30;

public class Dog {
    public String name;
      static String sex;
     Double age;
     protected Double health;

    public String getName() {
        return name;
    }

    public  static void setName(String name) {

    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        if ("1".equals(sex)) {
            sex = "公仔";
            this.sex = sex;
        } else if ("2".equals(sex)) {
            sex = "母妹";
            this.sex = sex;
        } else {
            sex = "输入错误！";
            this.sex = sex;
        }
    }

    public double getAge() {
        return age;
    }

    public void setAge(double age) {
        if (age >= 1 && age <= 20) {
            this.age = age;
        } else {
            age = 1;
            this.age = age;
        }
    }

    public double getHealth() {
        return health;
    }

    public void setHealth(double health) {
        if (health >= 1 && health <= 100) {
            this.health = health;
        } else {
            health = 60;
            this.health = health;
        }
    }
}
