package Java基础;
/*
关于变量的赋值:*
    如果变量是基本数据类型，此时赋值的是变量所保存的数据值。
    如果变量是引用数据类型，此时赋值的是变量所保存的数据的地址值。
 */
public class 参数传递 {
    public static void main(String[] args) {
        Person obj = new Person();
        obj.age = 5;
        System.out.println("修改之前age = " + obj.age);// 5 // x是实参
        change(obj);
        System.out.println("修改之后age = " + obj.age);// 5
        change1(obj);

        int[] arr = new int[]{1,2,3};
        System.out.println(arr);//地址值
        char[] arr1 = new char[]{'a','b','c'};
        System.out.println(arr1);//abc

    }
    public static void change(Person obj) {
        obj = new Person();
        System.out.println("change:修改之前age = " + obj.age);//0
        obj.age = 3;
        System.out.println("change:修改之后age = " + obj.age);//5
    }
    public static void change1(Person obj) {
        System.out.println("change:修改之前age = " + obj.age);//5
        obj.age = 3;
        System.out.println("change:修改之后age = " + obj.age);//3
    }
}
class Person{
    int age;
}