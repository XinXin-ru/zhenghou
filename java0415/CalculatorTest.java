package java0415;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class CalculatorTest {
    public static void main(String[] args) {
        //实例化Class类对象cls
        Class cls = Calculator.class;
        //获取方法
        Method[] methods = cls.getDeclaredMethods();
        Method method;
        Annotation[] annotations;
        double result;

        //记录调用的方法会出现错误的个数
        int errorTimes = 0;

        try {
            //实例化一个Calculato的空对象
            Object o = cls.newInstance();
            for (int i = 0; i < methods.length; i++) {
                method = methods[i];
                //得到方法的注解
                annotations = method.getAnnotations();
                System.out.println(method.getName() + "有" + annotations.length + "个注解");
                //判断当前方法是否有注解
                if (annotations.length > 0) {
                    try {
                        //当前方法有注解，进行调用，判断是否会出现异常
                        method.invoke(o, 1, 0);
                    } catch (Exception e) {
                        //此方法出现异常，增加异常方法的个数
                        errorTimes++;
                        System.out.println(method.getName() + "方法会出现异常，错误是" + e.getCause().getMessage());
                    }
                }
            }
            System.out.println("计算器功能类有" + errorTimes + "个方法会出现异常！");

        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}

