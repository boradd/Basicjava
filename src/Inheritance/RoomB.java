package Inheritance;

public class RoomB extends RoomA {

    static int a=10;
    static int b=30;
    static int c=50;


    public static void House(){
        System.out.println("parent will give to child");
    }
    public static void Farmhouse(){
        System.out.println("parent will give to second child");
    }
    public static void Land(){
        System.out.println("parent will give half to each child");
    }



    public static void main(String[] args) {
        System.out.println(q);
        papa();
        System.out.println(w);
        Mummy();
        System.out.println(e);
        parent();

    }
}
