package annotation.com.zl.annotation;

import java.lang.annotation.*;

/**
 * @Description
 * @Author ZhengLing
 * @Date 2020/12/30 17:51
 */
//测试元注解
@MyAnnotation
public class Test02 {

    @MyAnnotation
    public void test() {

    }
}

//定义一个注解
//@Target   表示我们的注解可以用在什么地方
@Target(value = {ElementType.METHOD, ElementType.TYPE})

//@Retention    表示我们的注解在什么时候还有效
//runtime > class > sources
@Retention(value = RetentionPolicy.RUNTIME)

//@Documented   表示是否将我们的注解生成在JAVAdoc中
@Documented

//@Inherited    表示子类可以继承父类的注解
@Inherited
@interface MyAnnotation {

}
