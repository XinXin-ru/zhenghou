package java0415.door;

import java0415.urse.UrseError;

import java.lang.reflect.Method;

@OpenDoorError
public class OpenDoor {
    @OpenDoorError
    boolean openDoor(String inPassword) {
        Class cls = OpenDoor.class;
        //获取类上定义的注解
        OpenDoorError openDoorError1 = (OpenDoorError) cls.getAnnotation(OpenDoorError.class);
        System.out.println("openDoorError1=" + openDoorError1);
        OpenDoorError openDoorError = null;
        try {
            //获取指定的方法
            Method method = cls.getDeclaredMethod("openDoor", String.class);
            //获取方法上面的注解
            openDoorError = method.getAnnotation(OpenDoorError.class);
//            获取注解上的属性值
            System.out.println("方法上的注解配置口令是：" + openDoorError.password());
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }

        return inPassword.equals(openDoorError.password());
    }

    public static void main(String[] args) {
        OpenDoor openDoorError = new OpenDoor();
        boolean r = openDoorError.openDoor("444444");
        if (r) {
            System.out.println("口令正确，芝麻开门");
        } else {
            System.out.println("输入错误");
        }
    }
}
