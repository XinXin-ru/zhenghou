package java0414;

import java0413.stedent.DynamicFetchClassMethod;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.InputMismatchException;
import java.util.Properties;

public class PeopleMethod1 {
    public static void main(String[] args) {
        //程序中加载文件
        ClassLoader classLoader = DynamicFetchClassMethod.class.getClassLoader();
        InputStream inputStream = classLoader.getResourceAsStream("java0414/pro.propertiess1");
        Properties properties = new Properties();

        try {
            properties.load(inputStream);
            String className = properties.getProperty("className");

            //创建字节码文件中的对象
            Class cls = Class.forName(className);
            //实例化字节码文件中的对象
            Object object = cls.newInstance();
            //属性
            Field[] field = cls.getDeclaredFields();

            //数组
            People1[] arr = new People1[4];
            People1.fff(arr);
            for (int a = 0; a < arr.length; a++) {
                object = arr[a];
                for (int i = 0; i < field.length; i++) {
                    String s = "get" + field[i].getName().substring(0, 1).toUpperCase() + field[i].getName().substring(1);
//                System.out.println(s);

                    //调用对象的方法，获取返回值
                    Method method = cls.getDeclaredMethod(s);
                    Object peopleName = method.invoke(object);
                    System.out.print("\t\t" + peopleName);
                }
                System.out.println();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}
