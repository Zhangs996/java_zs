package 枚举类与注解.jdk中4个基本的元注解的使用;

import org.junit.Test;
import 枚举类与注解.如何自定义注解.MyAnnotation;
import 面向对象中.super详解.Student;

import java.lang.annotation.Annotation;
/**
 * 注解的使用


 *   3.如何自定义注解：参照@SuppressWarnings定义
 *        ① 注解声明为：@interface
 *        ② 内部定义成员，通常使用value表示
 *        ③ 可以指定成员的默认值，使用default定义
 *        ④ 如果自定义注解没有成员，表明是一个标识作用。
 *
 *        如果注解有成员，在使用注解时，需要指明成员的值。
 *        自定义注解必须配上注解的信息处理流程(使用反射)才有意义。
 *        自定义注解通过都会指明两个元注解：Retention、Target
 *
 *
 *   4.jdk 提供的4种元注解
 *     元注解：对现有的注解进行解释说明的注解
 *     Retention:指定所修饰的 Annotation 的生命周期：SOURCE\CLASS（默认行为）\RUNTIME
 *               只有声明为RUNTIME生命周期的注解，才能通过反射获取。
 *     Target:用于指定被修饰的 Annotation 能用于修饰哪些程序元素
 *     *******出现的频率较低*******
 *     Documented:表示所修饰的注解在被javadoc解析时，保留下来。
 *     Inherited:被它修饰的 Annotation 将具有继承性。
 *
 * 5.通过反射获取注解信息 ---到反射内容时系统讲解
 */
public class AnnotationTest {
    public static void main(String[] args) {

    }

    @Test
    public void testGetAnnotation(){
        Class clazz = Student.class;
        Annotation[] annotations = clazz.getAnnotations();
        for(int i = 0;i < annotations.length;i++){
            System.out.println(annotations[i]);
        }
    }
}

@MyAnnotation(value = "hello")
class Person{
    private String name;
    private int age;

    public Person() {
        super();
    }

    @MyAnnotation
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @MyAnnotation
    public void walk(){
        System.out.println("学习中……");
    }
    public void eat(){
        System.out.println("摸鱼中……");
    }
}
