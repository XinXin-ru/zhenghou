package java0413.stedent;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Properties;

public class DynamicFetchClassMethod {
    public static void main(String[] args) {
        //程序中加载配置文件
        ClassLoader classLoader = DynamicFetchClassMethod.class.getClassLoader();
        InputStream inputStream = classLoader.getResourceAsStream("java0413/stedent/pro.properties");
        Properties properties = new Properties();
        try {
            properties.load(inputStream);
            //reflect.exercise.Student 类的名字
            String className = properties.getProperty("className");
            //getStudentName 类的方法
            String methodName = properties.getProperty("methodName");

            //获取到全路径类的名字，方法的名字
            System.out.println("className="+className);
            System.out.println("methodName="+methodName);

            //反射,创建一个字节码文件的对象
            Class cls = Class.forName(className);
            //相当于 Class cls=Class.forName("java0413.Student")

            //获取字节码文件中的方法
            Method method = cls.getDeclaredMethod(methodName);
            //相当于 Method methodGetStudentName=cls.getDeclaredMethod("getStudentName")

            //实例化一个字节码文件的对象，即：Student类的对象
            Object o = cls.newInstance();
            //Student o=new Student();

            //调用对象的方法，获取返回值
            String studentName = (String) method.invoke(o);
            System.out.println("studentName="+studentName);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}
