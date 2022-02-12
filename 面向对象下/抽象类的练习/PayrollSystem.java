package 面向对象下.抽象类的练习;

import java.util.Scanner;

public class PayrollSystem {
    public static void main(String[] args) {
        //new 的是数组，不是employee对象
        Employee[] employees = new Employee[]{new SalariedEmployee("zhangshuo",1001,new MyDate(2001,12,3),12),
                                                new HourlyEmployee("wang",3,new MyDate(2001,12,3))};

        Scanner in = new Scanner(System.in);
        System.out.println("请输入号码");
        if(in.hasNext()){
            int a1 = in.nextInt();
            switch (a1){
                case 1:
                    System.out.println(employees[0].toString());
                    break;
                case 2:
                    System.out.println(employees[1].toString());
                    break;
                default:
                    break;
            }
        }
        in.close();

    }
}
