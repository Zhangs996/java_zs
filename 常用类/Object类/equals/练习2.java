package 常用类.Object类.equals;

/*
 * 请根据以下代码自行定义能满足需要的MyDate类,在MyDate类中覆盖equals方法，
 * 使其判断当两个MyDate类型对象的年月日都相同时，结果为true，否则为false。
 * public boolean equals(Object o)
 */
public class 练习2 {
    public static void main(String[] args) {
        MyDate m1= new MyDate(14, 3, 1976);
        MyDate m2= new MyDate(14, 3, 1976);
        if(m1== m2) {
            System.out.println("m1==m2");
        } else{
            System.out.println("m1!=m2"); // m1 != m2
        }

        if(m1.equals(m2)) {
            System.out.println("m1 is equal to m2");// m1 is equal to m2
        } else{
            System.out.println("m1 is not equal to m2");
        }
    }
}

class MyDate{
    private int day;
    private int month;
    private int year;

    public MyDate(int day, int month, int year) {
        super();
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }


    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj){
            return true;
        }
        if(obj instanceof MyDate){
            MyDate myDate = (MyDate)obj;
            return this.day == myDate.day && this.month == myDate.month && this.year == myDate.year;
        }else {
            return false;
        }
    }

//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		MyDate other = (MyDate) obj;
//		if (day != other.day)
//			return false;
//		if (month != other.month)
//			return false;
//		if (year != other.year)
//			return false;
//		return true;
//	}

}

