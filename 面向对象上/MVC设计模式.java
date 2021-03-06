package 面向对象上;
/*
MVC是常用的设计模式之一，将整个程序分为三个层次：视图模型层，控制器层，与
数据模型层。这种将程序输入输出、数据处理，以及数据的展示分离开来的设计模式
使程序结构变的灵活而且清晰，同时也描述了程序各个对象间的通信方式，降低了程
序的耦合性。
模型层 model 主要处理数据
>数据对象封装 model.bean/domain
>数据库操作类 model.dao
>数据库 model.db
视图层 view 显示数据
>相关工具类 view.utils
>自定义view view.ui
控制层 controller 处理业务逻辑
>应用界面相关 controller.activity
>存放fragment controller.fragment
>显示列表的适配器 controller.adapter
>服务相关的 controller.service
>抽取的基类 controller.base

JDK中主要的包介绍
1. java.lang----包含一些Java语言的核心类，如String、Math、Integer、 System和
Thread，提供常用功能
2. java.net----包含执行与网络相关的操作的类和接口。
3. java.io ----包含能提供多种输入/输出功能的类。
4. java.util----包含一些实用工具类，如定义系统特性、接口的集合框架类、使用与日
期日历相关的函数。
5. java.text----包含了一些java格式化相关的类
6. java.sql----包含了java进行JDBC数据库编程的相关类/接口
7. java.awt----包含了构成抽象窗口工具集（abstract window toolkits）的多个类，这
些类被用来构建和管理应用程序的图形用户界面(GUI)。 B/S C/S

为使用定义在不同包中的Java类，需用import语句来引入指定包层次下所需要的类
或全部类(.*)。import语句告诉编译器到哪里去寻找类。
语法格式：
import 包名. 类名;

1. 在源文件中使用import显式的导入指定包下的类或接口
2. 声明在包的声明和类的声明之间。
3. 如果需要导入多个类或接口，那么就并列显式多个import语句即可
4. 举例：可以使用java.util.*的方式，一次性导入util包下所有的类或接口。
5. 如果导入的类或接口是java.lang包下的，或者是当前包下的，则可以省略此import语句。
6. 如果在代码中使用不同包下的同名的类。那么就需要使用类的全类名的方式指明调用的
是哪个类。
7. 如果已经导入java.a包下的类。那么如果需要使用a包的子包下的类的话，仍然需要导入。
8. import static组合的使用：调用指定类或接口下的静态的属性或方法

 */
public class MVC设计模式 {
}
