package java0414;

import java0413.stedent.DynamicFetchClassMethod;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Properties;

public class PeopleMethod {
    public static void main(String[] args) {
        //程序中加载配置文件
        ClassLoader classLoader = DynamicFetchClassMethod.class.getClassLoader();
        InputStream inputStream = classLoader.getResourceAsStream("java0414/pro.properties");
        Properties properties = new Properties();

        try {
            properties.load(inputStream);
            String className = properties.getProperty("className");
            /*String methodName = properties.getProperty("methodName");
            String methodSex = properties.getProperty("methodSex");
            String methodMobile = properties.getProperty("methodMobile");*/
            /*//获取字节码文件中的方法
            Method method = cls.getDeclaredMethod(methodName);
            Method method1 = cls.getDeclaredMethod(methodSex);
            Method method2 = cls.getDeclaredMethod(methodMobile);*/
            //创建字节码文件中的对象
            Class cls = Class.forName(className);
            //实例化字节码文件的对象
            Object object = cls.newInstance();
            Field[] field = cls.getDeclaredFields();

            People p1 = new People();
            p1.name = "强强";
            p1.mobile = 11111111;
            p1.sex = "男";
            People p2 = new People();
            p2.name = "旺旺";
            p2.mobile = 22222222;
            p2.sex = "男";
            People p3 = new People();
            p3.name = "二二";
            p3.mobile = 33333333;
            p3.sex = "男";
            People p4 = new People();
            p4.name = "荣荣";
            p4.mobile = 44444444;
            p4.sex = "男";
            People[] arr = new People[]{p1, p2, p3, p4};
            for (int a = 0; a < arr.length; a++) {
                object = arr[a];
                for (int i = 0; i < field.length; i++) {
                    String s = "get" + field[i].getName().substring(0, 1).toUpperCase() + field[i].getName().substring(1);
//                System.out.println(s);
                    Method method = cls.getDeclaredMethod(s);
                    Object peopleName = method.invoke(object);
                    System.out.print("\t\t" + peopleName);
                }
                System.out.println();
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }

    }
}
