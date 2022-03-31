package 面向对象中.多态性.向下转型;;

public class Woman extends Person {

    boolean isBeauty;

    public void goShopping(){
        System.out.println("女人喜欢购物");
    }

    public void eat(){
        System.out.println("女人少吃，为了减肥。");
    }

    public void walk(){
        System.out.println("女人，窈窕的走路。");
    }
}

