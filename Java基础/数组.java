package Java基础;
import org.apache.commons.lang3.ArrayUtils;

import java.util.*;
public class 数组{
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
        ids = new int[]{1001,1002,1003,1004};
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
        int[][] arr1 = {{1,2,3},{2,5,7,8,9}};//一维数组不能省略new int
        int[][] arr2 = new int[][]{{1,2,3},{2,5,7,8,9}};
        String[][] arr3 = new String[4][5];
        String arr4[][] = new String[4][];
        String[][] arr5 = new String[4][];
        arr5[0] = new String[5];
        int[] arr1_1 = {1,2,3,4};
        System.out.println(arr2[1][2]);//7
        System.out.println(arr3[1][3]);//null

//      错误写法
//      int[] arr1_2;
//      arr1_2 = {1,2,3,4};
//      String[][] arr5 = new String[][];
        int [][]arr_=new int[3][];
        //第一行
        arr_[0]=new int[7];//相当于int[] a=new int[3]
        for(int i=0;i<arr_[0].length;i++){
            arr_[0][i]=i+1;
        }
        //第二行
        arr_[1]=new int[4];
        for(int i=0;i<arr_[1].length;i++){
            arr_[1][i]=i+1;
        }
        //第三行
        arr_[2]=new int[8];
        for(int i=0;i<arr_[2].length;i++){
            arr_[2][i]=i+1;
        }
        //遍历数组
        for(int i=0;i<arr_.length;i++){
            for(int j=0;j<arr_[i].length;j++){
                System.out.print(arr_[i][j]);
            }
            System.out.println();
        }
        /*
        1234567
        1234
        12345678
        */
        int array1[][] = new int[][]{{1,2,1,1,2},{1,2,3},{2,4},{1,2,3},{1}};
        int array2[][] = new int[5][];
        if (array1[0].length == array1.length){
            System.out.println("true");//true
        }

    }
}
class 冒泡排序{
    public void bubbleSort(String[] arry) {
        //冒泡排序，依次比较相邻元素，大的往右移，每一次循环，最大的都在最右侧
        int bubbleSort[] = new int[]{2, 5, 1, 6, 4, 8, 3, 7, 9};
        for (int i = 0; i < bubbleSort.length - 1; i++) {
            for (int j = 0; j < bubbleSort.length - 1 - i; j++) {
                if (bubbleSort[j] > bubbleSort[j + 1]) {
                    int temp = bubbleSort[j];
                    bubbleSort[j] = bubbleSort[j + 1];
                    bubbleSort[j + 1] = temp;
                }
            }
        }
    }
}
class 插入排序{
    public static void insertSort(int[] arry) {
        if (arry.length >= 2) {
            for (int i = 1; i < arry.length; i++) {
                //挖出一个要用来插入的值,同时位置上留下一个可以存新的值的坑
                int x = arry[i];
                int j = i - 1;
                //在前面有一个或连续多个值比x大的时候,一直循环往前面找,将x插入到这串值前面
                while (j >= 0 && arry[j] > x) {
                    //当arr[j]比x大的时候,将j向后移一位,正好填到坑中
                    arry[j + 1] = arry[j];
                    j--;
                }
                //将x插入到最前面
                arry[j + 1] = x;
            }
        }
    }
}
class 快速排序{
    //快速排序
   public static void quikSort(int[] arr, int begin, int end) {
        int a = begin;
        int b = end;
        //先判断a是否大于b

        if (a >= b) {
            //没必要排序
            return;
        }
        //基准数,默认设置为第一个值
        int x = arr[a];

        //循环
        while (a < b) {
            //从后往前找,找到一个比基准数x小的值,赋给arr[a]
            //如果a和b的逻辑正确--a<b ,并且最后一个值arr[b]>x,就一直往下找,直到找到后面的值大于x
            while (a < b && arr[b] >= x) {
                b--;
            }
            //跳出循环,两种情况,一是a和b的逻辑不对了,a>=b,这时候排序结束.二是在后面找到了比x小的值
            if (a < b) {
                //将这时候找到的arr[b]放到最前面arr[a]
                arr[a] = arr[b];
                //排序的起始位置后移一位
                a++;
            }

            //从前往后找,找到一个比基准数x大的值,放在最后面arr[b]
            while (a < b && arr[a] <= x) {
                a++;
            }
            if (a < b) {
                arr[b] = arr[a];
                //排序的终止位置前移一位
                b--;
            }
        }
        //跳出循环 a < b的逻辑不成立了,a==b重合了,此时将x赋值回去arr[a]
        arr[a] = x;
        //调用递归函数,再细分再排序
        quikSort(arr, begin, a - 1);
        quikSort(arr, a + 1, end);
    }
}
class 选择排序{
    public static void selectSort(int[] arr){
        for(int i = 0; i < arr.length - 1 ; i++){
            int min = i; // 遍历的区间最小的值
            for (int j = i + 1; j < arr.length ;j++){
                if(arr[j] < arr[min]){
                    // 找到当前遍历区间最小的值的索引
                    min = j;
                }
            }
            if(min != i){
                // 发生了调换
                int temp =  arr[min];
                arr[min] = arr[i];
                arr[i] = temp;
            }
        }
    }
}
class ArraysClass{

    public static void main(String[] args) {
        //Arrays.fill(); //填充数组
        int[] arr = new int[5];//新建一个大小为5的数组
        Arrays.fill(arr, 2,4,6);//给第2位（0开始）到第4位（不包括）赋值6
        String str = Arrays.toString(arr); // Arrays类的toString()方法能将数组中的内容以字符串形式打印出来,方法信息：public static String toString(Array[] array)参数为数组,将数组按照默认格式输出为字符串
        System.out.print(str);//输出：[0, 0, 6, 6, 0]
        //sort排序
        int[] intArray1 = new int[] { 4, 1, 3, -23 };
        Arrays.sort(intArray1);//输出： [-23, 1, 3, 4]
        String[] strArray = new String[] {"z","a","C"}; //字符串排序，先大写后小写
        Arrays.sort(strArray);
        System.out.println(strArray.toString());//输出： [C, a, z]
        //严格按字母表顺序排序，也就是忽略大小写排序 CASE_INSENSITIVE_ORDER
        Arrays.sort(strArray, String.CASE_INSENSITIVE_ORDER);//输出： [a, C, z]
        //反向排序， reverseOrder sort
        Arrays.sort(strArray, Collections.reverseOrder());//输出：[z, a, C]
        //忽略大小写反向排序 Case-insensitive reverse-order sort
        Arrays.sort(strArray, String.CASE_INSENSITIVE_ORDER);
        Collections.reverse(Arrays.asList(strArray));//输出： [z, C, a]
        //选择数组指定位置进行排序
        int[] arrk = {3,2,1,5,4};
        Arrays.sort(arrk,0,3);//给第0位（0开始）到第3位（不包括）排序
        String strk = Arrays.toString(arrk); // Arrays类的toString()方法能将数组中的内容全部打印出来
        System.out.print(strk);//输出：[1, 2, 3, 5, 4]
        //Arrays.equals(); //比较数组元素是否相等
        int[] arr1 = {1,2,3};
        int[] arr2 = {1,2,3};
        System.out.println(Arrays.equals(arr1,arr2));
        //输出：true
        //如果是arr1.equals(arr2),则返回false，因为equals比较的是两个对象的地址，不是里面的数，而Arrays.equals重写了equals，所以，这里能比较元素是否相等。

        //Arrays.binarySearch(); //二分查找法找指定元素的索引值（下标）数组一定是排好序的，否则会出错。找到元素，只会返回最后一个位置
        int []arrq = {10,20,30,40,50};
        System.out.println(Arrays.binarySearch(arrq, 0,3,30));
        //输出：2 （从0到3位（不包括）找30，找到了，在第2位，返回2）

        //Arrays.copeOf() 和Arrays.copeOfRange(); //截取数组
        int []arrx = {10,20,30,40,50};
        int []arry = Arrays.copyOfRange(arrx,1,3);
        String strx = Arrays.toString(arrx); // Arrays类的toString()方法能将数组中的内容全部打印出来
        System.out.print(strx);
        //输出：[20, 30] （从第1位（0开始）截取到第3位（不包括）


        String[] Array1 = new String[5];
        String[] Array2 = {"a","b","c", "d", "e"};
        String[] Array3 = new String[]{"a","b","c","d","e"};
        int[] intArray = { 1, 2, 3, 4, 5 };
        String intArrayString = Arrays.toString(intArray);

        System.out.println(intArray);// [I@7150bd4d
        System.out.println(intArrayString);// [1, 2, 3, 4, 5]

        String[] stringArray = { "a", "b", "c", "d", "e" };
        //将数组转换为ArrayList<String>此方法同Collection.toArray() 一起，充当了基于数组的 API 与基于 collection 的 API 之间的桥梁。
        //Arrays.asList(T...a)返回List<T>类型数据，同时可以将该集合当参数传入实例化具体的集合
        ArrayList<String> arrayList = new ArrayList<String>(Arrays.asList(stringArray));
        System.out.println(arrayList);//输出[a, b, c, d, e]
        //转换为HashSet<String>
        Set<String> set = new HashSet<String>(Arrays.asList(stringArray));
        System.out.println(set);//输出[d, e, b, c, a]

        //ArrayList转换为数组,这里用的集合自带的Collection.toArray()方法
        String[] array1 = { "a", "b", "c", "d", "e" };
        ArrayList<String> arrayList1 = new ArrayList<String>(Arrays.asList(array1));
        String[] stringArr = new String[arrayList1.size()];
        arrayList1.toArray(stringArr);
        for (String s : stringArr)
            System.out.println(s);

        //合并两个数组
        int[] intArray3 = { 1, 2, 3, 4, 5 };
        int[] intArray4 = { 6, 7, 8, 9, 10 };
        // Apache Commons Lang 库
        int[] combinedIntArray = ArrayUtils.addAll(intArray3, intArray4);

        //数组的反转
        ArrayUtils.reverse(intArray);
        System.out.println(Arrays.toString(intArray));

        //移除元素
        int[] removed = ArrayUtils.removeElement(intArray, 3);//创建新的数组
        System.out.println(Arrays.toString(removed));

    }
}
/*
关于 ==
当使用 == 判断基本数据类型（byte,short,int,float,long,double,char,boolean）的变量时， == 号判断的是两个变量的值是否相等。
当使用 == 判断引用数据类型时， == 号判断的是两个引用变量所指向的地址是否相等。
关于 equals()
equals()方法是超类Object的一个方法()，所有JAVA的类都继承于Object，意味着所有JAVA的类都有equals()这个方法，所以equals()方法不用于比较主数据类型，而是比较引用类型的。
Object类型定义equals()方法比较的是两个引用所指向的地址，所以如果一个类没有重写equals()方法，使用equals()方法的就是比较两个引用所指向的对象的地址。
如果自定义的类要比较两个该类对象的属性是否相等，一般会重写equals()方法。Java的封装比如String重写了equals()这个方法，使得equals()比较的是字符串内容而不是地址，又比如Integer封装类比较的是值也不是地址。
0 */
class ArrayException{
    /*
    1. java.lang.NullPointerException(空指针异常)
    调用了未经初始化的对象或者是不存在的对象
    经常出现在创建图片，调用数组这些操作中，比如图片未经初始化，或者图片创建时的路径错误等等。对数组操作中出现空指针，
    即把数组的初始化和数组元素的初始化混淆起来了。数组的初始化是对数组分配需要的空间，而初始化后的数组，其中的元素并没有实例化，
    依然是空的，所以还需要对每个元素都进行初始化(如果要调用的话)。

    2. java.lang.ClassNotFoundException
    指定的类不存在
    这里主要考虑一下类的名称和路径是否正确即可，通常都是程序试图通过字符串来加载某个类时可能引发 异常
    比如：调用Class.forName();
    或者调用ClassLoad的finaSystemClass();或者LoadClass();

    3. java.lang.NumberFormatException
    字符串转换为数字异常
    当试图将一个String转换为指定的数字类型，而该字符串确不满足数字类型要求的格式时，抛出该异常.如现在讲字符型的数据“123456”转换为数值型数据时，是允许的。
    但是如果字符型数据中包含了非数字型的字符，如123#56，此时转换为数值型时就会出现异常。系统就会捕捉到这个异常，并进行处理.

    4. java.lang.IndexOutOfBoundsException
    数组下标越界异常
    查看调用的数组或者字符串的下标值是不是超出了数组的范围，一般来说，显示(即直接用常数当下标)调用不太容易出这样的错，但隐式(即用变量表示下标)调用就经常出错了，还有一种情况，是程序中定义的数组的长度是通过某些特定方法决定的，不是事先声明的，这个时候，最好先查看一下数组的length，以免出现这个异常。

    5. java.lang.IllegalArgumentException
    方法的参数错误
    比如g.setColor(int red,int green,int blue)这个方法中的三个值，如果有超过２５５的也会出现这个异常，因此一旦发现这个异常，我们要做的，就是赶紧去检查一下方法调用中的参数传递是不是出现了错误。

    6. java.lang.IllegalAccessException
    没有访问权限
    当应用程序要调用一个类，但当前的方法即没有对该类的访问权限便会出现这个异常。对程序中用了Package的情况下要注意这个异常

    7. java.lang.ArithmeticException
    数学运算异常
    当算术运算中出现了除以零这样的运算就会出这样的异常。

    8. java.lang.ClassCastException
    数据类型转换异常
    当试图将对某个对象强制执行向下转型，但该对象又不可转换又不可转换为其子类的实例时将引发该异常，如下列代码。
    Object obj = new Integer(0);
    String str = obj;

    9. java.lang.FileNotFoundException
    文件未找到异常
    当程序试图打开一个不存在的文件进行读写时将会引发该异常。该异常由FileInputStream,FileOutputStream,RandomAccessFile的构造器声明抛出
    即使被操作的文件存在，但是由于某些原因不可访问，比如打开一个只读文件进行写入，这些构造方法仍然会引发异常

    10. java.lang.ArrayStoreException
    数组存储异常
    当试图将类型不兼容类型的对象存入一个Object[]数组时将引发异常
    Object[] obj = new String[3];
    obj[0] = new Integer(0);

    11. java.lang.NoSuchMethodException
    方法不存在异常
    当程序试图通过反射来创建对象，访问(修改或读取)某个方法，但是该方法不存在就会引发异常
    12. java.lang.NoSuchFiledException
    方法不存在异常
    当程序试图通过反射来创建对象，访问(修改或读取)某个filed，但是该filed不存在就会引发异常

    13. java.lang.EOFException
    文件已结束异常
    当程序在输入的过程中遇到文件或流的结尾时，引发异常。因此该异常用于检查是否达到文件或流的结尾

    14. java.lang.InstantiationException
    实例化异常
    当试图通过Class的newInstance()方法创建某个类的实例,但程序无法通过该构造器来创建该对象时引发
    Class对象表示一个抽象类，接口，数组类，基本类型
    该Class表示的类没有对应的构造器

    15：java.lang.InterruptedException 被中止异常 当某个线程处于长时间的等待、休眠或其他暂停状态，而此时其他的线程通过Thread的interrupt方法终止该线程时抛出该异常。
    16：java.lang.CloneNotSupportedException 不支持克隆异常 当没有实现Cloneable接口或者不支持克隆方法时,调用其clone()方法则抛出该异常。
    17：java.lang.OutOfMemoryException 内存不足错误 当可用内存不足以让Java虚拟机分配给一个对象时抛出该错误。
    18：java.lang.NoClassDefFoundException

    未找到类定义错误
    当Java虚拟机或者类装载器试图实例化某个类，而找不到该类的定义时抛出该错误。
    违背安全原则异常：SecturityException
    操作数据库异常：SQLException
    输入输出异常：IOException
    通信异常：SocketException
     */
    
}