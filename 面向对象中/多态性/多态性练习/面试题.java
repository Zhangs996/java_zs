package 多态性.多态性练习;

/* 考查多态的笔试题目：
 * 面试题：多态是编译时行为还是运行时行为？如何证明？
 *
 * 拓展问题
 */
public class 面试题 {

    public static void main(String[] args) {
        Base2 base = new Sub2();
        base.add(1, 2, 3);//sub1

//		Sub s = (Sub)base;
//		s.add(1,2,3);
    }
}

class Base2 {
    public void add(int a, int... arr) {
        System.out.println("base");
    }
}

class Sub2 extends Base2 {

    public void add(int a, int[] arr) {
        System.out.println("sub_2");
    }

	public void add(int a, int b, int c) {
		System.out.println("sub_1");
	}

}

