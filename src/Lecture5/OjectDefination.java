package Lecture5;

public class OjectDefination {
    //  If you want to use any state (variable)/behavior (method) inside main method
    // static-- we don't need to create the object
    // Non--Static we have to create object

    static int a= 12;

    int b= 20;
    int c=30;

    public static void main(String[] args) {
        OjectDefination ob = new OjectDefination();

        System.out.println(a);
        System.out.println(ob.b);
        System.out.println(ob.c);


    }
}
