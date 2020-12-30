package annotation.com.zl.reflection;

/**
 * @Description 什么叫反射
 * @Author ZhengLing
 * @Date 2020/12/30 19:24
 */
public class Test02{
    public static void main(String[] args) throws ClassNotFoundException {
        //通过反射获取类的Class对象
        User user = new User();
        Class<? extends User> aClass = user.getClass();
        Class c1 = Class.forName("annotation.com.zl.reflection.User");
        System.out.println(c1);

        Class c2 = Class.forName("annotation.com.zl.reflection.User");
        Class c3 = Class.forName("annotation.com.zl.reflection.User");

        //一个类在内存中只有一个Class对象
        //一个类被加载后，类的整个结构都会被封装在Class对象中
        System.out.println(aClass.hashCode());
        System.out.println(c1.hashCode());
        System.out.println(c2.hashCode());
        System.out.println(c3.hashCode());
        
    }
}

//实体类:pojo entity
class User{
    private String name;
    private int id;
    private int age;

    public User() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public User(String name, int id, int age) {
        this.name = name;
        this.id = id;
        this.age = age;
    }
    
    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", age=" + age +
                '}';
    }
}