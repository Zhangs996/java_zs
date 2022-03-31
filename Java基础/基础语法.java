package Java基础;

import org.w3c.dom.ls.LSOutput;

import javax.swing.*;
import java.util.Scanner;

class 数据类型{
    //java数据类型：基本数据类型和引用数据类型
    /*
    基本数据类型：
    整型：byte(1B)，short(2B),int(4B),long(8B)；
    浮点型：float(4B)，double(8B)：
    字符型：char（2B）；
    布尔类型：true，false,占一位；
    引用数据类型：类class(字符串在这)，接口interface，数组array,都是4B；
    */
}
class 关键字{
    //关键字：
    /*
    用于定义数据类型的关键字：class,interface,enum,byte,short,int,long,float,double,char,boolean,void
    用于流程控制的关键字：if,else,switch,case,default,while,do,for,break,continue,return
    用于定义访问权限修饰符的关键字：private,protected,public
    用于定义类，函数，变量修饰符的关键字：abstract，final，static，synchronize
    用于定义类与类之间的关键字：extebds，implement
    用于定义实例及引用实例，判断实例的关键字：new，this，super，instanceof
    用于异常处理的关键字：try，catch，finally，throw，throws
    用于包的关键字：package，import
    其他：true，false，null，native，strictfp，transient，volatile，assert
    保留字：goto，const
    */
}
class 标识符{
    //自己起的名都是标识符
    /*
    1.由26个字母大小写，0-9，_或$组成
    2.数字不能开头
    3.不能有空格
    包名：xxxyyyzzz
    类名，接口名：XxxYyyZzz
    变量名，方法名：xxxYyyZzz
    常量名：XXX_YYY_ZZZ
    */
}
class 基础语法 {
        //byte,short,char->int->long->float->double,当byte，short，char做运算时，结果为int
        //第一位是符号位
        //byte 1个字节 范围：-128-127(-2^7-2^7-1)
        byte a = 127;
        //short 2个字节 范围： -32768-32767(-2^15-2^15-1)
        short b = 100;
        //int 4个字节 范围：-2^31-2^31-1
        int c = 5;
        //long 8个字节，声明时以l or L结尾
        long d = 89l;long e = 89L;
        //java默认的浮点型是double，声明float时必须使用f or F，float和double用的是科学计数法表示，float表示的范围比long还大
        //通常用double
        float f = 12.3f;
        //定义char用单引号
        char c1 = 'a';char c2 = '张';char c3 = '\n';char c4 = '\u0123';//unicode字符
        //ASCIIS码 a是97，A是65，ASCIIS和Unicode是过渡性质的编码系统，后来真正实施的是utf-8，英文是1个字节，中文是3个字节
        //命令行是gbk的
        boolean t = true;
}
class 类型转换{
    /*
    基本类型转换
    string不是基本数据类型，是引用类型，可以跟其他8种类型做运算，且运算只能是连接，其他的+均是加法
    byte,short,char->int->long->float->double,当byte，short，char做运算时，结果为int
    容量小的类型和容量大的做运算，结果自动为容量大的
    char,short,byte之间做运算结果是int
    强制类型转换
    int a1 = (int)90.9,输出是90(截断)。

    int a2 = 128
    byte a3 = (byte)a2,输出是-128

    long a4 = 13456，正确，默认int，强转long
    long a4 = 1234567894564565,错误，超出int范围

    byte+int = int
     */
}
class 进制转换{
    /*
    二进制：0B或0b开头
    八进制：0开头
    十六进制：0X或0x开头
     */
}
class 基本语句{
    Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Next方式接收");
        if (scanner.hasNext() || scanner.hasNextLine()){
            String str = scanner.next();
            System.out.println("输入内容"+str);
            String str2 = scanner.nextLine();
            System.out.println("输入内容"+str2);
            /*next()方法在读取内容时，会过滤掉有效字符前面的无效字符，对输入有效字符之前遇到的空格键、Tab键或Enter键等结束符，
            next()方法会自动将其过滤掉；只有在读取到有效字符之后，next()方法才将其后的空格键、Tab键或Enter键等视为结束符；所以next()方法不能得到带空格的字符串。
            nextLine()方法字面上有扫描一整行的意思，它的结束符只能是Enter键，即nextLine()方法返回的是Enter键之前没有被读取的所有字符，它是可以得到带空格的字符串的。*/
            switch("expression"){
                case "expression" :
                    //语句
                    break; //可选
                case "value1" :
                    //语句
                    break; //可选
                //你可以有任意数量的case语句
                default : //可选
                    //语句
            }
            /*
            switch 语句中的变量类型可以是： byte、short、int 或者 char。从 Java SE 7 开始，switch 支持字符串 String 类型了，同时 case 标签必须为字符串常量或字面量。
            switch 语句可以拥有多个 case 语句。每个 case 后面跟一个要比较的值和冒号。
            case 语句中的值的数据类型必须与变量的数据类型相同，而且只能是常量或者字面常量。
            当变量的值与 case 语句的值相等时，那么 case 语句之后的语句开始执行，直到 break 语句出现才会跳出 switch 语句。
            当遇到 break 语句时，switch 语句终止。程序跳转到 switch 语句后面的语句执行。case 语句不必须要包含 break 语句。如果没有 break 语句出现，程序会继续执行下一条 case 语句，直到出现 break 语句。
            switch 语句可以包含一个 default 分支，该分支一般是 switch 语句的最后一个分支（可以在任何位置，但建议在最后一个）。default 在没有 case 语句的值和变量值相等的时候执行。default 分支不需要 break 语句。
            switch case 执行时，一定会先进行匹配，匹配成功返回当前 case 的值，再根据是否有 break，判断是否继续输出，或是跳出判断。
            如果 case 语句块中没有 break 语句时，JVM 并不会顺序输出每一个 case 对应的返回值，而是继续匹配，匹配不成功则返回默认 case。
            如果当前匹配成功的 case 语句块没有 break 语句，则从当前 case 开始，后续所有 case 的值都会输出，如果后续的 case 语句块有 break 语句则会跳出判断。
            */

            //for循环的使用技巧
            int[] numbers = {10,20,30};
            for (int x:numbers){
                System.out.println(x);
            }
        }
        scanner.close();

        //带标签的break和continue的使用
        label: for(int i =0;i<6;i++){
            for(int j=1;j<8;j++){
                if(j % 7 == 0){
                    continue label;//结束制定标识的for循环
                    //break label;
                }
                System.out.println(j);
            }
            System.out.println(i);
        }
    }
}
class 数组1 {

    //一维数组的声明和初始化
    //如何调用数组的元素
    //如何获取数组长度，如何遍历数组
    //数组的初始默认值
    //数组的内存解析

    //数组基本元素引用数据类型时，null
    public static void main(String[] args) {
        int num;//声明
        num = 10;//初始化
        int id = 10;//声明加初始化

        int[] ids;//声明
        //1.1静态初始化
        ids = new int[]{1001, 1002, 1003, 1004};
        //1.2动态初始化
        String[] names = new String[5];
        System.out.println(names[1]);//null
        //数组初始化完成后，长度就确定下来了
        //获取数组长度，用数组的length属性
        System.out.println(names.length);//5

        //数组元素的默认初始化值
        String[] arr = new String[5];//arr在stack中，mew的结构在堆里，
        arr[1] = "刘德华";//刘德华存在常量池
        // 在堆空间连续表示，堆会把new出来的首地址值赋给arr，栈空间会根据地址值找到堆中的数值
        // 字符串数组的默认null，整型数组默认是0，char数组默认是0
        // 浮点型数组的初始化是0.0，boolean数组初始化是false
        arr = new String[3];//此时arr会指向新的数组了。
        //堆空间如果没有栈空间指向，在某个时间，会进行垃圾回收，如new String[5]会被回收

        //数组的内存解析
        //栈stack,堆heap和方法区。方法区里有常量池和静态域。
        //栈stack存的是局部变量，堆heap存的是new出来的结构(数组和对象)

        //多维数组
        //二维数组
        int[][] arr1 = {{1, 2, 3}, {2, 5, 7, 8, 9}};//一维数组不能省略new int
        int[][] arr2 = new int[][]{{1, 2, 3}, {2, 5, 7, 8, 9}};
        String[][] arr3 = new String[4][5];
        String arr4[][] = new String[4][];
        String[][] arr5 = new String[4][];
        arr5[0] = new String[5];
        int[] arr1_1 = {1, 2, 3, 4};
        System.out.println(arr2[1][2]);//7
        System.out.println(arr3[1][3]);//null

//      错误写法
//      int[] arr1_2;
//      arr1_2 = {1,2,3,4};
//      String[][] arr5 = new String[][];
        int[][] arr_ = new int[3][];
        //第一行
        arr_[0] = new int[7];//相当于int[] a=new int[3]
        for (int i = 0; i < arr_[0].length; i++) {
            arr_[0][i] = i + 1;
        }
        //第二行
        arr_[1] = new int[4];
        for (int i = 0; i < arr_[1].length; i++) {
            arr_[1][i] = i + 1;
        }
        //第三行
        arr_[2] = new int[8];
        for (int i = 0; i < arr_[2].length; i++) {
            arr_[2][i] = i + 1;
        }
        //遍历数组
        for (int i = 0; i < arr_.length; i++) {
            for (int j = 0; j < arr_[i].length; j++) {
                System.out.print(arr_[i][j]);
            }
            System.out.println();
        }
        /*
        1234567
        1234
        12345678
        */
        int array1[][] = new int[][]{{1, 2, 1, 1, 2}, {1, 2, 3}, {2, 4}, {1, 2, 3}, {1}};
        int array2[][] = new int[5][];
        if (array1[0].length == array1.length) {
            System.out.println("true");//true
        }
        int array3[][] = new int[4][5];
        System.out.println(array3);//地址值,二维,[[I@3f99bd52
        System.out.println(array3[0]);//地址值[I@31befd9f
        //定义一个int类型数组，包含十个元素，分别赋一些随机整数
        //然后求出最大值，最小值，平均值，和值，并输出出来
        //要求，所有随机数都是两位数
        int arry[] = new int[10];
        //Math.random()得到[0,1),如果想得到[a,b]之间的数，(Math.random()*(b-a+1))+10
        for (int i=0;i<arry.length;i++){
            arry[i] = (int)(Math.random()*91+10);
        }
        //求最大值
        int maxValue = arry[0];
        for (int i=0;i<arry.length;i++){
            System.out.println(arry[i]);
            if(arry[i]>maxValue){
                maxValue = arry[i];
            }
        }
        //数组的复制，反转，查找
        int []arry2 = arry;
        for(int j =0;j<arry2.length;j++){
            System.out.println(arry2[j]);//和arry一样
        }
        //数组反转,方法1
        for(int j =0;j<arry2.length/2;j++){
            int temp = arry[j];
            arry[j] = arry[arry.length-j-1];
            arry[arry.length-j-1] = temp;
        }
        //数组反转,方法2
        for(int i =0,j=arry2.length-1;i<j;i++,j--){
            int tmp = arry2[i];
            arry2[i] = arry2[j];
            arry2[j] = tmp;
        }
        //数组查找，二分查找
        int array4[] = new int[]{0,1,2,3,4,5,6,77,88,100};
        int dest = 2;//要查找的值
        int head = 0;//初始首索引
        int end = array4.length-1;//初始末索引
        while (head < end){
            int middle = (head+end)/2;
            if (dest==array4[middle]){
                System.out.println("位置为"+middle);
                break;
            }else if(array4[middle]>dest){
                end = middle-1;
            }else {
                head = middle+1;
            }
        }
        //数组排序
        //冒泡排序
        //快速排序
    }

}

