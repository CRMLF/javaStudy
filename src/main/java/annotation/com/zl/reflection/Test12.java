package annotation.com.zl.reflection;


import java.lang.annotation.*;
import java.lang.reflect.Field;

/**
 * @Description 练习反射操作注解
 * @Author ZhengLing
 * @Date 2021/01/05 21:34
 */
public class Test12 {
    public static void main(String[] args) throws Exception {
        Class<?> c1 = Class.forName("annotation.com.zl.reflection.Student2");

        //通过反射获取注解
        Annotation[] annotations = c1.getAnnotations();
        for (Annotation annotation : annotations) {
            System.out.println(annotation);
        }
        
        //获得注解的value的值
        Tableling tableling = c1.getAnnotation(Tableling.class);
        String value = tableling.value();
        System.out.println(value);
        
        //获得类指定的注解
        Field name = c1.getDeclaredField("name");
        Fieldling annotation = name.getAnnotation(Fieldling.class);
        System.out.println(annotation.columnName());
        System.out.println(annotation.type());
        System.out.println(annotation.length());
    }
}

@Tableling("db_student")
class Student2 { 
    @Fieldling(columnName = "db_id", type = "int", length = 10)
    private int id;
    @Fieldling(columnName = "db_age", type = "int", length = 10)
    private int age;
    @Fieldling(columnName = "db_name", type = "varchar", length = 4)
    private String name;

    public Student2(int id, int age, String name) {
        this.id = id;
        this.age = age;
        this.name = name;
    }

    public Student2() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student2{" +
                "id=" + id +
                ", age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}

//类名的注解
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@interface Tableling {
    String value();
}

//属性的注解
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@interface Fieldling {
    String columnName();

    String type();

    int length();
}
