package java0415.urse;


import java.lang.reflect.Method;
import java.util.Scanner;

public class UrseTest {
    @UrseError()
    boolean urseTest(String inName, String inPassword) {
        Class cls = UrseTest.class;
        UrseError urseError = null;

        try {
            Method method = cls.getDeclaredMethod("urseTest", String.class, String.class);
            urseError = method.getAnnotation(UrseError.class);
            System.out.println("用户名是：" + urseError.name());
            System.out.println("配置密码是：" + "******");

        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
        return (inPassword.equals(urseError.password())) && (inName.equals(urseError.name()));

    }

    public static void main(String[] args) {
        UrseTest urseTest = new UrseTest();
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入用户名：");
        String u = scanner.next();
        System.out.println("请输入密码：");
        String p = scanner.next();

//        this.urseTest();
        if (urseTest.urseTest(u, p)) {
            System.out.println("输入正确");
        } else {
            System.out.println("输入错误");
        }
    }
}
