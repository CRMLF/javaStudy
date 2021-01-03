package annotation.com.zl.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * @Description
 * @Author ZhengLing
 * @Date 2021/01/03 15:20
 */
public class Test08 {
    public static void main(String[] args) throws Exception {
        Class<?> c1 = Class.forName("annotation.com.zl.reflection.User");
        
        //获得类的名字
            //获得包名 + 类名
        System.out.println(c1.getName());
            //获得类名
        System.out.println(c1.getSimpleName());
        
        //获得类的属性
            //只能找到public属性
        Field[] fields = c1.getFields();
        
            //能找到全部属性
        fields = c1.getDeclaredFields();
        for (Field field : fields) {
            System.out.println(field);
        }

            //获指定属性的值
        Field name = c1.getDeclaredField("name");
        System.out.println(name);
        
        //获得类的方法
            //获得本类及其父类的全部public方法
        Method[] methods = c1.getMethods();
        for (Method method : methods) {
            System.out.println(method);
        }
        System.out.println("=======================================");
        
            //获得本类的所有方法
        Method[] declaredMethods = c1.getDeclaredMethods();
        for (Method declaredMethod : declaredMethods) {
            System.out.println(declaredMethod);
        }
        
            //获得指定方法
        Method getName = c1.getMethod("getName", null);
        Method setName = c1.getMethod("setName", String.class);
        System.out.println(getName);
        System.out.println(setName);

        //获得类的构造器
            //获得public的构造器
        Constructor<?>[] constructors = c1.getConstructors();
        for (Constructor<?> constructor : constructors) {
            System.out.println(constructor);
        }

            //获得全部的构造器
        Constructor<?>[] declaredConstructors = c1.getDeclaredConstructors();
        for (Constructor<?> declaredConstructor : declaredConstructors) {
            System.out.println(declaredConstructor);
        }
        
            //获得指定的构造器
        Constructor<?> declaredConstructor = c1.getDeclaredConstructor(String.class, int.class, int.class);
        System.out.println(declaredConstructor);

    }
}
