package 面向对象下.ArrayUtil;

/*
 * 自定义数组工具类
 */
public class ArrayUtil {

    // 求数组的最大值
    public static int getMax(int[] arr) {
        int maxValue = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (maxValue < arr[i]) {
                maxValue = arr[i];
            }
        }
        return maxValue;
    }

    // 求数组的最小值
    public static int getMin(int[] arr) {
        int minValue = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (minValue > arr[i]) {
                minValue = arr[i];
            }
        }
        return minValue;
    }

    // 求数组总和
    public static int getSum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    // 求数组平均值
    public static int getAvg(int[] arr) {
        int avgValue = getSum(arr) / arr.length;
        return avgValue;
    }

    //如下两个同名方法构成重载
    // 反转数组
    public static void reverse(int[] arr) {
        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = temp;
        }
    }

    public void reverse(String[] arr){

    }

    // 复制数组
    public static int[] copy(int[] arr) {
        int[] arr1 = new int[arr.length];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = arr[i];
        }
        return null;
    }

    // 数组排序
    public static void sort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
//					int temp = arr[j];
//					arr[j] = arr[j + 1];
//					arr[j + 1] = temp;
                    //错误的：
//					swap(arr[j],arr[j+1]);

                    swap(arr,j ,j+1);
                }
            }
        }
    }

    //错误的:交换数组中两个指定位置元素的值
//	public void swap(int i,int j){
//		int temp = i;
//		i = j;
//		j = temp;
//	}

    //正确的：
    private static void swap(int[] arr,int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    // 遍历数组
    public static void print(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ",");
        }
        System.out.println("]");
    }

    // 查找指定元素
    public static int getIndex(int[] arr, int dest) {
        //线性查找
        for (int i = 0; i < arr.length; i++) {

            if (dest==arr[i]) {
                return i;
            }

        }
        return -1;
    }

}
