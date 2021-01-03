package annotation.com.zl.reflection;

/**
 * @Description 类加载器
 * @Author ZhengLing
 * @Date 2021/01/03 14:08
 */
public class Test07 {
    public static void main(String[] args) throws ClassNotFoundException {
        //获取系统类的加载器
        ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();
        System.out.println(systemClassLoader);
        
        //获取系统类加载器的父类加载器-->拓展类加载器
        ClassLoader parent = systemClassLoader.getParent();
        System.out.println(parent);
        
        //获取拓展类加载器的父类加载器-->根加载器（c/c++）
        ClassLoader parent1 = parent.getParent();
        System.out.println(parent1);
        
        //测试当前类是哪个加载器加载的
        ClassLoader classLoader = Class.forName("annotation.com.zl.reflection.Test07").getClassLoader();
        System.out.println(classLoader);

        ClassLoader classLoader1 = Class.forName("java.lang.Object").getClassLoader();
        System.out.println(classLoader1);
        
        //如何获取系统类加载器可以加载的路径
        System.out.println(System.getProperty("java.class.path"));
        /*
        D:\jdk1.8.0_201\jre\lib\charsets.jar;
        D:\jdk1.8.0_201\jre\lib\deploy.jar;
        D:\jdk1.8.0_201\jre\lib\ext\access-bridge-64.jar;
        D:\jdk1.8.0_201\jre\lib\ext\cldrdata.jar;
        D:\jdk1.8.0_201\jre\lib\ext\dnsns.jar;
        D:\jdk1.8.0_201\jre\lib\ext\jaccess.jar;
        D:\jdk1.8.0_201\jre\lib\ext\jfxrt.jar;
        D:\jdk1.8.0_201\jre\lib\ext\localedata.jar;
        D:\jdk1.8.0_201\jre\lib\ext\nashorn.jar;
        D:\jdk1.8.0_201\jre\lib\ext\sunec.jar;
        D:\jdk1.8.0_201\jre\lib\ext\sunjce_provider.jar;
        D:\jdk1.8.0_201\jre\lib\ext\sunmscapi.jar;
        D:\jdk1.8.0_201\jre\lib\ext\sunpkcs11.jar;
        D:\jdk1.8.0_201\jre\lib\ext\zipfs.jar;
        D:\jdk1.8.0_201\jre\lib\javaws.jar;
        D:\jdk1.8.0_201\jre\lib\jce.jar;
        D:\jdk1.8.0_201\jre\lib\jfr.jar;
        D:\jdk1.8.0_201\jre\lib\jfxswt.jar;
        D:\jdk1.8.0_201\jre\lib\jsse.jar;
        D:\jdk1.8.0_201\jre\lib\management-agent.jar;
        D:\jdk1.8.0_201\jre\lib\plugin.jar;
        D:\jdk1.8.0_201\jre\lib\resources.jar;
        D:\jdk1.8.0_201\jre\lib\rt.jar;
        D:\Code\javaStudy\target\classes;
        D:\IDEA\IntelliJ IDEA 2019.3.1\lib\idea_rt.jar
         */
        
        //双亲委派机制
            //java.lang.String-->
    }
}
