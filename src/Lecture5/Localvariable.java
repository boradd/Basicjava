package Lecture5;

public class Localvariable {
    int a= 20; // Globale Variable

    static int b = 30; // Static Variable



    public static void main(String[] args) {
        Localvariable lv= new Localvariable();
        System.out.println(lv.a);
        System.out.println(b);




    }

    public void Oxfordcircus(){
        int a=30; // Local Variable
        System.out.println(a);
        System.out.println(b);


    }

    public void Bakerstreet(){
        System.out.println(a);
        System.out.println(b);


    }

}

