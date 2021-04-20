package java0413.lanxi;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Properties;

public class Reflect1 {
    public static void main(String[] args) {
        ClassLoader classLoader = Reflect1.class.getClassLoader();
        InputStream inputStream = classLoader.getResourceAsStream("java0413/lanxi/prop.properties");
        Properties properties = new Properties();

        try{
            properties.load(inputStream);
            String className = properties.getProperty("className");
            String methodName = properties.getProperty("methodName");

            System.out.println("className=" + className);
            System.out.println("methodName=" + methodName);

            Class clazz = Class.forName(className);
            Method method = clazz.getDeclaredMethod(methodName);

            Object o = clazz.newInstance();

            String reflectName = (String) method.invoke(o);
            System.out.println("reflectName=" + reflectName);
        }catch (IOException |NoSuchMethodException e){
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
