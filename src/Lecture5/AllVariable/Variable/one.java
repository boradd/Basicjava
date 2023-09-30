package Lecture5.AllVariable.Variable;

import Lecture5.Localvariable;

public class one {
    int a= 20; // Globale Variable

    static int b = 30; // Static Variable



    public static void main(String[] args) {
        Localvariable lv= new Localvariable();
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

