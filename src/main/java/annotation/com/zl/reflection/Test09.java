package annotation.com.zl.reflection;

import com.sun.org.apache.xalan.internal.xsltc.compiler.util.MatchGenerator;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * @Description 动态的创建对象，通过反射
 * @Author ZhengLing
 * @Date 2021/01/05 17:58
 */
public class Test09 {
    public static void main(String[] args) throws Exception {
        //获得一个Class对象
        Class c1 = Class.forName("annotation.com.zl.reflection.User");

        //构造一个对象
        //调用了类的无参构造器
        User user = (User) c1.newInstance();
//        System.out.println(user);

        //通过构造器创建对象
        Constructor constructor = c1.getDeclaredConstructor(String.class, int.class, int.class);
        Object user2 = constructor.newInstance("凌志", 001, 20);
//        System.out.println(user2);

        //通过反射调用普通方法
        User user3 = (User) c1.newInstance();
        //通过反射获取一个方法
        Method setName = c1.getDeclaredMethod("setName", String.class);
        //invoke ： 激活
        setName.invoke(user3, "禽兽");
//        System.out.println(user3.getName());

        //通过反射操作属性
        User user4 = (User) c1.newInstance();
        Field name = c1.getDeclaredField("name");
        
        //不能直接操作私有属性，我们需要关闭程序的安全监测，属性或方法的setAccessible(true);
        name.setAccessible(true);
        name.set(user4,"张稀哲");
        System.out.println(user4.getName());
    }
}
